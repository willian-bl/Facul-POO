/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author willi
 */
public class ContatoPessoal extends Contato {
    private String dataDeAniversario;
    private String relacaoDeProximidade;
    
    public ContatoPessoal(int numeroDoContato, String nomeDoContato, String endereco, String telefone, String email, String dataDeAniversario, String relacaoDeProximidade) {
        super(numeroDoContato, nomeDoContato, endereco, telefone, email);
        this.dataDeAniversario = dataDeAniversario;
        this.relacaoDeProximidade = relacaoDeProximidade;
    }

    public String getDataDeAniversario() {
        return dataDeAniversario;
    }

    public void setDataDeAniversario(String dataDeAniversario) {
        this.dataDeAniversario = dataDeAniversario;
    }

    public String getRelacaoDeProximidade() {
        return relacaoDeProximidade;
    }

    public void setRelacaoDeProximidade(String relacaoDeProximidade) {
        this.relacaoDeProximidade = relacaoDeProximidade;
    }

    @Override
    public void mostraDetalheContato(){
    System.out.println("ID: " + getNumeroDoContato() + " | Nome: " + getNomeDoContato() +
            "\nEndereço: " + getEndereco() + " | Telefone: " + getTelefone() + 
            "\nEmail: " + getEmail() +
            "\nData de Aniversário: " + getDataDeAniversario() + " | Relação de proximidade: " + getRelacaoDeProximidade());
    }
    
}
