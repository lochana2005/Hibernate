package controller;

import hibernate.Contacts;
import hibernate.HibernateUtil;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet(name = "SaveContact", urlPatterns = {"/SaveContact"})
public class SaveContact extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = null;
        Transaction transaction = null;

        try {
            s = sf.openSession();
            transaction = s.beginTransaction();

            Contacts c = new Contacts();
            c.setMobile("0711917667");
            c.setFirst_name("iyuri");
            c.setLast_name("nimesha");
            c.setCompany("one tera");
            c.setCreated_on(new Date()); 

            s.save(c);

            transaction.commit();
            
            response.getWriter().println("Contact saved successfully!");
            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            response.getWriter().println("Error saving contact: " + e.getMessage());
        } finally {
            if (s != null && s.isOpen()) {
                s.close();
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}