import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aa
 */
public class servweek extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String username = request.getParameter("username");
        String password = request.getParameter("password");
        String languages[] = request.getParameterValues("language");
        String gender = request.getParameter("gender");
        String feedback = request.getParameter("feedback");
        String jobCategory = request.getParameter("jobCat");


//    if (languages != null) {
//     System.out.println("Languages are: ");
//        for (String lang : languages) {
//            System.out.println("Laguages are: \t" + lang);
//        }
//        }
         
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("Gender is: " + gender);
        System.out.println("Feed back is: " + feedback);
        System.out.println("Job category is: " + jobCategory);

  
        // do some processing here...
          
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
      
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + username + "<br/>";      
        htmlRespone += "Your password is: " + password + "<br/>";
         if (languages != null) {
     System.out.println("Languages are: ");
        for (String lang : languages) {
            System.out.println("Laguages are: \t" + lang);
            htmlRespone += "Languages are: " + lang + "<br/>"; 
        }
        }
        
        htmlRespone += "Your Gender is: " + gender + "<br/>"; 
        htmlRespone += "Your Feedback is: " + feedback + "<br/>"; 
        htmlRespone += "Your Job Interest is: " + jobCategory + "</h2>"; 


        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);
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