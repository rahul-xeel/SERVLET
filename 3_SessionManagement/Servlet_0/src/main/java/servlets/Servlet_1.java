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



@WebServlet("/first")
public class Servlet_1 extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Processing do get request");
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		writer.print("<h1>I GOT GET REQUEST BY SOMEONE</h1>");
		
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		
		System.out.println("Your name is " + name);
		System.out.println("got do post request");
		
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		writer.print("<h1>Form Submitted</h1>");
		writer.print("<h1>Your name is :-  " + name +  " </h1>");
		
		writer.print("<h1>Go to next page :- <a href='second'>Link</a></h1>");
		
		writer.print("<h1>Go to next page :- <a href='/Servlet_0/'>main</a></h1>");
		
		Cookie c = new Cookie("user_name",name);

		resp.addCookie(c);
		
		
	
	}
	

}
