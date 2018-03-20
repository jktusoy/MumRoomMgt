package co.mum.roommgt.dao.student;

import java.lang.Class;
import java.lang.reflect.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import co.mum.roommgt.model.Col;
import co.mum.roommgt.model.Student;
import co.mum.roommgt.model.StudentVM;
import co.mum.roommgt.util.DBUtil;
import co.mum.roommgt.util.DatabaseConnectionFactory;
import co.mum.roommgt.util.ReflectionUtil;

public class StudentDAO {

	private ResourceBundle rb;
	private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionFactory.class.getName());
	private static final String BUNDLE_PATH = "co.mum.roommgt.dao.student.bundle.student";

	public StudentDAO() {
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
	public List<Student> getStudents() {
		System.out.println("getStudents() invoked!");
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Student> studList = new ArrayList<Student>();
		
		try {
			con = DatabaseConnectionFactory.createConnection();
			pst = con.prepareStatement(rb.getString("getStudents"));
			rs = pst.executeQuery();
			// https://stackoverflow.com/questions/21956042/mapping-a-jdbc-resultset-to-an-object
			while (rs.next()) {
				Student sd = new Student();
				sd.setId(rs.getInt("Id"));
				sd.setName(rs.getString("Name"));
				sd.setLastName(rs.getString("LastName"));
				sd.setEmail(rs.getString("Email"));
				sd.setPhone(rs.getString("Phone"));
				sd.setSex(rs.getString("Sex"));
				sd.setNationality(rs.getString("Nationality"));
				sd.setRoleTypeId(rs.getInt("Role_Typeid"));
				sd.setAccountId(rs.getInt("AccountId"));
		        studList.add(sd);
			}
			 return studList;

		} catch (SQLException sqle) {
			LOGGER.fine("Error: method getStudents method!");
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeResultSet(rs);
			DBUtil.closeConnection(con);
		}
		return null;

	}

}
