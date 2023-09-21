/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
@WebServlet("/login")
public class login extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String email = request.getParameter("stdEmail");
        String pass = request.getParameter("stdPass");
        
        LoginDAO dao = new LoginDAO();
        
        if(dao.check(email, pass) == true)
        {
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            response.sendRedirect("profile.jsp");
        }
        else
        {
            response.sendRedirect("index.jsp");
        }
    }
}
