    //JOSE MANUEL PEREZ MOLINA 2208//

public class Vasos {
    private int unidades;   //50u
    private int capacidad; //200ml

    public Vasos() {
    }

    public Vasos(int unidades, int capacidad) {
        this.unidades = unidades;
        this.capacidad = capacidad;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Vasos{" +
                "unidades=" + unidades +
                ", capacidad=" + capacidad +
                '}';
    }
}
