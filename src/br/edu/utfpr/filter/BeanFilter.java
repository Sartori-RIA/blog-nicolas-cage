package br.edu.utfpr.filter;

import br.edu.utfpr.model.BlogBean;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Cria a sessão, se inexistente. Adiciona o resultado de IMC corrente na lista
 * guardada na sessão no momento do retorno da resposta ao cliente.
 * 
 * Com isso, a lista de resultados enviada a página de resultados não contém o
 * resultado corrente.
 * 
 * @author Roni
 *
 */
@WebFilter(dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD }, urlPatterns = { "/blog" })
public class BeanFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpSession session = ((HttpServletRequest)request).getSession();
		Boolean isLoggedIn = (Boolean)session.getAttribute("isLoggedIn");

		if (isLoggedIn == null) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {			
			List<BlogBean> beans = (List<BlogBean>) session.getAttribute("beans");

			if (beans == null) {
				beans = new ArrayList<>();
				session.setAttribute("beans", beans);
			}

			// pass the request along the filter chain
			chain.doFilter(request, response);

			BlogBean imcBean = (BlogBean) request.getAttribute("bean");
			beans.add(imcBean);
			session.setAttribute("beans", beans);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
