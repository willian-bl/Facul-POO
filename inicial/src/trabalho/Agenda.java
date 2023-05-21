/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author Willian Brito de Lima 
 * @author Leandro Henrique Guilhermiti de Oliveira 
 */
public class Agenda {
    private static Contato contatos[] = new Contato[100];
    
    // -------------------- Novos Métodos Contato --------------------
    public void insertContato(Contato c){
        // Verifica se já existe um contato com esse id
        for (int i = 0; i < this.contatos.length; i++) {
            if(this.contatos[i] != null && this.contatos[i].getNumeroDoContato() == c.getNumeroDoContato()) {
                System.out.println("Já existe um contato com esse número do contato (ID)!");
                return;
            }
        }
        
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
    
    
    public Contato deleteContato(int id){
        Contato c;
        for (int i = 0; i < this.contatos.length; i++){
            if(this.contatos[i] != null){
                c = this.contatos[i];
                if(c.getNumeroDoContato() == id){
                    this.contatos[i] = null;
                    return c;
                }
            }
        }
        System.out.println("Não existe nenhum contato com esse id!");
        return null;
    }
    
    public void updateContato(Contato cParam){
        Contato c = null;
        boolean achou = false;
        int pos = 0;
        
        for (int i = 0; i < this.contatos.length; i++){
            if (this.contatos[i] != null){
                c = this.contatos[i];
                if(c.getNumeroDoContato() == cParam.getNumeroDoContato()){
                    achou = true;
                    pos = i;
                    break;
                }
            }
        }
        
        if (achou){
            if (c.getClass() == cParam.getClass()){
                this.contatos[pos] = cParam;
                System.out.println("Contato alterado!");
            } else {
                System.out.println("O contato passado não é da mesma classe que o contato de id " + c.getNumeroDoContato()); ;
            }
                
        } else {
            System.out.println("O contato não foi encontrado!");
        }
    }
    
    public ContatoPessoal[] obtemContatoPessoal(){
        ContatoPessoal listaPessoal[] = new ContatoPessoal[100];
        int pos = 0;
        for(Contato c:this.contatos){
            if(c instanceof ContatoPessoal){
                listaPessoal[pos] = (ContatoPessoal)c;
            }
        }
        return listaPessoal;
    }
    
    public ContatoProfissional[] obtemContatoProfissional(){
        ContatoProfissional listaProfissional[] = new ContatoProfissional[100];
        int pos = 0;
        for(Contato c:this.contatos){
            if(c instanceof ContatoProfissional){
                listaProfissional[pos] = (ContatoProfissional)c;
                pos++;
            }
        }
        return listaProfissional;
    }
    
    public ContatoPessoal[] obtemAniversariante(String data){
        String[] dataParam = data.split("/");
        ContatoPessoal[] aniversariantes = new ContatoPessoal[100];
        ContatoPessoal c2;
        int pos = 0;
        
        for (Contato c:this.contatos) {
            if(c instanceof ContatoPessoal){
                c2 = (ContatoPessoal)c;
                String[] dataObjeto = c2.getDataDeAniversario().split("/");
                if(dataParam[0].equals(dataObjeto[0]) && dataParam[1].equals(dataObjeto[1])){
                    aniversariantes[pos] = c2;
                    pos++;
                }
            }
        }
        
        return aniversariantes;
    }
    
    public void mostraAgenda(){
        for(Contato c:this.contatos){
            if(c != null){
                c.mostraDetalheContato();
            }
        }
    }
    
}
