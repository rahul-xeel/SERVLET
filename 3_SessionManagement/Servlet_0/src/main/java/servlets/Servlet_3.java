package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.connector.Response;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




@WebServlet("/third")
public class Servlet_3 extends HttpServlet {
    
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
		 Cookie[] cookies = req.getCookies();
	        if (cookies != null) {
	            for (Cookie c : cookies) {
	                if (c.getName().equals("user_name")) {
	                    c.setMaxAge(0); // delete cookie
	                    resp.addCookie(c);
	                }
	            }
	        }
	        resp.setContentType("text/html");
	        PrintWriter writer = resp.getWriter();
	        writer.print("<h1>You are logged out!</h1>");
	        writer.print("<a href='/Servlet_0/'>Go to Main Page</a>");
	    }
		
		
	
		
}
