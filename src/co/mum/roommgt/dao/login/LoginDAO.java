/**
 * 
 */
package co.mum.roommgt.dao.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import co.mum.roommgt.model.ROLE_TYPE;
import co.mum.roommgt.util.DBUtil;
import co.mum.roommgt.util.DatabaseConnectionFactory;

/**
 * LoginDAO Description: 01/19/2018
 * 
 * @version 1.0 18 March 2018
 * @author William Chaparro
 */
public class LoginDAO {

	private ResourceBundle rb;
	private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionFactory.class.getName());
	private static final String BUNDLE_PATH = "co.mum.roommgt.dao.login.bundle.login";

	public LoginDAO() {
		super();
		LOGGER.setLevel(Level.FINE);
		rb = ResourceBundle.getBundle(BUNDLE_PATH);
	}

	/**
	 * 
	 * 
	 * 
	 * @param String
	 *            username
	 * @return boolean expression
	 */
	public boolean isValidUser(String username) {
		System.out.println("username: " + username);
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = DatabaseConnectionFactory.createConnection();
			pst = con.prepareStatement(rb.getString("isValidUser"));
			pst.setString(1, username);
			rs = pst.executeQuery();
			int i = 0;
			while (rs.next()) {
				i = 1;
			}
			if (i != 0) {
				return true;
			}
		} catch (SQLException sqle) {
			LOGGER.fine("Error: method isValidUser method!");
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeResultSet(rs);
			DBUtil.closeConnection(con);
		}
		return false;
	}

	/**
	 * 
	 * 
	 * 
	 * @param String
	 *            username
	 * 
	 * @return userType
	 */
	public ROLE_TYPE getUserType(String username) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = DatabaseConnectionFactory.createConnection();
			pst = con.prepareStatement(rb.getString("getUserType"));
			pst.setString(1, username);
			rs = pst.executeQuery();
			if (rs.next()) {
				int roleType = rs.getInt(1);
				switch (roleType) {
				case 1:
					return ROLE_TYPE.RESIDENT_ADVISOR;
				case 2:
					return ROLE_TYPE.RESIDENT_DIRECTOR;
				case 3:
					return ROLE_TYPE.STUDENT;
				default:
					return ROLE_TYPE.STUDENT;
				}
			}
		} catch (SQLException sqle) {
			LOGGER.fine("Error: method getUserType method!");
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeResultSet(rs);
			DBUtil.closeConnection(con);
		}
		return ROLE_TYPE.STUDENT;
	}

}
