
//PEREZ MOLINA JOSE MANUEL 2208//

package ico.fesa2208;

import java.awt.*;
import java.util.Random;

public class Gato {

    private Color color;
    private int edad;
    private String raza;

    private String genero;

    public Gato() {
    }

    public Gato(Color color, int edad, String raza, String genero) {
        this.color = color;
        this.edad = edad;
        this.raza = raza;
        this.genero = genero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "color=" + color +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void salta(){
        Random rand = new Random();
        double upperbound = 1;
        double random = rand.nextDouble(upperbound);
        System.out.println("El gato salta " + rand + "m");
    }

    public void comer(){
        System.out.println("El gato esta comiendo...");
    }
    public void sueño(){
        System.out.println("El gato esta durmiendo...");
    }

}
