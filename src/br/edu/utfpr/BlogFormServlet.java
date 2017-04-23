package br.edu.utfpr;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sartori on 09/04/17.
 */
@WebServlet(
        urlPatterns = { "/blog-form" },
        name = "BlogFormServlet")
public class BlogFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Boolean isLoggedIn = (Boolean)req.getSession().getAttribute("isLoggedIn");
        if(isLoggedIn){
            String address = "/WEB-INF/view/blog.jsp";
            req.getRequestDispatcher(address)
                    .forward(req, resp);
        }
        else{
            resp.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
