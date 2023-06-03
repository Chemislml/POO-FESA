//PEREZ MOLINA JOSE MANUEL

package org.example.modelo;

import org.example.persistencia.AutorDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaAutores  implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<Autores> datos;
    private AutorDAO adao;

    public ModeloTablaAutores() {
        adao = new AutorDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaAutores(ArrayList<Autores> datos) {
        this.datos = datos;
        adao = new AutorDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Edad";
            case 3:
                return "Nacionalidad";
            case 4:
                return "Finado";
            case 5:
                return "Imagen";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;

        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Autores tmp = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getEdad();
            case 3:
                return tmp.getNacionalidad();
            case 4:
                return tmp.getFinado();
            case 5:
                return tmp.getUrl_Imagen();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch (columnIndex){

            case 1:
                datos.get(rowIndex).setNombre((String) o );
                break;
            case 2:
                datos.get(rowIndex).setEdad((int) o);
                break;
            case 3:
                datos.get(rowIndex).setNacionalidad((String) o );
                break;
            case 4:
                datos.get(rowIndex).setFinado((String) o);
                break;
            case 5:
                datos.get(rowIndex).setUrl_Imagen((String) o );
                break;
            default:
                System.out.println("No se modifica nada");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos(){
        try {
            ArrayList<Autores> carga = adao.obtenerTodo();
            System.out.println(carga);
            datos = adao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

    }

    public boolean agregarAutor(Autores autor){
        boolean resultado = false;
        try {
            if (adao.insertar(autor)){
                datos.add(autor);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;

    }

    public boolean modificarAutor(Autores autor) throws SQLException{
        boolean resultado = false;
        try {
            if (adao.update(autor)){
                datos.add(autor);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }


    public boolean eliminarAutor(String id) {
        boolean resultado = false;
        try {
            if (adao.delete(id)){
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public Autores getAutorAddIndex(int index){
        return datos.get(index);
    }


}

