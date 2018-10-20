/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterBikes.servlet;

import MasterBikes.dao.ProductosDao;
import MasterBikes.dto.ProductosDto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Edison
 */
public class agregarProductos extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            
               ProductosDto dto = new ProductosDto();
               ProductosDao dao = new ProductosDao();
               
               request.getParameter("txtNombre").toString();
               request.getParameter("txtMonto").toString();
               request.getParameter("txtCategoria").toString();
               request.getParameter("txtStock").toString();
               request.getParameter("txtTipoProducto").toString();
               
               /*
               nuevo.setNOMBRE(request.getParameter("txtNombre"));
               nuevo.setMONTO(Integer.parseInt(request.getParameter("txtMonto")));
               nuevo.setCATEGORIA(request.getParameter("txtCategoria"));
               nuevo.setSTOCK(Integer.parseInt(request.getParameter("txtStock")));
               nuevo.setTIPO_PRODUCTO(request.getParameter("txtTipoProducto"));
               */
               
               new ProductosDao().agregarProductos(dto);
            
            //hacemos referencia circular(vuelve a la misma pagina que hizo el llamado)
            response.sendRedirect("ingresarProductos.jsp");
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
    public void doGet(HttpServletRequest request, HttpServletResponse response)
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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
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
