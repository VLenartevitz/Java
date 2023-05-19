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
public class Venda {
    private int codigo;
    private String nomeVendedor;
    private String nomeProduto;

    public Venda() {
        this(0,"","");
    }
        Conexao con = new Conexao();


    public Venda(int codigo, String nomeVendedor, String nomeProduto) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.nomeProduto = nomeProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void cadastrarVenda(){
        String sql = "insert into infoConsultaVenda(codigo,nomeVendedor,nomeProduto) values" + "('" + getCodigo() + "' , '" + getNomeVendedor() + "','" + getNomeProduto() + "')";
        
     con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");

    }
    public ResultSet listarVenda(){
    ResultSet tabela;
       tabela = null;
       String sql = "Select * from infoConsultaVenda";
       tabela = con.RetornarResultset(sql);
       return tabela;
    
}
    
}
