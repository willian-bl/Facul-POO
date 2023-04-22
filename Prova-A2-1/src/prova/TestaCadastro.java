/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author Willian Brito de Lima
 * @author Leandro Henrique Guilhermiti de Oliveira
 */
public class TestaCadastro {
    
    public static void main(String[] args){
        ProdutoPerecivel prodP1 = new ProdutoPerecivel("10/04/2023", 0, "danone", "Vigor", 10);
        ProdutoPerecivel prodP2 = new ProdutoPerecivel("05/12/2023", 1, "salgadinho", "Dell", 20);
        ProdutoEletronico prodE1 = new ProdutoEletronico(220, 2, "monitor", "Dell", 500);
        ProdutoEletronico prodE2 = new ProdutoEletronico(110, 3, "Teclado", "Hp", 120);
       
        prodE1.mostraDadosProduto();
        prodP1.mostraDadosProduto();
        
        Cadastro cad = new Cadastro();
        cad.adicionaEletronico(prodE1);
        cad.adicionaEletronico(prodE2);
        cad.adicionaPerecivel(prodP1);
        cad.adicionaPerecivel(prodP2);
        
        System.out.println("\nMais barato: ");
        ProdutoPerecivel maisBarato = cad.obtemProdutoMaisBarato();
        maisBarato.mostraDadosProduto();
        
        System.out.println("\nMais caro: ");
        ProdutoEletronico maisCaro = cad.obtemProdutoMaiscaro();
        maisCaro.mostraDadosProduto();
        
        System.out.println("\nMarca comum: ");
        cad.listaMarcaComum();
        
        System.out.println("\nRemovendo perecivel:");
        cad.removePerecivel(prodP1);
        maisBarato = cad.obtemProdutoMaisBarato();
        maisBarato.mostraDadosProduto();
    }
    
}
