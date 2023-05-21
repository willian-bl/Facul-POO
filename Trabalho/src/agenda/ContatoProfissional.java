//Leandro Henrique Guilhermiti de Oliveira
//Willian Brito de Lima

package Agenda;

public class ContatoProfissional extends Contatos {
        private String empresa;
        private String Cargo;

        public ContatoProfissional(String empresa, String Cargo, int idContato, String nome, String endereco, String email, int telefone) {
                super(idContato, nome, endereco, email, telefone);
                this.empresa = empresa;
                this.Cargo = Cargo;
        }

        public ContatoProfissional(String empresa, String Cargo, int idContato, String nome, String endereco, int telefone) {
                super(idContato, nome, endereco, telefone);
                this.empresa = empresa;
                this.Cargo = Cargo;
        }
        
        public String getEmpresa() {
                return empresa;
        }

        public void setEmpresa(String empresa) {
                this.empresa = empresa;
        }

        public String getCargo() {
                return Cargo;
        }

        public void setCargo(String Cargo) {
                this.Cargo = Cargo;
        }

        
        @Override
        public void mostraDetalheContato() {
                System.out.println("NumeroIDContato: " + getIdContato() + " Nome: " + getNome() + " endereço: " + getEndereco() + " telefone: " + getTelefone() +  " Email: " + getEmail() + " Empresa: " + empresa + " Cargo: " + Cargo);
        }
        

}
