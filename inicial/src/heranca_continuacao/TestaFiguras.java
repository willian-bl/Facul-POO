/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca_continuacao;

/**
 *
 * @author willi
 */
public class TestaFiguras {
    
    public static void main(String[] args){
        
    // Tentando instanciar a classe abstrata - Não dá!
    // FiguraPlana fig;
    // fig = new FiguraPlana("retangulo");
    // Erro: Exception in thread "main" java.lang.RuntimeException: Uncompilable code - heranca_continuacao.FiguraPlana is abstract; cannot be instantiated
    
    Triangulo tri;
    tri = new Triangulo("triangulo", 10, 5);
    
    Retangulo ret;
    ret = new Retangulo("retangulo", 20, 8);
    
    System.out.println("Área do triângulo: " + tri.calculaArea());
    System.out.println("Área do retângulo: " + ret.calculaArea());
    
    }
}
