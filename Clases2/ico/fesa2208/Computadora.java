
//PEREZ MOLINA JOSE MANUEL 2208//

package ico.fesa2208;

import java.util.ArrayList;

public class Computadora {


    private boolean pantalla;
    private String tipo;
    private double peso;
    private int pulgadas;

    public Computadora() {
    }

    public Computadora(boolean pantalla, String tipo, double peso, int pulgadas) {
        this.pantalla = pantalla;
        this.tipo = tipo;
        this.peso = peso;
        this.pulgadas = pulgadas;
    }

    public boolean isPantalla() {
        return pantalla;
    }

    public void setPantalla(boolean pantalla) {
        this.pantalla = pantalla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Computadora(double peso) {
        this.peso = peso;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "pantalla=" + pantalla +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                ", pulgadas=" + pulgadas +
                '}';
    }

    public void encender(boolean m) {
        m = this.pantalla;
        m = true;
        System.out.println("La pantalla esta encendida: " + m);
    }

    public void type(String ty) {
        ArrayList<String> type = new ArrayList<>();
        type.add("ESCRITORIO");
        type.add("LAPTOP");

        if (type.contains(ty.toUpperCase())) {
            this.tipo = ty;
        } else {
            System.out.println("No existe el tipo");
        }
    }

    public void Peso(double p) {
        this.peso = p;
        System.out.println(p + "kg");
    }
}
