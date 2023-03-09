
//PEREZ MOLINA JOSE MANUEL 2208//

package ico.fesa2208;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;

public class Pais {

    private String nombre;
    private String continente;
    private double territorio;
    private int poblacion;
    private String moneda;

    public Pais() {
    }

    public Pais(String nombre,String continente, double territorio, int poblacion, String moneda) {
        this.nombre = nombre;
        this.continente = continente;
        this.territorio = territorio;
        this.poblacion = poblacion;
        this.moneda = moneda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public double getTerritorio() {
        return territorio;
    }

    public void setTerritorio(double territorio) {
        this.territorio = territorio;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                ", territorio=" + territorio +
                ", poblacion=" + poblacion +
                ", moneda='" + moneda + '\'' +
                '}';
    }

    public void setCont(String c) {
        ArrayList<String> conti = new ArrayList<>();
        conti.add("ASIA");
        conti.add("EUROPA");
        conti.add("AFRICA");
        conti.add("AMERICA");
        conti.add("OCEANIA");

        if (conti.contains(c.toUpperCase())) {
            this.continente = c;
        } else {
            System.out.println("El continente no existe");
        }
    }

    public void densPob(int po, double t) {
        po = this.poblacion;
        t = this.territorio;
        System.out.println("La densidad de poblacion es: " + po/t);
    }

    public void setMon(String m) {
        ArrayList<String> mon = new ArrayList<>();
        mon.add("EUR");
        mon.add("USD");
        mon.add("MXN");
        mon.add("GBP");
        mon.add("JPY");

        if (mon.contains(m.toUpperCase())) {
            this.moneda = m;
        } else {
            System.out.println("No se encuentra la moneda");
        }
    }
}