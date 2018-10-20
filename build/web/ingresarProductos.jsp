<%-- 
    Document   : ingresarProductos
    Created on : 19-10-2018, 14:57:00
    Author     : Edison
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Agregar Productos</title>
    </head>
    <body>
        <h1>Agregar Productos</h1>

       <form action="agregarProductos" method="POST">
           <table border="0">                
               <tbody>
                   <tr>
                       <td>Nombre</td>
                       <td><input type="text" name="txtNombre" required="required" /></td>
                   </tr>
                   <tr>
                       <td>Monto</td>
                       <td><input type="text" name="txtMonto" required="required" /></td>
                   </tr>
                   <tr>
                       <td>Categoria</td>
                       <td><input type="text" name="txtCategoria" required="required" /></td>
                   </tr>
                   <tr>
                      <td>Stock</td>
                       <td><input type="text" name="txtStock" required="required"/></td>
                   </tr>
                   <tr>
                      <td>Tipo Producto</td>
                       <td><input type="text" name="txtTipoProducto" required="required" /></td>
                   </tr>
               </tbody>
           </table>
           <button type="submit" value="agregarProductos">Agregar</button>
           <a href="/MasterBikes" class="btn btn-default">Volver</a>
       </form>
    </body>
</html>
