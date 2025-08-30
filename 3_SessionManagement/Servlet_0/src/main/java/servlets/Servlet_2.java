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




@WebServlet("/second")
public class Servlet_2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        String name = null;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user_name")) {
                    name = c.getValue();
                }
            }
        }
        PrintWriter writer = resp.getWriter();
        if (name != null) 
        	{
        		writer.print("<h1>You are Loggedin</h1>");
        		writer.print("<h1>Hello " + name + "</h1>");
        		writer.print("<h1><a href='third'>Logout</a></h1>");
        	}
        else {
        
        	writer.print("<h1>Please login first</h1>");
        }
    }
}
