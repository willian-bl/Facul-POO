/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;

/**
 *
 * @author willi
 */

import java.util.*;
public class TestaArrayList {
    
    public static void main(String[] args) {
        ArrayList <String> nomes = new ArrayList();  // Declarando um ArrayList para armazenar Strings
        ArrayList <Integer> numeros = new ArrayList();  // Para armazenar números inteiros, usamos a classe Integer ao invés de int
        
        List <String> lista = new ArrayList();  // List é a interface que é implementada em ArrayList
        
        // Adicionar um elemento no ArrayList
        // O método para adicionar um elemento é o add
        nomes.add("Bruno");
        nomes.add("Fatima");
        nomes.add("Diogo");
        nomes.add("Carlos");
        nomes.add("Amanda");
        nomes.add("Gabriella");
        nomes.add("Elieser");
        
        // Mostrar o conteúdo do ArrayList
        System.out.println("Nomes: " + nomes);
        
        // Método que mostra a quantidade de elementos do ArrayList - size()
        System.out.println("Quantidade de elementos no ArrayList: " + nomes.size());
        
        // Percorrer o Arraylist elemento por elemento
        for (int i = 0; i < nomes.size(); i++) {
            // Para ter acesso a cada elemento do ArrayList utilizamos o método get
            // o index dos elementos começa do 0
            System.out.println("Nome (" + i + "): " + nomes.get(i));
        }
        
        // Percorrer o ArrayList através do for reduzido 
        System.out.println("Nomes:");
        for(String s:nomes){
            System.out.println(s);
        }
        
        // Remover um elemento do ArrayList
        // Para remover o elemento do ArrayList utilizamos o método remove com o índice do elemento a ser removido
        nomes.remove(1);
        System.out.println("Após a remoção do nome de index 1: " + nomes);
        
        // Classificar um ArrayList
        // Para classificar um ArrayList usamos o método estático da classe Collections: sort
        // Para utilizar o método sort, a classe associada ao ArrayList (no nosso exemplo de nomes é a classe String) deve ter implementado um método denominado "compareTo"
        Collections.sort(nomes);
        System.out.println("Nomes ordenados: " + nomes);
        
        // Removendo vários nomes - Quero remover os dois primeiros nomes
//        for (int i = 0; i < nomes.size(); i++) {
//            if(i < 2){
//                nomes.remove(i);
//            }
//        }
        // Ao remover a posição 0, os elementos do vetor serão "reindexados". Então, nesse for, ao invés de remover os dois primeiros nomes,
        // estaremos removendo o primeiro e o terceiro (que, após a remoção do primeiro, passará a ter o index 1)
        
        // Para fazer o que queremos, teremos que usar outra forma:
        // Percorrendo o ArrayList através da classe Iterator
        // A classe Iterator serve para percorrer elementos de conjuntos
        Iterator <String> iter = nomes.iterator();
        // O Iterator cria um ponteiro para cada elemento para percorrer a lista 
        // O tipo <String> é o tipo do objeto que o Iterator vai retornar
        System.out.println("\nNomes pelo iterator:");
        while(iter.hasNext()){
            String s = iter.next();  // Passa para o ponteiro do próximo elemento e o torna disponível para utilizar
            System.out.println(s);
        }
        
        // Realizando a remoção do dois primeiros elementos do ArrayList usando o iterator
        Iterator <String> iter2 = nomes.iterator();
        int qtd = 0;
        while(iter2.hasNext()){
            iter2.next();
            if(qtd < 2){
                iter2.remove();  // Mesmo quando um elemento é removido, os outros ponteiros continuam intactos, então não tenho o problema do outro método de ter os index refeitos
            }
            qtd++;
        }
        System.out.println("Após a remoção: " + nomes);
        
        
        // Funcionamento do método compareTo da classe String:
        String s1 = "a";
        String s2 = "b";
        String s3 = "a";
        
        System.out.println("'a' comparado com 'a'? " + s1.compareTo(s3)); // Compara baseado na tabela ASCII, onde cada letra tem um código associado a ela
        // Se der zero, quer dizer que o código é o mesmo, ou seja, a letra é a mesma
        
        System.out.println("'a' comparado com 'b'? " + s1.compareTo(s2)); // -1 Porque a vem antes de b
        
        System.out.println("'b' comparado com 'a'? " + s2.compareTo(s1));
   
    }
}
