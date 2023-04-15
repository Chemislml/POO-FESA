    //PEREZ MOLINA JOSE MANUEL 2208//

import java.awt.*;
public class Main {
    public static void main(String[] args) {

        Vehiculo avion1 = new Vehiculo(100, false, "ATF");
        System.out.println(avion1);
        avion1.encender();
        avion1.avanzar(120);

        System.out.println("--------------------------------------------------------------------------------------------");;

        Automovil carro1 = new Automovil(5,true, "gasolina", "Mustang",
                2, "Ford", 2023);
        System.out.println(carro1);
        carro1.encender();
        carro1.pitar();
        carro1.avanzar(180);
        carro1.cambiarNeumatico(2);

        System.out.println("--------------------------------------------------------------------------------------------");;

        Taxi taxi1 = new Taxi(5,true,"gasolina","Jetta\n",4,
                "VW", 2017, Color.PINK,"Plataforma", 11.99);
        System.out.println(taxi1);
        taxi1.encender();
        taxi1.pitar();
        taxi1.comenzar();
        taxi1.avanzar(60);
        taxi1.cobrar(33);
    }
}