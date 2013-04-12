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

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet implements
javax.servlet.Servlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/Signup.jsp";
		
		String user = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmedPassword = request.getParameter("confirm password");
		String firstName = request.getParameter("First name");
		String lastName = request.getParameter("Last name");
		String agreement = request.getParameter("agreement");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phone number");
		boolean wrong= false;
		
		if (user == null || user.length() == 0) {
			request.setAttribute("error", "User name must not be empty.");	
			wrong=true;
		} else if (password ==null || password.length() == 0) {
			request.setAttribute("error", "Please type in passwords.");
			wrong=true;
		} else if (!password.equals(confirmedPassword)){		
			request.setAttribute("error", "The two passwords are not the same, please type again.");
			wrong=true;
		} else if (!agreement.equals("agreed")) {
			request.setAttribute("error", "We can not provide our service before you agree on our statments");
			wrong=true;
		} else if (!wrong){
			try {
				String checkquery="select count(*) from user where username=\'"+user+"\'";
				String result = new Database().executeCheckQuery(checkquery);
				if (result.equals("1")) {
					request.setAttribute("error", "This username is taken by other customer, please try another one.");
				} else {
					url = "/Welcome.jsp";
					String insertQuery="insert into user values (\'"+ user +"\',\'" + firstName +"\',\'"+ lastName + "\',\'" + password + "\',\'" + email + "\',\'" + phoneNumber + "\')";
					new Database().executeInsertQuery(insertQuery);
					request.setAttribute("newuser", user);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
