/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class Usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;
    
        Conexao conUsu = new Conexao();


    public Usuario() {
        this("","","","");
    }

    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void cadastrarUsuario(){
     String sql = "insert into infousu(nome,email,login,senha) values" + "('" + getNome() + "' , '" + getEmail() + "','" + getLogin() +"','" + getSenha()+"')";
        
     conUsu.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");

    };
    public ResultSet listarUsuario(){
       ResultSet tabela;
       tabela = null;
       String sql = "Select * from infousu";
       tabela = conUsu.RetornarResultset(sql);
       return tabela;
        
    };
    
}
