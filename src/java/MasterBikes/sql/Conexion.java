/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterBikes.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Edison
 */
public class Conexion {
    public static Connection getConexion() {

        Connection connection = null;
        try {
           String driverClassName = "oracle.jdbc.OracleDriver";
           String driverUrl="jdbc:oracle:thin:@190.54.38.182:8151:bdmasterbike";
           Class.forName(driverClassName);
           connection = DriverManager.getConnection(driverUrl, "MASTERBIKE","MASTERBIKE");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}

/*public class Conexion {
    public static Connection getConexion() {

        Connection connection = null;
        try {
           String driverClassName = "com.mysql.jdbc.Driver";
           String driverUrl="jdbc:mysql://localhost/masterbikes";
           Class.forName(driverClassName);
           connection = DriverManager.getConnection(driverUrl, "root","Edison30.");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}*/



