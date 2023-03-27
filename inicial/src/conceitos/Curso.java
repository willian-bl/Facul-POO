/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitos;

/**
 *
 * @author willi
 */
public class Curso {
    
    private String nome;
    private String coordenador;
    private int anoCriacao;
    private String area;
    
    public Curso(String nome, String area, int anoCriacao){
        setNome(nome);
        setArea(area);
        setAnoCriacao(anoCriacao);
        this.coordenador = "Sem dados";
    }
    
    public Curso(String nome, String area, int anoCriacao, String coordenador){
        setNome(nome);
        setArea(area);
        setAnoCriacao(anoCriacao);
        setCoordenador(coordenador);
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCoordenador(){
        return coordenador;
    }
    
    public int getAnoCriacao(){
        return anoCriacao;
    }
    
    public String getArea(){
        return area;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCoordenador(String coordenador){
        this.coordenador = coordenador;
    }
    
    public void setAnoCriacao(int ano){
        this.anoCriacao = ano;
    }

    public void setArea(String area) {
        this.area = area;
    }
          
    public void printCurso(){
        System.out.printf("%s%s%n", "Nome: ", nome);
        System.out.printf("%s%s%n", "Coordenador: ", coordenador);
        System.out.printf("%s%d%n", "anoCriacao: ", anoCriacao);
        System.out.printf("%s%s%n", "Area: ", area);
    }
    
}
