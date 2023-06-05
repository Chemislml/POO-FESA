//PEREZ MOLINA JOSE MANUEL

package org.example.persistencia;

import org.example.modelo.Autores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AutorDAO implements InterfazDAO{
    public AutorDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO autores(Nombre, Edad, Nacionalidad, Finado, Url_Imagen) VALUES(?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("AutoresDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Autores)obj).getNombre());
        pstm.setInt(2,((Autores)obj).getEdad());
        pstm.setString(3,((Autores)obj).getNacionalidad());
        pstm.setString(4,((Autores)obj).getFinado());
        pstm.setString(5,((Autores)obj).getUrl_Imagen());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Autores SET Nombre = ?, Edad = ?, Nacionalidad = ?, Finado = ?, Url_Imagen = ? WHERE Id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("AutoresDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Autores)obj).getNombre());
        pstm.setInt(2,((Autores)obj).getEdad());
        pstm.setString(3,((Autores)obj).getNacionalidad());
        pstm.setString(4,((Autores)obj).getFinado());
        pstm.setString(5,((Autores)obj).getUrl_Imagen());
        pstm.setInt(6,((Autores)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM autores WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("AutoresDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM autores";
        ArrayList<Autores> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("AutoresDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            resultado.add(new Autores(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6)));
        }

        return resultado;
    }

        //No se ocupo este metodo
    /*
    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM autores WHERE Id = ?;";
        Autores autores = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("AutoresDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            autores = new Autores(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getString(6));
            return autores;
        }

        return null;
    }

    */
}

