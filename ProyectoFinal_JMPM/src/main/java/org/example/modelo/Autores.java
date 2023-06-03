//PEREZ MOLINA JOSE MANUEL

package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Autores extends Object{
    private int id;
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String finado;
    private String url_Imagen;

    public Autores() {
    }

    public Autores(int id, String nombre, int edad, String nacionalidad, String finado, String url_Imagen) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.finado = finado;
        this.url_Imagen = url_Imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFinado() {
        return finado;
    }

    public void setFinado(String finado) {
        this.finado = finado;
    }

    public String getUrl_Imagen() {
        return url_Imagen;
    }

    public void setUrl_Imagen(String url_Imagen) {
        this.url_Imagen = url_Imagen;
    }

    @Override
    public String toString() {
        return "Autores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", finado='" + finado + '\'' +
                ", urlImagen='" + url_Imagen + '\'' +
                '}';
    }

    public ImageIcon getImagenI() throws MalformedURLException {

        URL urlI = new URL(this.url_Imagen);
        return new ImageIcon(urlI);

    }
}
