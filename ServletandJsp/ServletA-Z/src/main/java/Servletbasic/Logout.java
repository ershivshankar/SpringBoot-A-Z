package Servletbasic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/logout")
public class Logout extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd =req.getRequestDispatcher("/index.html");
		PrintWriter out =resp.getWriter();
		out.println("<h1>Sucessfully Logout !</h1>");
		rd.include(req, resp);
		
	}

}
