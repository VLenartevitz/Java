/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class Produto {
    private int codigo;
    private String descricao;
    private String nomeProduto;

    Conexao con = new Conexao();
    
    public Produto() {
        this(0,"","");
    }

    public Produto(int codigo, String descricao, String nomeProduto) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.nomeProduto = nomeProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void cadastrarProduto(){
        String sql = "insert into infoConsultaProduto(codigo,nomeProduto,Descricao) values" + "('" + getCodigo() + "' , '" + getNomeProduto() + "','" + getDescricao() + "')";
        
     con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");

    }
    public ResultSet listarProduto(){
    ResultSet tabela;
       tabela = null;
       String sql = "Select * from infoConsultaProduto";
       tabela = con.RetornarResultset(sql);
       return tabela;
    
}

}
