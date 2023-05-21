/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author willi
 */
public class Agenda {
    private ContatoPessoal cpessoais[] = new ContatoPessoal[100];
    private ContatoProfissional cprofissionais[] = new ContatoProfissional[100];

    
    // -------------------- Métodos ContatoPessoal --------------------
    public void insertPessoal(ContatoPessoal cpes){
        for (int i = 0; i < this.cpessoais.length; i++){
            if(this.cpessoais[i] == null){
                this.cpessoais[i] = cpes;
                return;  // Sai para não adicionar o contato nas outras posições livres
            }
        }
        System.out.println("Sem espaço na agenda para contatos pessoais!");  // Se chegou até aqui, é porque o for acabou e não tinha nenhuma posição livre
    }
    
    
    public ContatoPessoal buscaContatoPessoal(int id){
        for (ContatoPessoal contato:this.cpessoais) {  // for de outra forma - percorrendo os itens do vetor
            if (contato != null){
                if(contato.getNumeroDoContato() == id){
                    return contato;
                }
            }
        }
        return null;
    }
    
    
    public ContatoPessoal buscaContatoPessoal(String parametroNome){
        String nomeContato;
        for (ContatoPessoal contato:this.cpessoais){
            if(contato != null){
                nomeContato = contato.getNomeDoContato();
                if(nomeContato.equalsIgnoreCase(parametroNome)){
                    return contato;
                }
            }
        }
        return null;
    }
    
    
    // -------------------- Métodos ContatoProfissional --------------------
    public void insertProfissional(ContatoProfissional cprof){
        for (int i = 0; i < this.cpessoais.length; i++){
            if(this.cprofissionais[i] == null){
                this.cprofissionais[i] = cprof;
                return;
            }
        }
        System.out.println("Sem espaço na agenda para contatos profissionais!");
    }
    
    
    public ContatoProfissional buscaContatoProfissional(int id){
        for (ContatoProfissional contato:this.cprofissionais) {
            if (contato != null){
                if(contato.getNumeroDoContato() == id){
                    return contato;
                }
            }
        }
        return null;
    }
    
    
    public ContatoProfissional buscaContatoProfissional(String parametroNome){
        String nomeContato;
        for (ContatoProfissional contato:this.cprofissionais) {
            if (contato != null){
                nomeContato = contato.getNomeDoContato();
                if(nomeContato.equalsIgnoreCase(parametroNome)){
                    return contato;
                }
            }
        }
        return null;
    }
        
    
    
}
