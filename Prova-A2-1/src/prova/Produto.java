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



public abstract class Produto {
    private int id;
    private String nome;
    private String marca;
    private double preco;

    public Produto(int id, String nome, String marca, double preco) {
        setId(id);
        setNome(nome);
        setMarca(marca);
        setPreco(preco);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
        } 
        else{
            System.out.println("Preço não alterado");
        }
    }
    
    public abstract void mostraDadosProduto();
    
}
