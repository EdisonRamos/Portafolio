<%-- 
    Document   : listarClientes
    Created on : 16-10-2018, 10:15:21
    Author     : Edison
--%>

<%@page import="MasterBikes.dto.ClientesDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        
        <%ClientesDto dto = (ClientesDto)request.getAttribute("clientesDto");%>
        <form action="mostrarResultado" method="POST">
            <table border="0">
                
                <tbody>
                    
                    <tr>
                        <td>Rut : </td>
                        <td><input type="text" name="txtRutCliente" value="<%=dto.getRUT_CLIENTE()%>" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <td>Nombre : </td>
                        <td><input type="text" name="txtNombre" value="<%=dto.getNOMBRE()%>" /></td>
                    </tr>
                    <tr>
                        <td>Apellido Paterno : </td>
                        <td><input type="text" name="txtApePaterno" value="<%=dto.getAPE_PATERNO()%>" /></td>
                    </tr>
                    <tr>
                        <td>CApellido Materno : </td>
                        <td><input type="text" name="txtApeMaterno" value="<%=dto.getAPE_MATERNO()%>" /></td>
                    </tr>
                    <tr>
                        <td>Direccion : </td>
                        <td><input type="text" name="txtDireccion" value="<%=dto.getDIRECCION()%>" /></td>
                        
                    </tr>
                    <tr>
                        <td>Email : </td>
                        <td><input type="text" name="txtEmail" value="<%=dto.getEMAIL()%>" /></td>
                        
                    </tr>
                </tbody>
            </table>
            <br>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    
                    <a href="/MasterBikes" class="btn btn-default">Volver</a> 
                </div>
            </div>
        </form>
        
             
    </body>
</html>
