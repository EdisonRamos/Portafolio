<%-- 
    Document   : buscarClientesPorRut
    Created on : 16-10-2018, 10:15:07
    Author     : Edison
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Buscar</title>
    </head>
    <body>
       <form action="buscarClientesPorRut" method="POST">
           <table border="0">
             
               <tbody>
                   <tr>
                       <td>Ingrese Rut</td>
                       <td><input type="text" name="txtBuscarRutCliente" value="" /></td>
                   </tr>
               </tbody>
           </table>
           <br>
           <input type="submit" value="BUSCAR" name="btnBuscar" />
           <a href="/MasterBikes" class="btn btn-default">Volver</a>
       </form>
   </body>
</html>
