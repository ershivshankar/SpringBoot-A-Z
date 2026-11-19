
package Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import DB.DbConnection;
import DAO.UserDAO;
import Entities.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Register extends HttpServlet {

    // Test whether the Servlet is working
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<h1>Register Servlet is Working!</h1>");
    }

    // Handle registration form submission
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        try {

            // Get form values
            String name = request.getParameter("Name");
            String username = request.getParameter("username");
            String email = request.getParameter("Email");
            String password = request.getParameter("Password");

            // Create User object
            User user = new User(name, username, email, password);

            out.println("<h3>Registration details received.</h3>");

            // Insert user into database
            boolean result = UserDAO.insertIntoDb(user);

            if (result) {

                out.println("<h2>Successfully Registered!</h2>");

            } else {

                out.println("<h2>Registration Failed!</h2>");

                RequestDispatcher rd =
                        request.getRequestDispatcher("/index.html");

                rd.include(request, response);
            }

        } catch (SQLException e) {

            e.printStackTrace();

            out.println("<h2>Database Error Occurred!</h2>");
            out.println("<p>" + e.getMessage() + "</p>");
        }
    }
}
