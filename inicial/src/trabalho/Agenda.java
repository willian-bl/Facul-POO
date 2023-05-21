/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author willi
 * Classe alterada com os conceitos do polimorfismo, passados na aula de 26/04
 */
public class Agenda {
    private Contato contatos[] = new Contato[200];
    
    
    // -------------------- Novos Métodos Contato --------------------
    public void insertContato(Contato c){
        for (int i = 0; i < this.contatos.length; i++){
            if(this.contatos[i] == null){
                this.contatos[i] = c;
                return;  // Sai para não adicionar o contato nas outras posições livres
            }
        }
        System.out.println("Sem espaço na agenda para contatos pessoais!");  // Se chegou até aqui, é porque o for acabou e não tinha nenhuma posição livre
    }
    
    
    public Contato buscaContato(int id){
        for (Contato contato:this.contatos) {  // for de outra forma - percorrendo os itens do vetor
            if (contato != null){
                if(contato.getNumeroDoContato() == id){
                    return contato;
                }
            }
        }
        return null;
    }
    
    
    public Contato buscaContato(String parametroNome){
        String nomeContato;
        for (Contato contato:this.contatos){
            if(contato != null){
                nomeContato = contato.getNomeDoContato();
                if(nomeContato.equalsIgnoreCase(parametroNome)){
                    return contato;
                }
            }
        }
        return null;
    }
    
    
    
    
}
