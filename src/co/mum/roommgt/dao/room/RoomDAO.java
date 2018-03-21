/**
 * 
 */
package co.mum.roommgt.dao.room;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import co.mum.roommgt.model.Room;
import co.mum.roommgt.util.DBUtil;
import co.mum.roommgt.util.DatabaseConnectionFactory;

/**
 * LoginDAO Description: 01/19/2018
 * 
 * @version 1.0 18 March 2018
 * @author William Chaparro
 */
public class RoomDAO {

	private ResourceBundle rb;
	private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionFactory.class.getName());
	private static final String BUNDLE_PATH = "co.mum.roommgt.dao.room.bundle.room";

	public RoomDAO() {
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
	 * @return Collection of Rooms objects
	 */
	public List<Room> getRoomsByDirector(int buildingNumber) {
		System.out.println("***getRoomsByDirector - buildingNumber***"+buildingNumber);
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Room> roomList = new ArrayList<>();
		try {
			con = DatabaseConnectionFactory.createConnection();
			pst = con.prepareStatement(rb.getString("getRoomsByDirector"));
			pst.setInt(1, buildingNumber);
			rs = pst.executeQuery();
			while (rs.next()) {
				Room room = new Room();
				room.setId(rs.getInt("Id"));
				room.setStatus(rs.getString("Status"));
				room.setFrame(rs.getString("Frame"));
				room.setMattress(rs.getString("Mattress"));
				room.setDesk(rs.getString("Desk"));
				room.setChair(rs.getString("Chair"));
				room.setBookshelf(rs.getString("Bookshelf"));
				room.setDresser(rs.getString("Dresser"));
				room.setWasteBasket(rs.getString("Wastebasket"));
				room.setRecycleBin(rs.getString("Recycle_bin"));
				room.setArrivalId(rs.getInt("ArrivalId"));
				room.setDepartureId(rs.getInt("DepartureId"));
				room.setRoom_number(rs.getString("room_number"));
				room.setBuilding_number(rs.getString("building_number"));
				room.setLast_Updated_By(rs.getString("Last_Updated_By"));
				room.setNotes(rs.getString("notes"));
				roomList.add(room);
			}
		} catch (SQLException sqle) {
			LOGGER.fine("Error: method getRoomsByDirector method!" + sqle.getMessage());
		} finally {
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeResultSet(rs);
			DBUtil.closeConnection(con);
		}
		return roomList;
	}

}
