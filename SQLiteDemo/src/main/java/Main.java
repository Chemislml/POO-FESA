import modelo.Libro;
import persistencia.DemoLibroDB;
import persistencia.LibroDAO;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LibroDAO ldao = new LibroDAO();
        try {
           Libro res = (Libro) ldao.buscarPorId("1");
            System.out.println(res);
            System.out.println("--------------------");
            for (Object lib: ldao.obtenerTodo()) {
                System.out.println((Libro)lib);
            }


        }catch (SQLException sqle){
            System.out.println("Error");
            System.out.println(sqle.getMessage());
        }


    }
}



