/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

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
    setNome(JOptionPane.showInputDialog("Digite o Nome do Usuario:"));
    setNome(JOptionPane.showInputDialog("Digite o Email do Usuario:"));
    setNome(JOptionPane.showInputDialog("Digite o Login do Usuario:"));
    setNome(JOptionPane.showInputDialog("Digite o Senha do Usuario:"));

    }
    public void listarUsuario(){
    JOptionPane.showMessageDialog(null, "Nome:" + getNome());
    JOptionPane.showMessageDialog(null, "Email:" + getEmail());
    JOptionPane.showMessageDialog(null, "Login:" + getLogin());
    JOptionPane.showMessageDialog(null, "Senha:" + getSenha());

        
                
    }
    
}
