/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitos;

/**
 *
 * @author willi
 */


// A classe fornece o encapsulamento em Java
// Podemos proteger os dados e impor restrições/validações 
public class Aluno {
    
    // Os atributos ou variáveis são declarados fora de qualquer método
    // Para declarar uma variável inteira, utilizamos o tipo int
    private int rgm;  // int é um tipo primitivo, não uma classe
    private String nomeAluno;  // String com letra maiúscula, pois é uma classe
    private Curso cursoAluno; // private String nomeAluno, cursoAluno é uma declaração de variáveis de mesmo tipo em uma só linha
    private double notaAluno; 
    
    public Aluno(int rgm, String nomeAluno, Curso cursoAluno, double notaAluno){
        this.rgm = rgm;
        this.nomeAluno = nomeAluno;
        this.cursoAluno = cursoAluno;
        setNotaAluno(notaAluno);
    }
    
    // Preciso criar mecanismos ou métodos para ter acesso aos dados ou atributos privados
    // Colocamos double porque o retorno do método é um número real
    // No Java, precisamos declarar o tipo da variável que a função retorna
    // get é obter
    public double getNotaAluno(){
        return this.notaAluno;
    }
    
    // Quando a função não retorna nada usamos void
    // set altera o valor de um atributo
    public void setNotaAluno(double notaAluno){
        if (notaAluno>=0 && notaAluno<=10){
            this.notaAluno = notaAluno;    
        }
        else{
            this.notaAluno = notaAluno;
        }
    }
    
    public int getRgm(){
        return this.rgm;
    }
    
    public void setRgm(int rgm){  //O parâmetro r é uma variável local, que só existe dentro do método
        this.rgm = rgm;
    }
    
    public String getNomeAluno(){
        return this.nomeAluno;
    }
    
    public void setNomeAluno(String nomeAluno){
        this.nomeAluno=nomeAluno;
    }
    
    public Curso getCursoAluno(){
        return this.cursoAluno;
    }
    
    public void setCursoAluno(Curso cursoAluno){
        this.cursoAluno = cursoAluno;
    }
    
    public void printAluno() {
        System.out.printf("%s%d%n", "RGM: ", this.rgm);
        System.out.printf("%s%s%n", "Nome: ", this.nomeAluno);
        System.out.printf("%s%s%n", "Curso: ", this.cursoAluno.getNome());
        System.out.printf("%s%2f%n", "Nota: ", this.notaAluno);
    }
    
}
