package co.mum.roommgt.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.mum.roommgt.model.Account;
import co.mum.roommgt.util.DBUtil;
import co.mum.roommgt.util.DatabaseConnectionFactory;
import java.util.ResourceBundle;

/**
 * LoginController Description: Control the access to application Last Updated:
 * 01/19/2018
 * 
 * @version 1.0 18 March 2018
 * @author William Chaparro
 */

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionFactory.class.getName());
	private ResourceBundle rb;

	public LoginController() {
		super();
		LOGGER.setLevel(Level.FINE);
		rb = ResourceBundle.getBundle("sql");
		System.out.println("rb = ");
	}

	/**
	 * Servlet implementation in charge of validate users and redirect to home or
	 * login JSP pages.
	 * 
	 * @param arg
	 *            request object and response object.
	 * @exception Any
	 *                ServletException and IOException
	 * @return No return value.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("LoginController---");
		String homeStudent = getServletContext().getInitParameter("homeStudent");
		String homeDirector = getServletContext().getInitParameter("homeDirector");
		String login = getServletContext().getInitParameter("login");
		System.out.println("homeStudent: " + homeStudent);
		System.out.println("homeDirector: " + homeDirector);
		System.out.println("login: " + login);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (null != username && !username.equals("") && null != password && !password.equals("")) {
			Connection con = DatabaseConnectionFactory.createConnection();
			ResultSet rs = null;
			int i = 0;
			if (null != con) {
				System.out.println("Connection to the database OK");
				try {
					Statement st = con.createStatement();
					String sql = "SELECT userName,Password FROM roommgt.account where userName='" + username
							+ "' and Password='" + password + "' ";
					rs = st.executeQuery(sql);
					System.out.println(sql);
					while (rs.next()) {
						i = 1;
					}
					if (i != 0) {
						Account user = new Account(username, password);
						HttpSession session = request.getSession();
						session.setAttribute("user", user);
						RequestDispatcher rd = request.getRequestDispatcher(homeStudent);
						rd.forward(request, response);
					} else {
						request.setAttribute("errorMessage", "Invalid username or password");
						RequestDispatcher rd = request.getRequestDispatcher(login);
						rd.forward(request, response);
					}
				} catch (SQLException sqle) {
					DBUtil.closeResultSet(rs);
					DBUtil.closeConnection(con);
				} finally {
					DBUtil.closeResultSet(rs);
					DBUtil.closeConnection(con);
				}
			} else {
				request.setAttribute("errorMessage", "Error Connecting to the Database");
				RequestDispatcher rd = request.getRequestDispatcher(login);
				rd.forward(request, response);
				LOGGER.fine("Error: Error Connecting to the Database!");
			}
		} else {
			request.setAttribute("errorMessage", "Invalid username or password");
			RequestDispatcher rd = request.getRequestDispatcher(login);
			rd.forward(request, response);
			LOGGER.fine("Error: Invalid username or password!");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
