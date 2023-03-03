
    //PEREZ MOLINA JOSE MANUEL 2208//

import java.util.Scanner;
public class Gato_2 {

    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce la cadena: ");
            String partida = scanner.nextLine();

            partida = partida.toUpperCase();
            Boolean valida = partida.matches("[X,O,_]*");

            if (partida.length() == 9 && valida == true) {
                String p1 = partida.substring(0, 3);
                String p2 = partida.substring(3, 6);
                String p3 = partida.substring(6, 9);

                System.out.println("-----");
                System.out.println("|" + p1 + "|");
                System.out.println("|" + p2 + "|");
                System.out.println("|" + p3 + "|");
                System.out.println("-----");

            } else {

                System.out.println("Introduce una cadena valida");

            }
    }
}
        //Fin del codigo//

