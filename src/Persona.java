import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Persona {
    int id;
    String nombre;
    String papellido;
    String sapellido;
    int edad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPapellido() {
        return papellido;
    }

    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }

    public String getSapellido() {
        return sapellido;
    }

    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*public void insertarPersona(){
        Connection conex = Main.conectar(); //Llamar la clases del metodo conectar
        String sql = "INSERT INTO persona (nombre, papellido, sapellido, edad) VALUES (?, ?)";

        try (PreparedStatement statement = conex.prepareStatement(sql)){
                statement.setString(1,nombre);
                statement.setString(2,papellido);
                statement.setString(3,sapellido);
                statement.setInt(4,edad);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try {
                conex.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }

    }*/
}
