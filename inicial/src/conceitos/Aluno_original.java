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
public class Aluno_original {
    
    // Os atributos ou variáveis são declarados fora de qualquer método
    // Para declarar uma variável inteira, utilizamos o tipo int
    private int rgm;  // int é um tipo primitivo, não uma classe
    private String nomeAluno;  // String com letra maiúscula, pois é uma classe
    private String cursoAluno; // private String nomeAluno, cursoAluno é uma declaração de variáveis de mesmo tipo em uma só linha
    private double notaAluno; 
    
    // Preciso criar mecanismos ou métodos para ter acesso aos dados ou atributos privados
    // Colocamos double porque o retorno do método é um número real
    // No Java, precisamos declarar o tipo da variável que a função retorna
    // get é obter
    public double getNotaAluno(){
        return notaAluno;
    }
    
    // Quando a função não retorna nada usamos void
    // set altera o valor de um atributo
    public void setNotaAluno(double n){
        if (n>=0 && n<=10){
            notaAluno = n;    
        }
        else{
            System.out.println("Nota não alterada"); // Print ln faz com que depois do print o cursor do console pule para a próxima linha. Se fosse só print o cursor ficaria parado na mesma linha.
        }
    }
    
    public int getRgm(){
        return rgm;
    }
    
    public void setRgm(int r){  //O parâmetro r é uma variável local, que só existe dentro do método
        rgm = r;
    }
    
    public String getNomeAluno(){
        return nomeAluno;
    }
    
    public void setNomeAluno(String n){
        nomeAluno=n;
    }
    
    public String getCursoAluno(){
        return cursoAluno;
    }
    
    public void setCursoAluno(String c){
        cursoAluno = c;
    }
    
    public void printAluno() {
        System.out.printf("%s%d%n", "RGM: ", rgm);
        System.out.printf("%s%s%n", "Nome: ", nomeAluno);
        System.out.printf("%s%s%n", "Curso: ", cursoAluno);
        System.out.printf("%s%2f%n", "Nota: ", notaAluno);
    }
    
}
