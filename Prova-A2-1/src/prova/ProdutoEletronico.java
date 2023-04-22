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
public class ProdutoEletronico extends Produto{
    private int voltagem;

    public ProdutoEletronico(int voltagem, int id, String nome, String marca, double preco) {
        super(id, nome, marca, preco);
        this.voltagem = voltagem;
    }
    
    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
            
    public void mostraDadosProduto(){
        System.out.println("ID: " + super.getId() + " | Nome: " + super.getNome() +
                "\nMarca: " + super.getMarca() + " | Preço: " + super.getPreco() + " | Voltagem: " + getVoltagem());
    }
}
