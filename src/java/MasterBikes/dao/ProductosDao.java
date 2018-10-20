/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterBikes.dao;

import MasterBikes.dto.ProductosDto;
import MasterBikes.sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Edison
 */
public class ProductosDao {
    
     public boolean agregarProductos(ProductosDto dto)           
    {
            try {
                //obtenemos la conexion al motor de BD
            Connection conexion = Conexion.getConexion();
            
            //creamos la query a ejecutar  
            String query = "INSERT INTO PRODUCTOS(NOMBRE,MONTO,CATEGORIA,STOCK,TIPO_PRODUCTO) VALUES(?,?,?,?,?)";
            PreparedStatement insertar = conexion.prepareStatement(query);
            
            //reemplazamos los "?" por un verdadero valor el cual 
            //lo dara el objeto que viene como parametro de entrada
            dto = new ProductosDto();
            insertar.setString(1, dto.getNOMBRE());
            insertar.setInt(2, dto.getMONTO());
            insertar.setString(3, dto.getCATEGORIA());
            insertar.setInt(4, dto.getSTOCK());
            insertar.setString(5, dto.getTIPO_PRODUCTO());
            insertar.executeUpdate();
            
            //ejecutamos la query
            insertar.executeQuery();
            
            //cerramos conexion
            insertar.close();
            conexion.close();
            
            return true;
                
        }catch(SQLException w){        
            System.out.println("Error SQL al agregar "+w.getMessage());
            return false;
        }catch(Exception e)
        {
            System.out.println("Error al agregar "+e.getMessage());
            return false;
        }
    }
}



/*
public class ProductosDao {
    
     public String agregarProductos(ProductosDto dto)           
    {
        String mensaje = "";
            try {
                //obtenemos la conexion al motor de BD
            Connection conexion = Conexion.getConexion();
            
            //creamos la query a ejecutar  
            String query = "INSERT INTO PRODUCTOS(NOMBRE,MONTO,CATEGORIA,STOCK,TIPO_PRODUCTO) VALUES(?,?,?,?,?)";
            PreparedStatement insertar = conexion.prepareStatement(query);
            
            //reemplazamos los "?" por un verdadero valor el cual 
            //lo dara el objeto que viene como parametro de entrada
            dto = new ProductosDto();
            insertar.setString(1, dto.getNOMBRE());
            insertar.setInt(2, dto.getMONTO());
            insertar.setString(3, dto.getCATEGORIA());
            insertar.setInt(4, dto.getSTOCK());
            insertar.setString(5, dto.getTIPO_PRODUCTO());
            
            //ejecutamos la query
            insertar.executeQuery();
            
            //cerramos conexion
            insertar.close();
            conexion.close();
                mensaje = "Insertar correcto";
                
        }catch(SQLException w){        
            mensaje = "Error SQL al agregar "+w.getMessage();
        }catch(Exception e)
        {
            mensaje = "Error al agregar "+e.getMessage();
        }
            return mensaje;
    } 
}
*/
