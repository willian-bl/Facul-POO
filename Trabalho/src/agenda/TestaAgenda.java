//Leandro Henrique Guilhermiti de Oliveira
//Willian Brito de Lima

package Agenda;

public class TestaAgenda {
        public static void main(String[] args) {
                
                ContatoPessoal cPe1 = new ContatoPessoal("04/12", "5", 1, "Leandro", "Rua das Oliveiras 77", "leandro@hotmail.com", 888755);
                ContatoPessoal cPe2 = new ContatoPessoal("05/05", "3", 2, "Carla", "Rua Almeida, 123", "Carla@hotmail.com", 002321);
                ContatoPessoal cPe3 = new ContatoPessoal("03/06", "4", 3, "Flavia", "Rua das Rosas 466", "Flavia@hotmail.com", 999000);
                ContatoPessoal cPe4 = new ContatoPessoal("01/02", "3", 4, "João", "Av. Paulista 100", "joao@gmail.com", 777111);
                ContatoPessoal cPe5 = new ContatoPessoal("06/09", "5", 5, "Ana", "Rua das Flores 200", "ana@yahoo.com", 333444);
                ContatoPessoal cPe6 = new ContatoPessoal("12/07", "3", 6, "Bruno", "Rua dos Pinheiros 50", "bruno@outlook.com", 555666);
                ContatoPessoal cPe7 = new ContatoPessoal("09/10", "4", 7, "Mariana", "Av. Rebouças 300", "mariana@hotmail.com", 999888);
                ContatoPessoal cPe8 = new ContatoPessoal("08/08", "2", 8, "Pedro", "Rua das Mangueiras 150", "pedro@gmail.com", 111222);
                ContatoPessoal cPe9 = new ContatoPessoal("12/07", "3", 9, "Julia", "Rua dos Cravos 90", "julia@yahoo.com", 444555);
                ContatoPessoal cPe10 = new ContatoPessoal("02/03", "5", 10, "Lucas", "Rua dos Girassóis 70", "lucas@outlook.com", 222333);
                
                

                ContatoProfissional cPro1 = new ContatoProfissional("AgroTec", "Gerente", 11, "Alesssandra", "Rua Cravos 54", "Alessandra@gmail.com", 555366);
                ContatoProfissional cPro2 = new ContatoProfissional("AgroTec", "Quimico", 12, "Roberto", "Rua Costa e Silva 50", "Roberto@hotmail.com", 898999);
                ContatoProfissional cPro3 = new ContatoProfissional("Hospital São Lucas", "Médico", 13, "Fernanda", "Av. Brasil 1000", "fernanda@gmail.com", 777222);
                ContatoProfissional cPro4 = new ContatoProfissional("Universidade de São Paulo", "Professor", 14, "Rodrigo", "Rua São Francisco 200", "rodrigo@yahoo.com", 444777);
                ContatoProfissional cPro5 = new ContatoProfissional("Google", "Engenheiro de Software", 15, "Luciana", "Rua das Acácias 30", "luciana@hotmail.com", 111222);
                ContatoProfissional cPro6 = new ContatoProfissional("Banco do Brasil", "Gerente de Contas", 16, "Gustavo", "Rua das Palmeiras 150", "gustavo@outlook.com", 333555);
                ContatoProfissional cPro7 = new ContatoProfissional("Prefeitura Municipal", "Advogado", 17, "Carolina", "Rua das Orquídeas 70", "carolina@gmail.com", 222666);
                ContatoProfissional cPro8 = new ContatoProfissional("Agência de Publicidade XYZ", "Designer Gráfico", 18, "Rafael", "Rua das Violetas 90", "rafael@yahoo.com", 666777);
                ContatoProfissional cPro9 = new ContatoProfissional("Indústria Metalúrgica ABC", "Engenheiro de Produção", 19, "Fábio", "Av. Rebouças 500", "fabio@hotmail.com", 888999);
ContatoProfissional cPro10 = new ContatoProfissional("Escritório de Advocacia Silva e Souza", "Advogado", 20, "Amanda", "Rua dos Lírios 80", "amanda@outlook.com", 333444);

                    
                Agenda A1 = new Agenda();
               
                try {
                        A1.insertContato(cPe1);
                        A1.insertContato(cPe2);
                        A1.insertContato(cPe3);
                        A1.insertContato(cPe4);
                        A1.insertContato(cPe5);
                        A1.insertContato(cPe6);
                        A1.insertContato(cPe7);
                        A1.insertContato(cPe8);
                        A1.insertContato(cPe9);
                        A1.insertContato(cPe10);
                        A1.insertContato(cPro1);
                        A1.insertContato(cPro2);
                        A1.insertContato(cPro3);
                        A1.insertContato(cPro4);
                        A1.insertContato(cPro5);
                        A1.insertContato(cPro6);
                        A1.insertContato(cPro7);
                        A1.insertContato(cPro8);
                        A1.insertContato(cPro9);
                        A1.insertContato(cPro10);

                } catch (Exception e) {
                        System.out.println("Erro: " + e); 
                }
                
               //Alguns Contatos inseridos na agenda
               cPe1.mostraDetalheContato();
               cPe2.mostraDetalheContato();
               cPro1.mostraDetalheContato();
               
               //Testa busca pelo Nome
               Contatos buscaNome = A1.buscaContatoNome("Leandro");
               if(buscaNome != null) {
                       System.out.println("\nResultado busca pelo Nome: ");
                       buscaNome.mostraDetalheContato();
               } else {
                       System.out.println("\nResultado busca pelo Nome: " + buscaNome);
               }
               
               
               //Testa busca pelo telefone
               Contatos buscaTelefone = A1.buscaContatoTelefone(222666);
               if(buscaTelefone != null) {
                       System.out.println("\nResultado busca pelo telefone: ");
                       buscaTelefone.mostraDetalheContato();
               }else {
                       System.out.println("\nResultado busca pelo telefone: " + buscaTelefone);
               }
               
               
               //Testa busca pelo Id
               Contatos buscaId =  A1.buscaContatoId(5);
               if(buscaId != null) {
                        System.out.println("\nResultado da busca pelo Id: ");
                        buscaId.mostraDetalheContato();
               } else {
                        System.out.println("\nResultado da busca pelo Id: " + buscaId);
               }
               
               
               //Testa deleta contato pelo Id
               Contatos deleta1 = A1.deletaContatoId(19);
               if(deleta1 != null) {
                       System.out.println("\nResultado Contato excluido: ");
                       deleta1.mostraDetalheContato();
                       System.out.println("\n");
               } else {
                       System.out.println("\nResultado Contato excluido: " + deleta1);
               }
               
               
               //Testa update contato
               ContatoPessoal update1 = new ContatoPessoal("04/12", "5", 1, "Leandro", "Rua Augusta 65", "leandro2023@hotmail.com", 888755);
               A1.updateContato(update1);
               
                           
                //Testa obtem Contatos Pessoais
                ContatoPessoal contatosPessoais[]; 
                contatosPessoais = A1.obtemContatoPessoal();

                System.out.println("\n\nContatos Pessoais: ");
                for (int i = 0; i < contatosPessoais.length; i++) {
                        contatosPessoais[i].mostraDetalheContato();
                }
                
                
                //Testa obtem Contatos Profissionais
                ContatoProfissional contatosProfissionais[];
                contatosProfissionais = A1.obtemContatoProfissional();

                System.out.println("\n\nContatos Profissionais: ");
                for (int i = 0; i < contatosProfissionais.length; i++) {
                        contatosProfissionais[i].mostraDetalheContato();
                }
                
                
                //Testa obtem Aniversariante
                ContatoPessoal aniversariantes[];
                System.out.println("\n\nAniversariantes: ");
                aniversariantes = A1.obtemAniversariante("05/07");
                for (int i = 0; i < aniversariantes.length; i++) {
                        aniversariantes[i].mostraDetalheContato();

                }

        }
}
