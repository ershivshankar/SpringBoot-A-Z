package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import DB.DbConnection;
import java.sql.SQLException;
import java.util.Set;

import DAO.UserDAO;
import Entities.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet  {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		try {
			
		
		String username =req.getParameter("Username");
		String password =req.getParameter("Password");
		User user =new User(username,password);
		boolean result=UserDAO.loginMethod(user);
		if(result) {
			HttpSession session=req.getSession();
			session.setAttribute("name", req.getParameter("Username"));
			
			
			resp.sendRedirect("Dashboard.jsp");
		
		}else {
			out.print("Invalid Details !.Please RE-Entered Details Correctly");
			RequestDispatcher rd =req.getRequestDispatcher("/index.html");
			rd.include(req, resp);

		}}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
		}
	
	


