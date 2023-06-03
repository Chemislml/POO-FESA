//PEREZ MOLINA JOSE MANUEL

package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaAutores extends JFrame {
    private JLabel lblId;
    private JLabel lblImagen;
    private JLabel lblNombre;
    private JLabel lblEdad;
    private JLabel lblNacionalidad;
    private JLabel lblFinado;
    private JLabel lblInfoSel;
    private JTextField txtId;
    private JTextField txtImagen;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtNacionalidad;
    private JComboBox<String> cmbFinado;
    private JButton btnAgregar;
    private JButton btnLimpiar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnModificar;
    private JTable tblAutor;
    private JScrollPane scrollPane;
    private GridLayout layaout;
    private JPanel panel1;  //Captura de Autores
    private JPanel panel2;  //Tabla para mostrar datos
    private JPanel panel3;  //Imagen del Autor
    private JPanel panel4;  //Manipulacion de la tabla

    public VentanaAutores(String title) throws HeadlessException {
        super(title);
        this.setSize(800,700);
        layaout = new GridLayout(2,2);
        this.getContentPane().setLayout(layaout);

        //Panel 1 ------------------------------------------------------------------------------
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(152, 188, 255));
        lblId = new JLabel("Id: ");
        lblId.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
        lblNombre = new JLabel("Nombre: ");
        lblNombre.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
        lblEdad = new JLabel("Edad: ");
        lblEdad.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
        lblNacionalidad = new JLabel("Nacionalidad: ");
        lblNacionalidad.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
        lblFinado = new JLabel("Finado(Si/No): ");
        lblFinado.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
        lblImagen = new JLabel("Url Imagen: ");
        lblImagen.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
        txtId = new JTextField(2);
        txtId.setFont(new Font("Arial", Font.PLAIN, 15));
        txtId.setText("0");
        txtId.setEnabled(false);
        txtNombre = new JTextField(21);
        txtNombre.setFont(new Font("Arial", Font.ITALIC, 15));
        txtEdad = new JTextField(3);
        txtEdad.setFont(new Font("Arial", Font.ITALIC, 15));
        txtNacionalidad = new JTextField(10);
        txtNacionalidad.setFont(new Font("Arial", Font.ITALIC, 15));
        cmbFinado = new JComboBox<>();
        cmbFinado.addItem("SI");
        cmbFinado.addItem("NO");
        txtImagen = new JTextField(28);
        txtImagen.setFont(new Font("Arial", Font.ITALIC, 15));
        btnAgregar = new JButton("Agregar");
        btnLimpiar = new JButton("Limpiar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblImagen);
        panel1.add(txtImagen);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblEdad);
        panel1.add(txtEdad);
        panel1.add(lblNacionalidad);
        panel1.add(txtNacionalidad);
        panel1.add(lblFinado);
        panel1.add(cmbFinado);
        panel1.add(cmbFinado);
        panel1.add(btnAgregar);
        panel1.add(btnLimpiar);

        //Panel 2 --------------------------------------------------------------------------------
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(164, 255, 128));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblAutor = new JTable();
        scrollPane = new JScrollPane(tblAutor);
        panel2.add(scrollPane);

        //Panel 3 --------------------------------------------------------------------------------
        panel3= new JPanel(new FlowLayout());
        panel3.setBackground(new Color(221, 152, 255));
        lblImagen = new JLabel(" ");
        panel3.add(lblImagen);

        //Panel 4 --------------------------------------------------------------------------------
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(255, 229, 55));
        lblInfoSel = new JLabel("Usted selecciono el elemento No. 0");
        lblInfoSel.setFont(new Font("Arial", Font.BOLD, 15));
        JLabel accion = new JLabel("¿Que desea hacer?");
        accion.setFont(new Font("Arial", Font.BOLD, 15));
        btnEliminar = new JButton("Eliminar");
        btnModificar = new JButton("Modificar");

        panel4.add(lblInfoSel);
        panel4.add(accion);
        panel4.add(btnEliminar);
        panel4.add(btnModificar);


        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblEdad() {
        return lblEdad;
    }

    public void setLblEdad(JLabel lblEdad) {
        this.lblEdad = lblEdad;
    }

    public JLabel getLblNacionalidad() {
        return lblNacionalidad;
    }

    public void setLblNacionalidad(JLabel lblNacionalidad) {
        this.lblNacionalidad = lblNacionalidad;
    }

    public JLabel getLblFinado() {
        return lblFinado;
    }

    public void setLblFinado(JLabel lblFinado) {
        this.lblFinado = lblFinado;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtImagen() {
        return txtImagen;
    }

    public void setTxtImagen(JTextField txtImagen) {
        this.txtImagen = txtImagen;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtEdad() {
        return txtEdad;
    }

    public void setTxtEdad(JTextField txtEdad) {
        this.txtEdad = txtEdad;
    }

    public JTextField getTxtNacionalidad() {
        return txtNacionalidad;
    }

    public void setTxtNacionalidad(JTextField txtNacionalidad) {
        this.txtNacionalidad = txtNacionalidad;
    }

    public JComboBox<String> getCmbFinado() {
        return cmbFinado;
    }

    public void setCmbFinado(JComboBox<String> cmbFinado) {
        this.cmbFinado = cmbFinado;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JTable getTblAutor() {
        return tblAutor;
    }

    public void setTblAutor(JTable tblAutor) {
        this.tblAutor = tblAutor;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public GridLayout getLayaout() {
        return layaout;
    }

    public void setLayaout(GridLayout layaout) {
        this.layaout = layaout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getLblInfoSel() {
        return lblInfoSel;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public void setLblInfoSel(JLabel lblInfoSel) {
        this.lblInfoSel = lblInfoSel;
    }

    public void limpiar(){
        txtNombre.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtImagen.setText("");
    }

}

