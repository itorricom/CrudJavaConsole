package DB;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
    //Creamos un objeto del tipo Connection
    Connection con;
    //Constructor
    public Conexion() {
        try {
            //Cargar drivers para conectarse a la db
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Método que nos permite establecer una conexión con la base de datos.
            //https://www.w3api.com/Java/DriverManager/getConnection/
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprueba", "root", "");
        } catch (Exception e) {
            //Mostrar mensaje si en caso se produce algun error
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        Conexion cn  = new Conexion();
        Statement st; //Se encarga de definir una consulta SQL
        ResultSet rs; //contiene los resultados de una consulta SQL
        try {
            st = cn.con.createStatement();
            rs = st.executeQuery("select * from persona");
            while (rs.next()){
                System.out.println(rs.getInt("id")+ " "
                        +rs.getString("nombre")+ " "
                        +rs.getString("papellido")+ " "
                        +rs.getString("sapellido")+ " "
                        +rs.getInt("edad"));
            }
            cn.con.close();

        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }


}
