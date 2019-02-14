package com.register.DAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConnectionFactory
 */
@WebServlet("/connection")
public class ConnectionFactory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnectionFactory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		 
		  String userName = request.getParameter("username");
		  String password = request.getParameter("password");
		  String email = request.getParameter("emailId");
		  String contact = request.getParameter("contact");
		  String address = request.getParameter("address");
		 
		  // validate given input
		  if (userName.isEmpty() || password.isEmpty() || email.isEmpty() || contact.isEmpty()) {
		   RequestDispatcher rd = request.getRequestDispatcher("Register.html");
		   out.println("<font color=red>Please fill all the fields</font>");
		   rd.include(request, response);
		  } else {
		   // inserting data into mysql database 
		   // create a test database and student table before running this to create table
		   //create table student(name varchar(100), userName varchar(100), pass varchar(100), addr varchar(100), age int, qual varchar(100), percent varchar(100), year varchar(100));
		   try {
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    // loads mysql driver

		    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1524:XE", "system", "orcl11g"); 

		    String query = "insert into customer values(?,?,?,?,?,?,?)";

		    PreparedStatement ps = con.prepareStatement(query); // generates sql query

		    ps.setString(2, userName);
		    ps.setString(3,password);
		    ps.setString(4,email );
		    ps.setString(5,contact);
		    ps.setString(6, address);
		   

		    ps.execute(query); // execute it on test database
		    System.out.println("successfuly inserted"+userName);
		    ps.close();
		    con.close();
		   } catch (ClassNotFoundException | SQLException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }
		   RequestDispatcher rd = request.getRequestDispatcher("register.html");
		   rd.forward(request, response);
		  }
		 }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
