
    //PEREZ MOLINA JOSE MANUEL 2208//

import ico.fesa2208.*;

import java.awt.*;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("------------------------------------------------------------");

        Pais pais1 = new Pais("mexico","Holanda", 500, 300,"jpg");
        pais1.densPob(pais1.getPoblacion(), pais1.getTerritorio());
        pais1.setCont(pais1.getContinente());
        pais1.setMon(pais1.getMoneda());

        System.out.println("------------------------------------------------------------");

        Computadora comp1 = new Computadora(false, "Pequeña", 23.3, 14 );
        comp1.encender(comp1.isPantalla());
        comp1.type(comp1.getTipo());
        comp1.Peso(comp1.getPeso());

        System.out.println("------------------------------------------------------------");

        Libro lib1 = new Libro(200, 2004, 50,
                "Luis M ponce", "El fin del mundo");
        lib1.adaPag(lib1.getPag());
        lib1.retPag(lib1.getPag());
        lib1.Mostrar(lib1.getNombre(), lib1.getAutor(), lib1.getAnioPub(), lib1.getNumPag());

        System.out.println("------------------------------------------------------------");

        Giroscopio giro1 = new Giroscopio("Fibra",50,"Joytech");
        System.out.println(giro1);
        giro1.girar();
        giro1.ajustar();

        System.out.println("------------------------------------------------------------");

        Balon balon1 = new Balon(20.7, "piel", Color.BLUE, "Nike");
        balon1.patear();
        balon1.botar();
        balon1.setTam();

        System.out.println("------------------------------------------------------------");

        Lampara lamp1 = new Lampara("led", 25, Color.white, true);
        lamp1.consumo();
        lamp1.encender();
        lamp1.iluminar();

        System.out.println("------------------------------------------------------------");

        Gato gato1 = new Gato(Color.orange, 9, "Persa","Masculino");
        gato1.comer();
        gato1.salta();
        gato1.sueño();

        System.out.println("------------------------------------------------------------");

        CuboRubik cubo1 = new CuboRubik("3X3", "Hasbro", "Plastico", 334.99);
        cubo1.rotarColumDer();
        cubo1.rotarColumiIzq();
        cubo1.rotarFilaDer();
        cubo1.rotarFilaIzq();
        cubo1.abandonar();

        System.out.println("------------------------------------------------------------");

    }
}