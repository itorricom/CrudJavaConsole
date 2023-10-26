import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in); //Objeto scaner

    public static void main(String[] args) { //Funcion principal
        menu();
        //conectar();
    }

    public static void menu() { //Menu
        try {
            System.out.println(
                    "**********************\n" +
                            "***   CRUD MYSQL   ***\n" +
                            "**********************\n"
            );
            System.out.println(">> ");
            /*String input = sc.nextLine();
            byte opcion = Byte.parseByte(input);

            switch (opcion){
                case 1:
                    System.out.println(opcion);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }*/

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    /*void listarPersona(){
        String sql = "select * from persona";
        try{
            //Connection conexion = null;
            con =  conexion.createStatement();
            st = con.createst
        }
    }*/


   /* public static Connection conectar() {  //metodo conexion DB
        String dbURL = "jdbc:mysql://127.0.0.1:3306/dbprueba";
        String user = "root";
        String password = "";
        Connection con = null;

        try {
            con = DriverManager.getConnection(dbURL, user, password);
            if (con != null) {
                System.out.println("La conexion se ha realizado con exito :)");
            }
        } catch (SQLException error) {
            System.out.println("Error: "
                    + error.getErrorCode() + " " + error.getMessage());
        }
        return con;
    }*/
}