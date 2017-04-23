package br.edu.utfpr.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 
 * Se a requisição não possui parâmetros, então encaminha para o index.jsp
 * Por sua vez, caso o usuário já esteja logado, há um filtro que encaminhará para o formulário.
 * Este filtro evita acessar a calculadora de IMC sem passar pelo formulário da calculadora.
 * 
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/blog" })
public class NoParameterFilter implements Filter {

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
		
		if(request.getParameterNames().hasMoreElements()){
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
		else{
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
