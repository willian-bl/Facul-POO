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

public class TestaLivro {
    
    public static void main(String[] args){
        Livro livro2 = new Livro("Estrutura de Dados Usando C", "Tenembaum", 904);
        Livro livro1 = new Livro("Pesquisa e Ordenação", "Claudia", 320);
        Livro livro3 = new Livro("Java como Programar", "Deitel", 535);
        
        ArrayList <Livro> livros = new ArrayList();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        
        Iterator <Livro> iter = livros.iterator();
        while(iter.hasNext()){
            Livro L = iter.next();
            System.out.println("Livro obtido: " + L);
        }
        
        Collections.sort(livros);
        
        System.out.println("");
        for(Livro liv:livros){
            System.out.println("Livro obtido com o for: " + liv);
        }
        
    }
    
}
