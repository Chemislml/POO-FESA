    //PEREZ MOLINA JOSE MANUEL 2208//

import java.awt.*;

public class Taxi extends Automovil{
    private Color disenio;
    private String tipoServicio;
    private double tarifaKm;

    public Taxi() {
    }

    public Taxi(int numPasajeros, boolean ruedas, String tipoCombustible, String modelo,
                int numPuertas, String marca, int anio, Color disenio, String tipoServicio,
                double tarifaKm) {
        super(numPasajeros, ruedas, tipoCombustible, modelo, numPuertas, marca, anio);
        this.disenio = disenio;
        this.tipoServicio = tipoServicio;
        this.tarifaKm = tarifaKm;
    }

    public Color getDisenio() {
        return disenio;
    }

    public void setDisenio(Color disenio) {
        this.disenio = disenio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public double getTarifaKm() {
        return tarifaKm;
    }

    public void setTarifaKm(double tarifaKm) {
        this.tarifaKm= tarifaKm;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "disenio=" + disenio +
                ", tipoServicio='" + tipoServicio + '\'' +
                ", tarifaMinima=" + tarifaKm +
                ", modelo='" + modelo + '\'' +
                ", numPuertas=" + numPuertas +
                ", marca='" + marca + '\'' +
                ", anio=" + anio +
                ", numPasajeros=" + numPasajeros +
                ", terrestre=" + terrestre +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }
    public void cobrar(double Km){
        double total = Km * this.tarifaKm;
        System.out.println("Serian " + total + " pesos");
    }
    public void comenzar(){
        System.out.println("El viaje ha iniciado...");
    }

    @Override
    public void avanzar(double KmH) {
        System.out.println("El Taxi avanza a una velocidad de "+ KmH + "Km/h" );
    }
}
