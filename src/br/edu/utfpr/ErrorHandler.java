package br.edu.utfpr;

import br.edu.utfpr.model.ErrorBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ErrorHandler
 */
@WebServlet( urlPatterns = { "/error-handler"},
		name = "ErrorHandler")
public class ErrorHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
		
		if(throwable != null){
			ErrorBean errorBean = new ErrorBean(throwable.getMessage( ));
			request.setAttribute("errorBean", errorBean);
			request.getRequestDispatcher("WEB-INF/view/error.jsp").forward(request, response);
		}			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
