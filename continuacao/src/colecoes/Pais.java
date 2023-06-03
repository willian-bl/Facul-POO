/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;

/**
 *
 * @author willi
 */

// Exercício para treinar para a prova 
//
// Criar uma classe denominada Pais (País). Os atributos dessa classe são:
// int idPais;
// String nomePais;
// String capitalPais;
// long populacao; 
// String continente;
// ArrayList <Pais> vizinhos;

// Além dos métodos get/set, definir métodos para incluir objetos do tipo Pais no ArrayList Vizinhos. 
// No ArrayList não  pode ocorrer a duplicidade de países e nem país igual ao país atual (usar o nome do país para testar)
// E um método para excluir objetos do ArrayList
// Usar o nome para fazer os testes


import java.util.*;

public class Pais {
    private int idPais;
    private String nomePais;
    private String capitalPais;
    private long populacao;  // long é um número inteiro que pode representar um número maior
    private String continente;
    private ArrayList<Pais> vizinhos = new ArrayList();
    
    
    public Pais(int idPais, String nomePais, String capitalPais, long populacao, String continente){
        this.idPais = idPais;
        this.nomePais = nomePais;
        this.capitalPais = capitalPais;
        this.populacao = populacao;
        this.continente = continente;
    }
    
    
    public int getIdPais(){
        return this.idPais;
    }

    public void setIdPais(int idPais){
        this.idPais = idPais;
    }
    
    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getCapitalPais() {
        return capitalPais;
    }

    public void setCapitalPais(String capitalPais) {
        this.capitalPais = capitalPais;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
    
    private boolean vizinhoValido(Pais paisParaTeste){
        String nomePaisParaTeste = paisParaTeste.getNomePais();
        
        if (this.getNomePais().equalsIgnoreCase(nomePaisParaTeste)){
            return false;
        }
        
        // for(int i = 0; i < this.vizinhos.size(); i++){
        for(Pais v:this.vizinhos){  // Com esse for fica mais fácil
            String nomeVizinho = v.getNomePais();
            if(nomeVizinho.equalsIgnoreCase(nomePaisParaTeste)){
                return false;
            }
        }
        
        return true;
    }
    
    public void adicionaVizinho(Pais p){
        if(this.vizinhoValido(p)){
            this.vizinhos.add(p);
        }
        else{
            System.out.println("O país passado para ser vizinho não é válido ou já está na lista. Verifique!");
        }
        
    }
    
    public Pais removeVizinho(Pais p){
        Pais vizinho;
        for(int i = 0; i < this.vizinhos.size(); i++){
            vizinho = this.vizinhos.get(i);
            if (p.getNomePais().equalsIgnoreCase(vizinho.getNomePais())){
                this.vizinhos.remove(i);
                System.out.println("País " + vizinho.getNomePais() + " removido da lista de vizinhos!");
                return vizinho;
            }
        }
        System.out.println("O país passado não está na lista. Não foi possível removê-lo.");
        return null;
    }
    
    public Pais removeVizinho2(Pais p){
        Pais vizinho;
        Iterator <Pais> iter = this.vizinhos.iterator();
        while (iter.hasNext()){
            vizinho = iter.next();
            if (p.getNomePais().equalsIgnoreCase(vizinho.getNomePais())){
                iter.remove();
                System.out.println("País " + vizinho.getNomePais() + " removido da lista de vizinhos!");
                return vizinho;
            }
        }
        System.out.println("O país passado não está na lista. Não foi possível removê-lo.");
        return null;
    }

    @Override
    public String toString(){
        String s = "ID: " + this.getIdPais() + " | País: " + this.getNomePais() + " | Capital: " + this.getCapitalPais() +
                   "\nContinente: " + this.getContinente() + " | População: " + this.getPopulacao() +
                   "\nPaíses vizinhos: ";
        
        if (this.vizinhos.isEmpty()){
            s += "Sem países vizinhos adicionados";
        } else {
            for(Pais p:this.vizinhos){
                s = s + p.getNomePais() + ", ";
            }
            s = s.substring(0, s.length() - 2);
        }
        s += "\n";
        return s;
    }
    
    
}
