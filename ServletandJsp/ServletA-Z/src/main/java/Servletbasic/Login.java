package Servletbasic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
    private static final long serialVersionUID = 1L;

@Override
protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	out.println("Welcome to Login portal please wait few Second to verify user details");
	String name=request.getParameter("username");
	String password=request.getParameter("password");
	if(name.equals("shiv")&&password.equals("123")) {
		out.println("Sucessfully Login ");
	}else if(name.equals("shiv")||password.equals("123")) {
		out.println("Username or Password may invalid");
	}else {
		out.println("invalid both details");
	}
	
}

	

}
