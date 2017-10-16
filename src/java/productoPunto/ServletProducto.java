package productoPunto;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Touchier
 */
@WebServlet(urlPatterns = {"/productoPunto"})
public class ServletProducto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String letra= "1234";
        int[] numeros= new int[5];
        int resul= 0;
        
        for(int i= 0; i < letra.length(); i++){
            numeros[i]= Integer.parseInt(request.getParameter("num" + letra.charAt(i)));
        }
        
        producto.punto point= new producto.punto(numeros);
        resul= point.productoPunto();
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet proceso</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> PRODUCTO PUNTO: " + resul + ".</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String letra= "ABCD";
        int[] numeros= new int[letra.length()];
        int resul= 0;
        
        for(int i= 0; i < letra.length(); i++){
            numeros[i]= Integer.parseInt(request.getParameter("num" + letra.charAt(i)));
        }
        
        producto.punto point= new producto.punto(numeros);
        resul= point.productoPunto();
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet proceso</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> PRODUCTO PUNTO: " + resul + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
