
//PEREZ MOLINA JOSE MANUEL 2208//

package ico.fesa2208;

import java.awt.*;

public class Lampara {

    private String tipo;
    private int potencia;
    private Color color;
    private boolean inteligente;

    public Lampara() {
    }

    public Lampara(String tipo, int potencia, Color color, boolean inteligente) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.color = color;
        this.inteligente = inteligente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isInteligente() {
        return inteligente;
    }

    public void setInteligente(boolean inteligente) {
        this.inteligente = inteligente;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "tipo='" + tipo + '\'' +
                ", potencia=" + potencia +
                ", color=" + color +
                ", inteligente=" + inteligente +
                '}';
    }

    public void encender(){
        System.out.println("La lampara esta encendida");
    }

    public void iluminar(){
        System.out.println("Ilumina el espacio de: " + this.color);
    }

    public  void consumo(){
        System.out.println("El consumo es de: " + this.potencia + "w");
    }

}
