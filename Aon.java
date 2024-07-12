package a.backend;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Aon extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=resp.getWriter();
		 out.print("<h1>I am DoGet () Method ::</h1>");

		   out.print("THIS IS MY FIRST WEB SITE !!! THINKYOU SO MUCH</h1>");
		 System.out.println("Hello World ");
	   System.out.println("I am DoGet() Method ");
	   out.print("THIS IS MY FIRST WEB SITE !!! THINKYOU SO MUCH");
	   out.print("THIS IS MY FIRST WEB SITE !!! THINKYOU SO MUCH");
	}
}
