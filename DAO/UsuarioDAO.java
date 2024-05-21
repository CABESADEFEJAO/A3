/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection connection;

    public ResultSet autenticacaoUsuario(Usuario objetousuario) {

        connection = new ConexaoDAO().getConexao();

        try {
            String sql = "select * from login_tb where nome_usuario = ? and senha_usuario = ?";

            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, objetousuario.getNome_usuario());
            pstm.setString(2, objetousuario.getSenha_usuario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Usuario: " + erro);
            return null;
        }
    }

    public boolean InsertUsuarioBD(Usuario objeto) {
        connection = new ConexaoDAO().getConexao();

        try {
            String sql = "INSERT INTO login_tb(nome_usuario, senha_usuario) VALUES(?,?,)";

          PreparedStatement pstm = connection.prepareStatement(sql);

       
           pstm.setString(1, objeto.getNome_usuario());
            pstm.setString(1, objeto.getSenha_usuario());

            pstm.execute();
            pstm.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

}
