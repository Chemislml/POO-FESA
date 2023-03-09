
//PEREZ MOLINA JOSE MANUEL 2208//

package ico.fesa2208;

public class CuboRubik {

    private String tipo;
    private String marca;
    private String material;
    private double costo;

    public CuboRubik() {
    }

    public CuboRubik(String tipo, String marca, String material, double costo) {
        this.tipo = tipo;
        this.marca = marca;
        this.material = material;
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "CuboRubik{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", costo=" + costo +
                '}';
    }

    public void rotarFilaDer(){
        System.out.println("La primera fila gira hacia la derecha ");
    }
    public void rotarFilaIzq(){
        System.out.println("La primera fila gira hacia la izquierda");
    }
    public void rotarColumDer(){
        System.out.println("La primera columna gira hacia la derecha ");
    }
    public void rotarColumiIzq(){
        System.out.println("La primera columna gira hacia la izquierda ");
    }

    public void abandonar(){
        System.out.println("El usuario no logró resolver el cubo");
    }

}
