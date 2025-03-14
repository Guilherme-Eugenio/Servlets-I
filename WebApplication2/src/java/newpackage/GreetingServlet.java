/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Calendar;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme
 */
@WebServlet(name = "GreetingServlet", urlPatterns = {"/Greeting"})
public class GreetingServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GreetingServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GreetingServlet</h1>");
            out.println("</body>");
            out.println("</html>");
            try{
                Date data= new Date();
                Calendar calendar = Calendar.getInstance();
                
                calendar.setTime(data);
                
                int hora = calendar.get(Calendar.HOUR_OF_DAY);
                
                out.println("<h1>" + data + "</h1>");
                
                if(hora >= 12 && hora <= 18){
                    out.println("<h2>Boa tarde</h2>");
                }
                else if(hora >=6 && hora < 12){
                    out.println("<h2>Bom dia</h2>");
                }
                else if(hora > 18 && hora < 22){
                    out.println("<h2>Boa noite</h2>");
                }
                else if(hora > 22 && hora < 6){
                    out.println("<h2>Vai dormir!</h2>");
                }
                
            }catch(Exception ex){
                out.println("<h4 style='color:red'> Ivalid sum1 </h4>");
            }
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
