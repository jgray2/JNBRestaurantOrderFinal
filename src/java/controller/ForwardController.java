
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.OrderService;
import model.Server;

/**
 *
 * @author Jenni Burgmeier
 */
@WebServlet(name = "ForwardController", urlPatterns = {"/FwdControl.do"})
public class ForwardController extends HttpServlet {
private static final String destination = "/result.jsp";
    
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        OrderService orderService = new OrderService();
        orderService.createOrder();
        orderService.getOrder().getDrink().setName(request.getParameter("drink"));
        orderService.getOrder().getEntree().setEntreeName(request.getParameter("entree"));
        orderService.getOrder().getSide().setName(request.getParameter("side"));
        
        orderService.finalizeOrder();
        
        request.setAttribute("entree", orderService.getOrder().getEntree().getEntreeName());
        request.setAttribute("entreeCost", 
                String.valueOf(orderService.getOrder().getEntree().getPrice()));
        request.setAttribute("side", orderService.getOrder().getSide().getName());
        request.setAttribute("sideCost", 
                String.valueOf(orderService.getOrder().getSide().getPrice()));
        request.setAttribute("drink", orderService.getOrder().getDrink().getName());
        request.setAttribute("drinkCost", 
                String.valueOf(orderService.getOrder().getDrink().getPrice()));
        request.setAttribute("totalCost", 
                String.valueOf(orderService.getOrder().getTotalOrder()));
        request.setAttribute("tax", String.valueOf (orderService.getOrder().getTax()));
        request.setAttribute("suggestedTip", 
                String.valueOf(orderService.getOrder().getSuggestedTip())); 
//        
        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
