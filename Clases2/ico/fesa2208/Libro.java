
//PEREZ MOLINA JOSE MANUEL 2208//

package ico.fesa2208;

import com.sun.management.UnixOperatingSystemMXBean;

public class Libro {

    private int numPag;
    private String nombre;
    private String autor;
    private int anioPub;
    private int pag;

    public Libro() {
    }

    public Libro(int numPag, int anioPub, int pag, String autor, String nombre) {
        this.numPag = numPag;
        this.anioPub = anioPub;

        this.pag = pag;
        this.autor = autor;
        this.nombre = nombre;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getAnioPub() {
        return anioPub;
    }

    public void setAnioPub(int anioPub) {
        this.anioPub = anioPub;
    }


    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "numPag=" + numPag +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPub=" + anioPub +
                ", pag=" + pag +
                '}';
    }

    public void adaPag(int sig){
        sig = this.pag +1;
        System.out.println("Esta en la pag: " + sig);
    }

    public void retPag(int atras){
        atras = this.pag -1;
        System.out.println("Esta en la pag: " + atras);
    }

    public void Mostrar(String n, String au, int an, int np ){
        n = this.nombre;
        au = this.autor;
        an = this.anioPub;
        np = this.numPag;
        au.split(" ");

        System.out.println(au + "." + "(" + an +  ")" + " " + n + "." + np + "pág" );
    }

}
