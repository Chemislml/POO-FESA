//PEREZ MOLINA JOSE MANUEL

package org.example;

import org.example.controlador.ControladorAutor;
import org.example.vista.VentanaAutores;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaAutores ven1 = new VentanaAutores("Autores famosos");
        ControladorAutor controller = new ControladorAutor(ven1);
    }
}