/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.SQLException;

/**
 *
 * @author Natã Souza Batista
 */
public class Usuario {
   

    private String nome_usuario;
    private String senha_usuario;

    
    public Usuario(String nome_usuario, String senha_usuario) {
        this.nome_usuario = nome_usuario;
        this.senha_usuario = senha_usuario;
    }



    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
//
        public boolean InsertUsuarioBD(String nome_usuario, String senha_usuario  ) throws SQLException {
       
        Usuario objeto = new Usuario(nome_usuario, senha_usuario);
//        AlunoDAO.MinhaLista.add(objeto);
        //dao.InsertUsuarioBD(objeto);
        return true;
    
        }    
}
