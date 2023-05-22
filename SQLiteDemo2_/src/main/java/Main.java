import controlador.ControladorLibro;
import modelo.Libro;
import persistencia.LibroDAO;
import vista.VentanaLibro;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro( "MVC Y JDBC");
        ControladorLibro controller = new ControladorLibro(view);

    }
}



