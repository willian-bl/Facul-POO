//Leandro Henrique Guilhermiti de Oliveira
//Willian Brito de Lima

package Agenda;

import agenda.FullVetorException;

public class Agenda {

        private Contatos Contatos[] = new Contatos[19];

        public void insertContato(Contatos c) throws FullVetorException{                                
                for (int i = 0; i < Contatos.length; i++) {
                        if (Contatos[i] != null && Contatos[i].getIdContato() == c.getIdContato()) {
                                System.out.println("Contato já cadastrado");
                                return;
                        }
                }

                for (int i = 0; i < Contatos.length; i++) {
                        if (Contatos[i] == null) {
                                Contatos[i] = c;
                                return;
                        }
                }              
                throw new FullVetorException();
        }

        public Contatos buscaContatoNome(String nome) {
                for (int i = 0; i < Contatos.length; i++) {
                        if (Contatos[i] != null  && nome.equals(Contatos[i].getNome())) {
                                return Contatos[i];
                        }
                }
                return null;
        }

        public Contatos buscaContatoTelefone(int telefone) {
                for (int i = 0; i < Contatos.length; i++) {
                        if (Contatos[i] != null  &&  telefone == Contatos[i].getTelefone()) {
                                return Contatos[i];
                        }
                }
                System.out.println("O telefone não foi encontrado na agenda");
                return null;
        }

        public Contatos buscaContatoId(int id) {
                for (int i = 0; i < Contatos.length; i++) {
                        if (Contatos[i] != null && id == Contatos[i].getIdContato()) {
                                return Contatos[i];
                        }
                }
                System.out.println("O id não foi encontrado na agenda");
                return null;
        }

        public Contatos deletaContatoId(int id) {
                Contatos excluido = null;
                for (int i = 0; i < Contatos.length; i++) {
                        if(Contatos[i] != null && id  == Contatos[i].getIdContato()) {
                                excluido = Contatos[i];
                                Contatos[i] = null;
                                return excluido;
                        }
                }
                System.out.println("O id não foi encontrado na agenda para fazer a remoção");
                return null;
        }
        
        public void updateContato(Contatos c) {
                for (int i = 0; i < Contatos.length; i++) {
                        if (Contatos[i] != null && Contatos[i].getIdContato() == c.getIdContato()) {
                                if (Contatos[i] instanceof ContatoPessoal && c instanceof ContatoPessoal) {
                                        Contatos[i] = c;
                                        System.out.println("Contato Pessoal atualizado com sucesso!");
                                        return;
                                } else if (Contatos[i] instanceof ContatoProfissional && c instanceof ContatoProfissional) {
                                        Contatos[i] = c;
                                        System.out.println("Contato Profissional atualizado com sucesso!");
                                        return;
                                }
                                System.out.println("Contato não é do tipo Pessoal nem do tipo Profissional");
                        }
                }
                System.out.println("Id passado não encotrado para alteração");
        }
          
        
        public ContatoPessoal[] obtemContatoPessoal() {
                ContatoPessoal[] ContatosPessoais = new ContatoPessoal[100];
                int cont = 0;
                
                for (int i = 0; i < Contatos.length; i++) {
                        if (Contatos[i] instanceof ContatoPessoal) {
                                ContatosPessoais[cont] = (ContatoPessoal) Contatos[i];
                                cont ++;
                        }

                }
                ContatoPessoal[] resultado = new ContatoPessoal[cont];
                System.arraycopy(ContatosPessoais, 0, resultado, 0, cont);
                return resultado;
        }
        
        public ContatoProfissional[] obtemContatoProfissional() {
                ContatoProfissional[] ContatosProfissionais = new ContatoProfissional[100];
                int cont = 0;
                
                for (int i = 0; i < Contatos.length; i++) {
                        if (Contatos[i] instanceof ContatoProfissional) {
                                ContatosProfissionais[cont] = (ContatoProfissional) Contatos[i];
                                cont ++;
                        }

                }
                ContatoProfissional[] resultado = new ContatoProfissional[cont];
                System.arraycopy(ContatosProfissionais, 0, resultado, 0, cont);
                return resultado;
        }
        
        public ContatoPessoal[] obtemAniversariante(String d1) {
                ContatoPessoal[] Aniversariantes = new ContatoPessoal[100];

                String data1[];
                String data2[];
                String d2;
                data1 = d1.split("/");

                int cont = 0;
                for (int i = 0; i < Contatos.length; i++) {
                        if (Contatos[i] != null && Contatos[i] instanceof ContatoPessoal) {
                                d2 = ((ContatoPessoal) Contatos[i]).getDataDeAniversario();
                                data2 = d2.split("/");
                                if (data1[0].equals(data2[0])  && data1[1].equals(data2[1])) {
                                        Aniversariantes[cont] = (ContatoPessoal) Contatos[i];
                                        cont++;
                                }
                        }
                }
                if (cont == 0) {
                        System.out.println("Nenhum aniversariante encontrado para data: " + d1);
                }
                
                ContatoPessoal[] resultado = new ContatoPessoal[cont];
                System.arraycopy(Aniversariantes, 0, resultado, 0, cont);
                return resultado;
        }
              
}
