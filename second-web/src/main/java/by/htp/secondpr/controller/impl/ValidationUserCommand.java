package by.htp.secondpr.controller.impl;

import java.io.IOException;
import java.io.PrintWriter;

import by.htp.secondpr.controller.Command;
import by.htp.secondpr.model.Model;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ValidationUserCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		Model model = Model.getInstance();
		PrintWriter out = response.getWriter();
		out.print(model.validateUser(name, pass));
		System.out.println(name + "  pass:" + pass);
			
	}

}
