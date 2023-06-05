//PEREZ MOLINA JOSE MANUEL

package org.example;

import org.example.controlador.ControladorAutor;
import org.example.vista.VentanaAutores;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        VentanaAutores ven1 = new VentanaAutores("Autores famosos");
        ControladorAutor controller = new ControladorAutor(ven1);

        UIManager.put("OptionPane.background", Color.red);
        UIManager.put("Panel.background", Color.red);
        UIManager.put("OptionPane.messageForeground",Color.white);
        UIManager.put("Button.background", Color.white);
        ImageIcon icon = new ImageIcon("unam.png");
        JOptionPane.showMessageDialog(ven1,"PROYECTO FINAL \n JOSE MANUEL PEREZ MOLINA \n 2208",
                "Bienvenido!!", JOptionPane.INFORMATION_MESSAGE, icon );


    }
}