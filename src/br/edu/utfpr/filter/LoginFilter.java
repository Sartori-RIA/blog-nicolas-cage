package br.edu.utfpr.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, servletNames = { "LoginServlet" })
public class LoginFilter implements Filter {
    

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		if(request.getParameter("username") == null || 
				request.getParameter("password") == null || 
				request.getParameter("username").isEmpty() || 
				request.getParameter("password").isEmpty()){
			((HttpServletResponse)response).sendRedirect("index.jsp");
			
		}
		else{			
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
