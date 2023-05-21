//Leandro Henrique Guilhermiti de Oliveira
//Willian Brito de Lima

package Agenda;

public abstract class Contatos {
        private int idContato;
        private String nome;
        private String endereco;
        private String email;
        private int telefone;

        public Contatos(int idContato, String nome, String endereco, String email, int telefone) {
                this.idContato = idContato;
                this.nome = nome;
                this.endereco = endereco;
                this.email = email;
                this.telefone = telefone;
        }

        public Contatos(int idContato, String nome, String endereco, int telefone) {
                this.idContato = idContato;
                this.nome = nome;
                this.endereco = endereco;
                this.telefone = telefone;
        }
        
       
        public int getIdContato() {
                return idContato;
        }

        public void setIdContato(int idContato) {
                this.idContato = idContato;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getEndereco() {
                return endereco;
        }

        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public int getTelefone() {
                return telefone;
        }

        public void setTelefone(int telefone) {
                this.telefone = telefone;
        }
         
        public abstract void mostraDetalheContato();
                
              
}
