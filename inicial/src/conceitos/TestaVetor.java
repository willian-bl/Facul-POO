/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitos;

/**
 *
 * @author willi
 */



public class TestaVetor {
    
       public static void desenhaLinha(){
           System.out.println("\n-------------------------------------------------------\n");
       }
       
    public static void main(String[] args) {
        
        // declarar um vetor de inteiros de tamanho 10
        // tipo nome_do_vetor[] = new tipo[tamanho_do_vetor]; ou
        // tipo []nome_do_vetor = new tipo[tamanho_do_vetor]
        int vet[] = new int[10];
        
        // O vetor é um objeto. Ele possui atributos
        // Um dos atributos é a variável length
        // a variavel length retorna o tamanho do vetor
        
        System.out.println("Tamanho do vetor: " + vet.length);
        desenhaLinha();
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = i*i;
            System.out.println("vet[" + i + "]: " + vet[i]);
        }
        
        desenhaLinha();
        
        // Forma alternativa para percorrer o vetor
        for(int v:vet){
            System.out.println("Vetor: " + v);
        }
        
    }
}
