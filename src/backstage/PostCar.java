package backstage;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PostCar")

public class PostCar extends HttpServlet implements javax.servlet.Servlet{
	private static final long serialVersionUID = 1L;
	
	public PostCar() {
		super();
	}
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/congratulations.jsp";
		
		String username = request.getParameter("user");
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String year = request.getParameter("year");
		String mileage = request.getParameter("mileage");
		String color = request.getParameter("color");
		String transmission = request.getParameter("transmission");
		String price = request.getParameter("price");
		String drivetrain = request.getParameter("drivetrain");
		String mpg = request.getParameter("mpg");
		String vin = request.getParameter("vin");
		
     
		try {
			String insertQuery="insert into cars values (\'"+ username +"\',\'" + make + "\',\'" + model + "\'," + year + "," + mileage + ",\'" + color + "\',\'"+transmission+"\',"+price+",\'"+drivetrain+"\',\'"+mpg+"\',\'"+vin+"\')";
			new Database().executeInsertCarQuery(insertQuery);
			request.setAttribute("returninguser", username);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ServletContext context = getServletContext();
		RequestDispatcher dispacher = context.getRequestDispatcher(url);
		dispacher.forward(request, response);
		
	}
}
