package co.mum.roommgt.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.mum.roommgt.dao.student.StudentDAO;
import co.mum.roommgt.model.Account;
import co.mum.roommgt.model.Student;
import co.mum.roommgt.model.Transaction;
import co.mum.roommgt.model.TransactionWrapper;

public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TransactionController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/json");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String transType = request.getParameter("transType");
		if (transType.equals(transType)) {

		}
		String jsonOutput = "";

		out.println(transType);
		out.flush();
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// https://stackoverflow.com/questions/3831680/httpservletrequest-get-json-post-data
		StringBuffer jb = new StringBuffer();
		String line = null;
		try {
			 
			// {'username':'joseph', 'password':'ppp'}
			Transaction obj = new Gson().fromJson(request.getReader().readLine(), Transaction.class);
			response.setContentType("text/json");
			response.setCharacterEncoding("UTF-8");

			PrintWriter out = response.getWriter();
			out.println(obj.getUsername());
			out.flush();
			out.close();
			
		} catch (Exception e) {
			System.out.println("Error parsing JSON request strin" + e.getMessage());
			throw new IOException("Error parsing JSON request string");
		}

	}

}
