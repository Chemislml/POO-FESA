public class Persona {
    private String nombre;
    private byte edad;
    private double estatura;
    private double peso;
    private String genero;

    public Persona(){
        edad=18;
        estatura=160;
        peso=68;
        nombre="Jaime";
        genero="Maculino";
    }
    public Persona(String nombre, byte edad, double estatura, double peso, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Estatura=" + estatura +
                ", Peso=" + peso +
                ", Genero='" + genero + '\'' +
                '}';
    }
    public void caminar(){
        System.out.println("La persona esta caminando...");
    }
    public void comer(){
        System.out.println("la persona esta comiendo...");
    }

    public void dormir(){
        System.out.println("La persona esta dormiendo...");
    }
}