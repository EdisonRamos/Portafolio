<%-- 
    Document   : ingresarClientes
    Created on : 16-10-2018, 10:14:43
    Author     : Edison
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Agregar Clientes</title>
    </head>
    <body>
        <h1>Agregar Clientes</h1>
   
       <form action="agregarClientes" method="POST">
           <table border="0">                
               <tbody>
                   <tr>
                       <td>Rut</td>
                       <td><input type="text" name="txtRut_Cliente" required="required" /></td>
                   </tr>
                   <tr>
                       <td>Nombre </td>
                       <td><input type="text" name="txtNombre" required="required" /></td>
                   </tr>
                   <tr>
                       <td>Apellido Paterno </td>
                       <td><input type="text" name="txtApe_Paterno" required="required" /></td>
                   </tr>
                   <tr>
                      <td>Apellido Materno</td>
                       <td><input type="text" name="txtApe_Materno" /></td>
                   </tr>
                   <tr>
                      <td>Direccion</td>
                       <td><input type="text" name="txtDireccion" required="required" /></td>
                   </tr>
                   <tr>
                      <td>E-mail</td>
                       <td><input type="text" name="txtEmail" /></td>
                   </tr>
               </tbody>
           </table>
           <button type="submit" class="btn btn-default">Agregar</button>
           <a href="/MasterBikes" class="btn btn-default">Volver</a>
       </form>
    </body>
</html>
