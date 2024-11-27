package io.codeforall.fanstatics;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomerController extends HttpServlet {

    public Customer customer = new Customer();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher page1Dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/customer.jsp");
        customer.setName("Sandra");
        customer.setEmail("sandra@cfa.com");
        customer.setPhone(123456789);
        req.getSession().setAttribute("batata", customer);

        page1Dispatcher.forward(req, resp);

    }
}
