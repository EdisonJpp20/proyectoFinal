package Backend.DTBconeccion;

import com.mysql.jdbc.Connection;

import javax.swing.*;
import java.sql.DriverManager;

public class DTBconeccion {

    private  static Connection connect ;
    private static String drive = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String password = "";
    private static String url = "jdbc:mysql://localhost:3306/tarea6";

    public  void connectar(){
        connect = null ;
        try{
            Class.forName(drive);
            connect = (Connection) DriverManager.getConnection(url ,user , password);

            if(connect != null)
                System.out.println("Base de datos iniciada!");
            else
                alert("Base de datos caida");

        }catch (Exception e ){
           System.out.println(e);
        }
    }

    public Connection getConeccion(){
        return  connect;
    }

    public void cortarConeccion(){
        connect = null;
        if(connect == null)
            alert("Base de datos desconectada");
        else
            alert("No se desconecto.");
    }

    void alert(String message){
        JOptionPane.showMessageDialog(null , message);
    }

}
