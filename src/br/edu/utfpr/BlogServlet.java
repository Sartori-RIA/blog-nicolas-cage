package br.edu.utfpr;

import br.edu.utfpr.model.BlogBean;
import br.edu.utfpr.model.DB.BlogDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by sartori on 09/04/17.
 */
@WebServlet(
        urlPatterns = { "/blog" },
        name = "BlogServlet")
public class BlogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processing(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            processing(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void processing(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        BlogBean blogBean = new BlogBean(title, content);
        request.setAttribute("bean", blogBean);
        request.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(request, response);
    }
}
