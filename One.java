package a.aone;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

public class One  extends HttpServlet{
		 protected void doGet(HttpServlet req,HttpServlet resp) throws ServletException,IOException
		 {
			System.out.println("I am In doGet() Method "); 
		 }
		}

