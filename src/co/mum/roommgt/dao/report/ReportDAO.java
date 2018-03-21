package co.mum.roommgt.dao.report;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import co.mum.roommgt.model.RoomStatus;
import co.mum.roommgt.util.DBUtil;
import co.mum.roommgt.util.DatabaseConnectionFactory;

public class ReportDAO {

	private ResourceBundle rb;
	private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionFactory.class.getName());
	private static final String BUNDLE_PATH = "co.mum.roommgt.dao.report.bundle.report";

	public ReportDAO() {
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
	public List<RoomStatus> reportRoomStatusFilterByStatus(String status) {
		System.out.println("reportRoomStatusFilterByStatus invoked!");
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<RoomStatus> roomstatList = new ArrayList<RoomStatus>();

		try {
			con = DatabaseConnectionFactory.createConnection();
			pst = con.prepareStatement(rb.getString("reportRoomStatusFilterByStatus"));
			pst.setString(1, status);
			rs = pst.executeQuery();
			// https://stackoverflow.com/questions/21956042/mapping-a-jdbc-resultset-to-an-object
			while (rs.next()) {
				RoomStatus rd = new RoomStatus();
				rd.setBldgNumber(rs.getInt("building_number"));
				rd.setRoomNumber(rs.getInt("room_number"));
				rd.setOccupiedBy(rs.getString("occupiedby"));
				rd.setRoomStatus(rs.getString("Status"));
				rd.setOccupiedSince(rs.getString("Move_in_date"));
				rd.setNotes(rs.getString("Notes"));
				roomstatList.add(rd);
			}
			return roomstatList;

		} catch (SQLException sqle) {
			LOGGER.fine("Error: method getStudents method!" + sqle.getMessage());
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeResultSet(rs);
			DBUtil.closeConnection(con);
		}
		return null;
	}

	public List<RoomStatus> reportRoomStatus() {
		System.out.println("getStudents() invoked!");
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<RoomStatus> roomstatList = new ArrayList<RoomStatus>();

		try {
			con = DatabaseConnectionFactory.createConnection();
			pst = con.prepareStatement(rb.getString("reportRoomStatus"));
			rs = pst.executeQuery();
			// https://stackoverflow.com/questions/21956042/mapping-a-jdbc-resultset-to-an-object
			while (rs.next()) {
				RoomStatus rd = new RoomStatus();
				rd.setBldgNumber(rs.getInt("building_number"));
				rd.setRoomNumber(rs.getInt("room_number"));
				rd.setOccupiedBy(rs.getString("occupiedby"));
				rd.setRoomStatus(rs.getString("Status"));
				rd.setOccupiedSince(rs.getString("Move_in_date"));
				rd.setNotes(rs.getString("Notes"));
				roomstatList.add(rd);
			}
			return roomstatList;

		} catch (SQLException sqle) {
			LOGGER.fine("Error: method getStudents method!" + sqle.getMessage());
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeResultSet(rs);
			DBUtil.closeConnection(con);
		}
		return null;
	 

	}

}
