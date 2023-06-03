/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;

/**
 *
 * @author willi
 */
public class TestaPais {
    
    public static void main(String[] args){
        Pais p = new Pais(0, "Brasil", "Brasília", 214300000, "América do Sul");
        Pais p2 = new Pais(1, "Argentina", "Buenos Aires", 45810000, "América do Sul");
        Pais p3 = new Pais(2, "Paraguai", "Assunção", 6704000, "América do Sul");
        Pais p4 = new Pais(3, "França", "Paris", 67750000, "Europa");
        
        System.out.println(p);
        
        System.out.println("Adicionando vizinhos: ");
        p.adicionaVizinho(p2);
        p.adicionaVizinho(p3);
        p.adicionaVizinho(p);  // Tentando adicionar ele mesmo como vizinho
        p.adicionaVizinho(p2);  // Tentando adicionar vizinho repetido
        System.out.println(p);
        
        System.out.println("Tentando remover país que não está na lista de vizinhos: ");
        p.removeVizinho(p4);
        p.removeVizinho2(p4);
        
        System.out.println("\n------------------------------------------ \nAdicionando França na lista de vizinhos: ");
        p.adicionaVizinho(p4);
        System.out.println(p);
        
        System.out.println("Removendo vizinhos Argentina e França: ");
        p.removeVizinho(p4);
        p.removeVizinho(p2);
        System.out.println(p);
        
        System.out.println("------------------------------------------ \nPrintando os outros países para ver se está tudo certo: \n");
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    
    }
    
    
}
