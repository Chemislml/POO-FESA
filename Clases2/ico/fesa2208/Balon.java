
//PEREZ MOLINA JOSE MANUEL 2208//

package ico.fesa2208;

import java.awt.*;
import java.util.Random;

public class Balon {

    private double circunferencia;
    private String material;
    private Color color;
    private String marca;

    public Balon() {

    }

    public Balon(double circunferencia, String material, Color color, String marca) {
        this.circunferencia = circunferencia;
        this.material = material;
        this.color = color;
        this.marca = marca;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "circunferencia=" + circunferencia +
                ", material='" + material + '\'' +
                ", color=" + color +
                ", marca='" + marca + '\'' +
                '}';
    }


    public void patear(){

    }

    public void botar(){
        System.out.println("El balon esta botando ");
    }

    public void setTam(){
        double tam = this.circunferencia;
        System.out.println("La circuferencia es: "+tam);
    }



}
