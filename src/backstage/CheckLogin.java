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

@WebServlet("/CheckLogin")

public class CheckLogin extends HttpServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;
	
	public CheckLogin() {
		super();
	}
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/Login.jsp";
		
		String username = request.getParameter("user");
		String password = request.getParameter("password");
		
        boolean wrong= false;
		
		if (username == null || username.length() == 0) {
			request.setAttribute("error", "User name must not be empty.");	
			wrong=true;
		} else if (password ==null || password.length() == 0) {
			request.setAttribute("error", "Please type in passwords.");
			wrong=true;
		} else if (!wrong) {
			try {
				String checkquery="select count(*) from user where username=\'"+username+"\' and password=\'"+password+"\'";
				String result = new Database().executeCheckQuery(checkquery);
				if (!result.equals("1")) {
					request.setAttribute("error", "Username or password is wrong, please retype or signup");
				} else {
					url = "/Welcomeback.jsp";
					request.setAttribute("returninguser", username);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		ServletContext context = getServletContext();
		RequestDispatcher dispacher = context.getRequestDispatcher(url);
		dispacher.forward(request, response);
		
	}
}
