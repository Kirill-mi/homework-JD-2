package by.htp.secondpr.controller;

import java.io.IOException;
import java.io.PrintWriter;

import by.htp.secondpr.user.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String typeOfRequest=request.getParameter("type");
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");
	User user=new User();
	PrintWriter out=response.getWriter();
	if(typeOfRequest.equals("create")) {
		out.print(user.createUser(name,pass ));
		
		System.out.println(name+ "  pass:"+pass);
		System.out.println(typeOfRequest);
	}else {
		System.out.println(typeOfRequest);
		if(user.validateUser(name, pass)) {};
		
		out.print("<li> + name + </li>");
	}
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
