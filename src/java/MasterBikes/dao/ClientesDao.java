/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterBikes.dao;

import MasterBikes.dto.ClientesDto;
import MasterBikes.sql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Edison
 */
public class ClientesDao {
    
    
    public boolean validarRutCliente(String rut_clientes)
    {
        boolean resp=true;
                
        try
        {
            Connection conexion=Conexion.getConexion();
            String query="SELECT RUT_CLIENTE FROM CLIENTES WHERE RUT_CLIENTE= ?";
            PreparedStatement validar = conexion.prepareStatement(query);
            validar.setString(1, rut_clientes);
            ResultSet rs=validar.executeQuery();
            
            while(rs.next())
            {
                resp = false;
            }
        }catch(SQLException w){
            System.out.println("Error SQL al Validar"+w.getMessage());
        }catch(Exception e)
        {
            System.out.println("Error al Validar"+e.getMessage());
        }
        return resp;       
    }
    
        public ClientesDto buscarClientesPorRut(String rut_clientes) {
        ClientesDto dto = null;
        try {
            Connection conexion = Conexion.getConexion();
            String query = "SELECT * FROM CLIENTES WHERE RUT_CLIENTE=?";
            PreparedStatement buscar = conexion.prepareStatement(query);
            buscar.setString(1, rut_clientes);
            ResultSet rs = buscar.executeQuery();
            while (rs.next()) {
                dto = new ClientesDto();
                
                dto.setRUT_CLIENTE(rs.getString("RUT_CLIENTE"));
                dto.setNOMBRE(rs.getString("NOMBRE"));
                dto.setAPE_PATERNO(rs.getString("APE_PATERNO"));
                dto.setAPE_MATERNO(rs.getString("APE_MATERNO"));
                dto.setDIRECCION(rs.getString("DIRECCION"));
                dto.setEMAIL(rs.getString("EMAIL"));

            }
            buscar.close();
            conexion.close();

        } catch (SQLException w) {
            System.out.println("Error SQL al buscar por rut" + w.getMessage());

        } catch (Exception e) {
            System.out.println("Error al buscar por rut" + e.getMessage());
        }
        return dto;
    }
        
        public boolean agregarClientes(ClientesDto dto)
                
        {
            try {
                //obtenemos la conexion al motor de BD
            Connection conexion = Conexion.getConexion();
            
            //creamos la query a ejecutar  
            String query = "INSERT INTO CLIENTES(RUT_CLIENTE,NOMBRE,APE_PATERNO,APE_MATERNO,DIRECCION,EMAIL) VALUES(?,?,?,?,?,?)";
            PreparedStatement insertar = conexion.prepareStatement(query);
            
            //reemplazamos los "?" por un verdadero valor el cual 
            //lo dara el objeto que viene como parametro de entrada
            
            insertar.setString(1, dto.getRUT_CLIENTE());
            insertar.setString(2, dto.getNOMBRE());
            insertar.setString(3, dto.getAPE_PATERNO());
            insertar.setString(4, dto.getAPE_MATERNO());
            insertar.setString(5, dto.getDIRECCION());
            insertar.setString(6, dto.getEMAIL());
            
            //ejecutamos la query
            insertar.execute();
            
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
 /*       
    public boolean agregarClientes(ClientesDto dto)
   {
       
      try{
              Connection conexion = Conexion.getConexion();
              String query = "INSERT INTO CLIENTES(RUT_CLIENTE,NOMBRE,APE_PATERNO,APE_MATERNO,DIRECCION,EMAIL) VALUES(?,?,?,?,?,?)";
              PreparedStatement insertar = conexion.prepareStatement(query);

              insertar.setString(1, dto.getRUT_CLIENTE());
              insertar.setString(2, dto.getNOMBRE());
              insertar.setString(3, dto.getAPE_PATERNO());
              insertar.setString(4, dto.getAPE_MATERNO());
              insertar.setString(5, dto.getDIRECCION());
              insertar.setString(6, dto.getEMAIL());
              insertar.execute();
              insertar.close();
              conexion.close();
              System.out.println("Se agrego correctamente: "+dto.toString());
              return true;
          
       }catch(SQLException w){
           System.out.println("Error SQL al agregar "+w.getMessage());
           return false;
       }catch(Exception e){
           System.out.println("Error al agregar "+e.getMessage());
           return false;
       } 
   }
 */  
    public boolean modificarClientes(ClientesDto dto){
       try{
           Connection conexion=Conexion.getConexion();
           String query="UPDATE CLIENTES SET RUT_CLIENTE=?, NOMBRE=?, APE_PATERNO=?, APE_MATERNO=?, DIRECCION=?, EMAIL=? WHERE RUT_CLIENTES=?";
           PreparedStatement modificar= conexion.prepareStatement(query);
              modificar.setString(1, dto.getRUT_CLIENTE());
              modificar.setString(2, dto.getNOMBRE());
              modificar.setString(3, dto.getAPE_PATERNO());
              modificar.setString(4, dto.getAPE_MATERNO());
              modificar.setString(5, dto.getDIRECCION());
              modificar.setString(6, dto.getEMAIL());
           modificar.executeUpdate();
           modificar.close();
           conexion.close();
           return true;
       }catch(SQLException w){
           System.out.println("Error SQL al modificar "+w.getMessage());            
           return false;
       }catch(Exception e){
           System.out.println("Error al modificar "+e.getMessage());            
           return false;
       }
   }
}
