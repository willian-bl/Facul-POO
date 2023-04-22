/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author Willian Brito de Lima
 * @author Leandro Henrique Guilhermiti de Oliveira
 */
public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String dataValidade, int id, String nome, String marca, double preco) {
        super(id, nome, marca, preco);
        this.dataValidade = dataValidade;
    }
    
    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    @Override
    public void mostraDadosProduto(){
        System.out.println("ID: " + super.getId() + " | Nome: " + super.getNome() +
                "\nMarca: " + super.getMarca() + " | Preço: " + super.getPreco() + " | Data de validade: " + getDataValidade());
    }
    
}
