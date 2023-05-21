/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author willi
 */
public class testaAgenda {
    
    public static void desenhaLinha(){
        System.out.println("\n------------------------------------------------\n");
    }
    
    public static void pulaLinha(){
        System.out.println();
    }
    
    public static void tentaPrintarContato(ContatoPessoal cpes){
        if (cpes != null){
            cpes.mostraDetalheContato();
        } else{
            System.out.println("Nenhum contato pessoal foi encontrado!");
        }
    }
    
    public static void tentaPrintarContato(ContatoProfissional cprof){
        if (cprof != null){
            cprof.mostraDetalheContato();
        } else{
            System.out.println("Nenhum contato profissional foi encontrado!");
        }
    }
    
    
    public static void main(String[] args){
        // Criando os contatos e adicionando na agenda
        ContatoPessoal cpes1 = new ContatoPessoal(0, "José", "R Pio Avelino", "99999-0000", "22/04", "conhecido");
        ContatoPessoal cpes2 = new ContatoPessoal(1, "Nathan", "R Itirapuã", "99100-0000", "nathan.email@gmail.com", "30/02", "amigo");
        ContatoPessoal cpes3 = new ContatoPessoal(2, "Jenipher", "Av Independência - Ribeirão Preto", "Se alguém descobrir me passa ;-;", "jenipher123@gmail.com", "20/07", "namorada");
        ContatoPessoal cpes4 = new ContatoPessoal(2, "Jenipher", "Av Independência - Ribeirão Preto", "Se alguém descobrir me passa ;-;", "jenipher123@gmail.com", "20/07", "namorada");
        
        ContatoProfissional cprof1 = new ContatoProfissional(3, "Fernando", "Av. Dr. Armando de Sáles Oliveira", "98111-0000", "fernando@unifran.br", "Unifran", "Professor");
        ContatoProfissional cprof2 = new ContatoProfissional(4, "Diego", "R Tiradentes", "91234-5678", "diegoqwer@gmail.com", "Jussara", "Assistente de TI");
        
        Agenda agenda = new Agenda();
        agenda.insertContato(cpes1);
        agenda.insertContato(cpes2);
        agenda.insertContato(cpes3);
        agenda.insertContato(cpes4);
        agenda.insertContato(cprof1);
        agenda.insertContato(cprof2);
        
        // Testes
        ContatoPessoal pessoal;
        ContatoProfissional profissional;
        int id;
        String nome;
        
        System.out.println("Buscando contatos pessoais: \n");
        id = 2;
        pessoal = (ContatoPessoal)agenda.buscaContato(id);
        tentaPrintarContato(pessoal);
        
        pulaLinha();
        
//        nome = "Adalberto";
        nome = "José";
        pessoal = (ContatoPessoal)agenda.buscaContato(nome);
        tentaPrintarContato(pessoal);
        
        pulaLinha();
        
        System.out.println("Buscando contatos profissionais: \n");
//        id = 1;
        id = 4;
        profissional = (ContatoProfissional)agenda.buscaContato(id);
        tentaPrintarContato(profissional);
        
        pulaLinha();
        
        nome = "fernando";
        profissional = (ContatoProfissional)agenda.buscaContato(nome);
        tentaPrintarContato(profissional);
        
        desenhaLinha();
        
    }
}
