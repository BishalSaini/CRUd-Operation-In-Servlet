package com.jsp.Employeecontroller;

package com.jsp.Employeecontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.EmployeeDTO.Employee;
import com.jsp.EmployeeService.EmployeeService;



@WebServlet("/getid")
public class getbyId  extends HttpServlet{

	EmployeeService employeeService = new EmployeeService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String num = req.getParameter("num");
		int id = Integer.parseInt(num);

		Employee employee = employeeService.
				
		if(employee!=null) {
			
			PrintWriter printWriter = resp.getWriter();
			printWriter.write("<html><body><h1>"+"Details of Employee:"+"</h1>"+"<h3>"+employee.getName()+"<br>"+employee.getEmail()+"<br>"+
								employee.getGender()+"<br>"+employee.getSalary()+"</h3></body></html>");
			
		}
		
	}
	
}
