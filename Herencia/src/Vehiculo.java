    //PEREZ MOLINA JOSE MANUEL 2208//

public class Vehiculo {
    protected int numPasajeros;
    protected boolean terrestre;
    protected String tipoCombustible;


    public Vehiculo() {
    }
    public Vehiculo(int numPasajeros, boolean terrestre, String tipoCombustible) {
        this.numPasajeros = numPasajeros;
        this.terrestre = terrestre;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public boolean isTerrestre() {
        return terrestre;
    }

    public void setTerrestre(boolean terrestre) {
        this.terrestre = terrestre;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numPasajeros=" + numPasajeros +
                ", terrestre=" + terrestre +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }

    public void encender(){
        System.out.println("El vehiculo esta encendido...");
    }
    public void avanzar(double KmH){
        System.out.println("El vehiculo avanza a una velocidad de "+ KmH + "Km/h" );
    }
}
