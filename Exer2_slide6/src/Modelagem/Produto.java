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
public class Produto {
    private int codigo;
    private String descricao;
    private String nomeProduto;

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
    setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do Produto:")));
    setNomeProduto(JOptionPane.showInputDialog("Digite o Nome do Produto:"));
    setDescricao(JOptionPane.showInputDialog("Digite a Descrição do Produto:"));

    }
    public void listarProduto(){
    JOptionPane.showMessageDialog(null, "ID do Produto:" + getCodigo());
    JOptionPane.showMessageDialog(null, "Nome do Produto:" + getNomeProduto());
    JOptionPane.showMessageDialog(null, "Descrição do Produto:" + getDescricao());
    
}

}
