/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;

/**
 *
 * @author willi
 */
public class Livro implements Comparable<Livro>{
// Para implementar o compareTo, devemos implementar a interface Comparable<Classe>, que possui esse método
    private String titulo;
    private String autor;
    private int nroPaginas;
    
    
    public Livro(String titulo, String autor,int nroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }
    
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
    
    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", nroPaginas=" + nroPaginas + '}';
    }
    
    // retorna int porque a comparação de Strings retorna um inteiro. É só lembrar do exemplo feito no arquivo TestaArrayList.java
    // O método sort ordena comparando os livros de 2 em 2 e isso é feito através do método compareTo.
    // Comparando Strings, simplesmente usamos o compareTo com o atributo que é uma String
    // Comparando números, devemos escolher o que o método retorna, de forma que o padrão é:
    // Quando for igual retornar 0, quando for menor retornar um número negativo (-1) e quando for maior retornar um número positivo (1)
    // Assim, o compareTo vai usar essa informação para ordenar os objetos e, para que eles fiquem ordem crescente do número de páginas, devemos seguir essa lógica
    @Override
    public int compareTo(Livro liv){
        
        // Cmpara o titulo do livro da própria classe com o título do livro passado como parâmetro
        // return titulo.compareTo(liv.getTitulo());
        // return this.titulo.compareTo(liv.getTitulo());
        
        // Pelo autor
        // return this.getAutor().compareTo(liv.autor);        
        // return this.getAutor().compareTo(liv.getAutor());
        
        // Pelo número de páginas
        if(this.getNroPaginas() == liv.getNroPaginas())
            return 0;
        else if (this.getNroPaginas() < liv.getNroPaginas())
            return -1;
        else
            return 1;
    }
    
}
