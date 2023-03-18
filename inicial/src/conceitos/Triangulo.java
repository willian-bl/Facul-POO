/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitos;

/**
 *
 * @author willi
 */

/* Exercício - Criar uma classe denominada Triangulo. 
    Atributos:
    double lado1, lado2, lado3
    
    1) Construir um método get e um método set para cada um dos atributos
    2) Os valores válidos para lado1, lado2 e lado3 devem:
        a) Ser maiores ou iguais a 1;
        b) Se tentar informar um valor menor que 1, atribuir o valor 1 para o lado
    3) Construir um método denominado de formaTriangulo, que retorna true se os lados formam um triangulo ou false caso contrário
    4) Criar um método para mostrar o tipo de triângulo formado. Você deve mostrar o tipo somente se os lados formarem um triângulo!

*/
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    
    // escopo tipoRetorno nomeMétodoOuFuncao(tipoParametro1 parametro1, tipoParametro2 parametro2){
    //     escrever função ;   
    // }
    public double getLado1(){
        return lado1;
    }
    
    public void setLado1(double lado){
    if (lado < 1) // Caso o if e o else tenham apenas uma instrução, eles podem ser escritos sem chaves.
        lado1 = 1;
    else
        lado1 = lado;
    }
    
    public double getLado2(){
        return lado2;
    }
    
    public void setLado2(double lado){
        if (lado < 1){
            lado2 = 1;
        }
        else{
            lado2 = lado;
        }
    }
    
    public double getLado3(){
        return lado3;
    }
    
    public void setLado3(double lado){
        if(lado < 1){
            lado3 = 1;
        }
        else{
            lado3 = lado;
        }
    }

    public boolean formaTriangulo(){
        if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado1 + lado2 > lado3)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void mostraTipoTriangulo(){
        if (!formaTriangulo()){
            System.out.println("Os lados não formam um triângulo!");
            return;
        }
        
        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Triângulo equilátero");
        }
        else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("Triângulo isósceles");
        }
        else{
            System.out.println("Triângulo escaleno");
        }
    }
    
}
