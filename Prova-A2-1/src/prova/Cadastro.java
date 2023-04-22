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
public class Cadastro {
    private ProdutoPerecivel pereciveis[] = new ProdutoPerecivel[30];
    private ProdutoEletronico eletronicos[] = new ProdutoEletronico[30];
    
    public void adicionaPerecivel(ProdutoPerecivel p) {
        for (int i = 0; i < pereciveis.length; i++) {
            if(pereciveis[i] == null) {
                pereciveis[i] = p;
                return;
            }    
        }
        System.out.println("O vetor de pereciveis está cheio, \nA inclusão não foi feita!");
    }
    
     public void adicionaEletronico(ProdutoEletronico p) {
        for (int i = 0; i < eletronicos.length; i++) {
            if(eletronicos[i] == null) {
                eletronicos[i] = p;
                return;
            }    
        }
        System.out.println("O vetor de eletronicos está cheio, \nA inclusão não foi feita!");
    }
    
    public void removePerecivel(ProdutoPerecivel p) {
        boolean removeu = false;
        
        for (int i = 0; i < pereciveis.length; i++) {
            if(pereciveis[i] != null && pereciveis[i].getId() == p.getId()) {
                pereciveis[i] = null;
                removeu = true;
                break;
            }
        }
        if(removeu == false) {
            System.out.println("Produto não foi encontrado");
        }
    }
    
    public ProdutoPerecivel obtemProdutoMaisBarato() {
        ProdutoPerecivel produtoBarato = null;
        boolean primeiroProduto = true;
        
        for (int i = 0; i < pereciveis.length ; i++) {
            if(pereciveis[i] != null){
                if(primeiroProduto){
                    produtoBarato = pereciveis[i];
                    primeiroProduto = false;
                }
                else if(pereciveis[i].getPreco() < produtoBarato.getPreco()){
                    produtoBarato = pereciveis[i];
                }
            }
        }
        return produtoBarato;
    }
    
    public ProdutoEletronico obtemProdutoMaiscaro(){
        double maiorPreco = -1;
        ProdutoEletronico produtoCaro = null;
        
        for (int i = 0; i < eletronicos.length; i++) {
            if(eletronicos[i] != null && eletronicos[i].getPreco() > maiorPreco){
            produtoCaro = eletronicos[i];
            maiorPreco = eletronicos[i].getPreco();
            }
        }
        return produtoCaro;
    }
    
    
    public void listaMarcaComum() {    
        String marcaPerecivel, marcaEletronico = "";
             
        for (int i = 0; i < pereciveis.length; i++) {
            if(pereciveis[i] != null){
                marcaPerecivel = pereciveis[i].getMarca();
                for (int j = 0; j < eletronicos.length; j++) {
                    if(eletronicos[j] != null){
                        marcaEletronico = eletronicos[j].getMarca();
                        if(marcaPerecivel.equals(marcaEletronico)) {
                            System.out.println(marcaPerecivel);
                            break;
                        }
                    }
                }    
            }
        }     
    } 
    
}
