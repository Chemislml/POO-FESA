
//PEREZ MOLINA JOSE MANUEL 2208//

package ico.fesa2208;

public class Giroscopio {
    private String tipo;
    private int tamanio;
    private String marca;

    public Giroscopio() {
    }

    public Giroscopio(String tipo, int tamanio, String marca) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "tipo='" + tipo + '\'' +
                ", tamanio=" + tamanio +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void ajustar(){
        System.out.println("El horizonte esta en esta direccion");
    }
    public void girar(){
        System.out.println("El giroscopio est girando");
    }

}
