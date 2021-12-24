import java.sql.Connection;

public class Start {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Conexion conexion = new Conexion();
        try(Connection connection = conexion.get_connection()){
            System.out.println("Conexion establecida");
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
