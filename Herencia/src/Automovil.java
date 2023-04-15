    //PEREZ MOLINA JOSE MANUEL 2208//

public class Automovil extends Vehiculo{
    protected String modelo;
    protected int numPuertas;
    protected String marca;
    protected int anio;

    public Automovil() {
    }

    public Automovil(int numPasajeros, boolean ruedas, String tipoCombustible,
                     String modelo, int numPuertas, String marca, int anio) {
        super(numPasajeros, ruedas, tipoCombustible);
        this.modelo = modelo;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "modelo='" + modelo + '\'' +
                ", numPuertas=" + numPuertas +
                ", marca='" + marca + '\'' +
                ", anio=" + anio +
                ", numPasajeros=" + numPasajeros +
                ", terrestre=" + terrestre +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }
    public void pitar(){
        System.out.println("*PIII!!");
    }
    public void cambiarNeumatico(int llantas){
        if (llantas == 1){
            System.out.println("Se cambio 1 neumatico");
        }
        else {
            System.out.println("Se cambiaron " + llantas + " neumaticos");
        }
    }

    @Override
    public void avanzar(double KmH) {
        System.out.println("El auto avanza a una velocidad de "+ KmH + "Km/h" );
    }

}
