package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFilter implements Filter {

	
	
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
	
				
		arg1.setContentType("text/html");
		PrintWriter writer = arg1.getWriter();
		writer.print("<h1>FILTER EXECUTED BEFORE PAGE</h1>");
		
		
		arg2.doFilter(arg0, arg1);
		
		
		
		writer.print("<h1>FILTER EXECUTED BEFORE PAGE</h1>");

		
		
		
		
		
		
	}

	
	
	
	
}
