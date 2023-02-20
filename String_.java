    //PEREZ MOLINA JOSE MANUEL 2208//

import java.util.Scanner;
public class String_{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe los datos en orden [nombre, profesion,pais]: ");
        java.lang.String datos = sc.nextLine();

        String[] separador = datos.split(" ");
        String nombre = separador[0].toUpperCase();
        String profesion = separador[1].toUpperCase();
        String pais = separador[2].toUpperCase();

        System.out.println("Nombre: " + nombre);
        System.out.println("Profesión: " + profesion);
        System.out.println("País: " + pais);

    }

}
        //Fin del codigo String_//