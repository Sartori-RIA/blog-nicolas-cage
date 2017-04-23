package br.edu.utfpr;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		urlPatterns = { "/login" },
		name = "LoginServlet",
		initParams = { 
				@WebInitParam(name = "user-servlet", value = "root"),
				@WebInitParam(name = "pwd-servlet", value = "qwerty")
		})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String userDefault = null; 
	private String pwdDefault = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		userDefault = config.getServletContext().getInitParameter("user");
	    pwdDefault = config.getServletContext().getInitParameter("pwd");
	}    
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		if(user.equals(userDefault) && pwd.equals(pwdDefault)){
			
			HttpSession session = request.getSession();
			Boolean isLoggedIn = (Boolean)session.getAttribute("isLoggedIn");
						
			if(isLoggedIn == null){				
				
				session.setAttribute("loginDate", new Date());
				session.setAttribute("isLoggedIn", true);
				
				System.out.println("Criando a sessão");
				
				Cookie cookie = new Cookie("login-date", new Date().toString());
				response.addCookie(cookie);
			}			
			
			String address = "/blog-form";
			request.getRequestDispatcher(address)
			.forward(request, response);
		}
		else{
			String msg = "<div class=\"card orange\">\n" +
					"            <div class=\"card-content white-text\">\n" +
					"               <h5>\n" +
					"                   <i class=\"ion-alert-circled\"></i>\n" +
					"					Usuário ou senha incorretos <i class=\"ion-android-sad\"></i>"+
					"               </h5>\n" +
					"            </div>\n" +
					"        </div>";
			request.setAttribute("message", msg);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
