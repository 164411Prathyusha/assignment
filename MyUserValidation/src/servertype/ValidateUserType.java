package servertype;

import java.io.IOException;
import java.io.PrintWriter;

import javax.management.loading.PrivateClassLoader;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prathyusha.reddy.InvalidException;

import usertype.InvalidUserException;
import usertype.UserDAO;

@WebServlet("/ValidateUserType")
public class ValidateUserType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter obj=response.getWriter();
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		String UserType="Invalid";
		RequestDispatcher requestDispatcher=null;
		if(UserType.equals("Admin")){
			obj.print("<h2>Welcome Admin"+Username+"</h2>");
		}
		else if(UserType.equals("User")){
			obj.print("<h2>Welcome User"+Username+"</h2>");
		}
		else{
			obj.print("<h2>Invalid"+Username+"</h2>");
		}
		requestDispatcher.forward(request, response);
		obj.print("<h2>This is your Page</h2>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	private String getUserType(String Username, String Password)throws InvalidUserException{
		UserDAO userDAO= new UserDAO();
		System.out.println(UserDAO.getUserType(Username,Password));
		return UserDAO.getUserType(Username,Password);
	}

}
