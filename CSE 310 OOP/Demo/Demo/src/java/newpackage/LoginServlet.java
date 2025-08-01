package newpackage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            String lEmail = request.getParameter("email");
            String lPassword = request.getParameter("password");
            
            UserDatabase db = new UserDatabase(ConnectionPro.getConnection());
            User user = db.logUser(lEmail,lPassword);
            if(user!=null){
                HttpSession session = request.getSession();
//                session.setAttribute("loguser",user);
//                response.sendRedirect("/cse310demo/homepage/homepage.jsp
                   session.setAttribute("loguser",user);
                if(user.getUser_type().equals("normal")){
                    //session.setAttribute("loguser",user);
                    response.sendRedirect("welcome.jsp");
                }
                else if(user.getUser_type().equals("admin")){
                   // session.setAttribute("loguser",user);
                    response.sendRedirect("admin.jsp");
                }
            }
            else{
                out.print("user not found");
            }

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
