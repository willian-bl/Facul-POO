//Leandro Henrique Guilhermiti de Oliveira
//Willian Brito de Lima

package Agenda;

public class ContatoPessoal extends Contatos {

        private String dataDeAniversario;
        private String relacaoProximidade;

        public ContatoPessoal(String dataDeAniversario, String relacaoProximidade, int idContato, String nome, String endereco, String email, int telefone) {
                super(idContato, nome, endereco, email, telefone);
                this.dataDeAniversario = dataDeAniversario;
                this.relacaoProximidade = relacaoProximidade;
        }

        public ContatoPessoal(String dataDeAniversario, String relacaoProximidade, int idContato, String nome, String endereco, int telefone) {
                super(idContato, nome, endereco, telefone);
                this.dataDeAniversario = dataDeAniversario;
                this.relacaoProximidade = relacaoProximidade;
        } 

        public String getDataDeAniversario() {
                return dataDeAniversario;
        }

        public void setDataDeAniversario(String dataDeAniversario) {
                this.dataDeAniversario = dataDeAniversario;
        }

        public String getRelacaoProximidade() {
                return relacaoProximidade;
        }

        public void setRelacaoProximidade(String relacaoProximidade) {
                this.relacaoProximidade = relacaoProximidade;
        }

        @Override
        public void mostraDetalheContato() {
                System.out.println("NumeroIDContato: " + getIdContato() + " Nome: " + getNome() + " endereço: " + getEndereco() + " telefone: " + getTelefone() + " Email: " + getEmail());
        }

}

