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
    private String dataCriacao;
    private String area;
    
    public String getNome(){
        return nome;
    }
    
    public String getCoordenador(){
        return coordenador;
    }
    
    public String getDataCriacao(){
        return dataCriacao;
    }
    
    public String getArea(){
        return area;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public void setCoordenador(String c){
        coordenador = c;
    }
    
    public void setDataCriacao(String data){
        dataCriacao = data;
    }

    public void setArea(String a) {
        area = a;
    }
          
    public void printCurso(){
        System.out.printf("%s%s%n", "Nome: ", nome);
        System.out.printf("%s%s%n", "Coordenador: ", coordenador);
        System.out.printf("%s%s%n", "DataCriacao: ", dataCriacao);
        System.out.printf("%s%s%n", "Area: ", area);
    }
    
}
