/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterBikes.servlet;

import MasterBikes.dao.ClientesDao;
import MasterBikes.dto.ClientesDto;
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
public class MostrarClientes extends HttpServlet {

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ClientesDto dto = new ClientesDto();
            dto.setRUT_CLIENTE(request.getParameter("txtRut_Cliente"));
            dto.setNOMBRE(request.getParameter("txtNombre"));
            dto.setAPE_PATERNO(request.getParameter("txtApe_Paterno"));
            dto.setAPE_MATERNO(request.getParameter("txtApe_Materno"));
            dto.setDIRECCION(request.getParameter("txtDireccion"));
            dto.setEMAIL(request.getParameter("txtEmail"));
            
            new ClientesDao().modificarClientes(dto);
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet buscarPorRut</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h3> Registro Modificado!!!</h3>");
                out.println("<br><br>");
                out.println("<a href='buscarClientesPorRut.jsp'>Volver</a>");
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
