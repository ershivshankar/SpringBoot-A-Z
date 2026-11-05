package Servletbasic;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidAlgorithmParameterException;

import com.sun.media.sound.SoftJitterCorrector;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet{
    private static final long serialVersionUID = 1L;

@Override
protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String name=request.getParameter("username");
	String password=request.getParameter("password");
	
	
	if("shiv".equals(name)&&"123".equals(password)) {
		response.sendRedirect(request.getContextPath() + "/dashboard.html");	}
	
	else {
		response.setContentType("text/html");
		
		out.println("<h3>Invalid Details !Please Enter Details </h3>");
		RequestDispatcher rd =request.getRequestDispatcher("/index.html");
		rd.include(request, response);

				
}

	

}}
