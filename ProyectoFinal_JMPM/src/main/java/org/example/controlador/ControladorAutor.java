//PEREZ MOLINA JOSE MANUEL

package org.example.controlador;

import org.example.modelo.Autores;
import org.example.modelo.ModeloTablaAutores;
import org.example.vista.VentanaAutores;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class ControladorAutor extends MouseAdapter {

    private VentanaAutores view;
    private ModeloTablaAutores modelo;

    public ControladorAutor(VentanaAutores view) {
        this.view = view;
        modelo = new ModeloTablaAutores();
        this.view.getTblAutor().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getTblAutor().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnModificar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnLimpiar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {

            modelo.cargarDatos();
            this.view.getTblAutor().setModel(modelo);
            this.view.getTblAutor().updateUI();
        }

        //Evento para agregar autores a la tabla
        if (e.getSource() == this.view.getBtnAgregar()) {
            Autores autor = new Autores();
            try {
                autor.setId(0);
                autor.setNombre(this.view.getTxtNombre().getText());
                autor.setEdad(Integer.parseInt(this.view.getTxtEdad().getText()));
                autor.setNacionalidad(this.view.getTxtNacionalidad().getText());
                autor.setFinado(this.view.getCmbFinado().getSelectedItem().toString());
                autor.setUrl_Imagen(this.view.getTxtImagen().getText());
                if (modelo.agregarAutor(autor)) {
                    ImageIcon icon = new ImageIcon("partido.png");
                    JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso",
                            JOptionPane.INFORMATION_MESSAGE,icon);
                    modelo.cargarDatos();
                    this.view.getTblAutor().setModel(modelo);
                    this.view.getTblAutor().updateUI();
                } else {
                    JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos," +
                            " por favor revise su conexión ", "Error al insertar", JOptionPane.ERROR_MESSAGE);
                }
                this.view.limpiar();
            }catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(view, "Ingresa un valor numerico en el campo Edad", "Error ", JOptionPane.ERROR_MESSAGE);
            }
        }

        //Evento de boton limpiar
        if (e.getSource() == this.view.getBtnLimpiar()){
            this.view.limpiar();
        }


        //Evento para obtener los valores y la imagen de la tabla
        if (e.getSource() == this.view.getTblAutor()) {
            int index = this.view.getTblAutor().getSelectedRow();
            Autores tmp = modelo.getAutorAddIndex(index);

            this.view.getTxtNombre().setText(tmp.getNombre());
            this.view.getTxtEdad().setText(Integer.toString(tmp.getEdad()));
            this.view.getTxtNacionalidad().setText(tmp.getNacionalidad());
            this.view.getCmbFinado().getSelectedItem();
            this.view.getTxtImagen().setText(tmp.getUrl_Imagen());

            this.view.getLblInfoSel().setText("Usted selecciono el elemento No." + tmp.getId());

            try {
                this.view.getLblImagen().setIcon(tmp.getImagenI());
            } catch (MalformedURLException mfue) {
                System.out.println(mfue.getMessage());
            }
        }


            //Evento del boton para modificar la tabla
        if (e.getSource() == this.view.getBtnModificar()) {
            int index = this.view.getTblAutor().getSelectedRow();
            Autores tmp = modelo.getAutorAddIndex(index);
            Autores autor = new Autores();
            try {
                autor.setNombre(this.view.getTxtNombre().getText());
                autor.setEdad(Integer.parseInt(this.view.getTxtEdad().getText()));
                autor.setNacionalidad(this.view.getTxtNacionalidad().getText());
                autor.setFinado(this.view.getCmbFinado().getSelectedItem().toString());
                autor.setUrl_Imagen(this.view.getTxtImagen().getText());
                autor.setId(tmp.getId());

                if (modelo.modificarAutor(autor)) {
                    ImageIcon icon = new ImageIcon("lapiz.png");
                    JOptionPane.showMessageDialog(view, "Se modifico correctamente", "Aviso"
                            , JOptionPane.INFORMATION_MESSAGE, icon);
                    modelo.cargarDatos();
                    this.view.getTblAutor().setModel(modelo);
                    this.view.getTblAutor().updateUI();
                } else {
                    JOptionPane.showMessageDialog(view, "No se pudo modificar a la base de datos," +
                            " por favor revise su conexión ", "Error al modificar", JOptionPane.ERROR_MESSAGE);
                }
                this.view.getTblAutor().updateUI();
                this.view.limpiar();
            }catch (SQLException sqle){
                System.out.println(sqle.getMessage());
            }
        }


                //Evento boton eliminar
            if (e.getSource() == this.view.getBtnEliminar()) {
                ModeloTablaAutores temp = new ModeloTablaAutores();
                int index = this.view.getTblAutor().getSelectedRow();
                Autores tmp = modelo.getAutorAddIndex(index);

                if (temp.eliminarAutor(Integer.toString(tmp.getId()))) {
                    ImageIcon icon = new ImageIcon("borrador.png");
                    JOptionPane.showMessageDialog(view, "Se elimino correctamente", "Aviso"
                            , JOptionPane.INFORMATION_MESSAGE);
                    modelo.cargarDatos();
                    this.view.getTblAutor().updateUI();
                    this.view.limpiar();
                } else {
                    JOptionPane.showMessageDialog(view, "No se pudo eliminar de la base de datos", "Error al insertar", JOptionPane.ERROR_MESSAGE);
                }

            }

        }
    }


