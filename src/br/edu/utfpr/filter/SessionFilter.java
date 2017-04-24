package br.edu.utfpr.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 
 * Filtro para redirecionar o usuário para o formulário de IMC caso ele já esteja logado.
 * Isso acontece quando ele tenta acessar o formulário de login.
 * 
 * @author Roni
 *
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST,
				DispatcherType.FORWARD
		}
					, urlPatterns = {"/index.jsp" })
public class SessionFilter implements Filter {


	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		Boolean isLoggedIn = (Boolean)((HttpServletRequest)request).getSession().getAttribute("isLoggedIn");
		
		if(isLoggedIn == null){
			System.out.println("sem sessão");
			chain.doFilter(request, response);
		}	
		else{
			System.out.println("com sessão " + ((HttpServletRequest)request).getSession(false));
			chain.doFilter(request, response);
			//((HttpServletResponse)response).sendRedirect(request.getServletContext().getContextPath() + "/blog-form");
		}		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}
