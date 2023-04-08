/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author willi
 */

// Regras de heraança no JAVA:
/*
* Se existir um construtor na superclasse, obrigatoriamente deve existir um construtor na subclasse
* No construtor da subclasse precisamos chamar o construtor da superclasse para passar os atributos que são inicializados na superclasse
* Se criarmos um método na subclasse com a mesma assinatura de um método da superclasse, o método da subclasse sobrescreverá o método da superclasse
* Assim como o método construtor é obrigatório e, se não definirmos, a máquina virtual Java cria um construtor padrão
*   a herança também é obrigatória e, se não herdamos de nenhuma classe explicitamente, a máquina virtual Java vai fazer com que a classe herde da classe "Object", que
*   é uma classe nativa do Java e da qual todos os objetos, direta ou indiretamente herdam suas características
* No Java, não temos herança múltipla, ou seja, um mesmo objeto não pode herdar diretamente de duas classes ao mesmo tempo
*/

public class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;

    // Atalho, no Netbeans, para criar métodos construtores, getters e setters: alt + insert
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    // Outro construtor para a classe pessoa
    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
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

    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void mostra(){
        System.out.println("Nome: " + this.nome + " | Endereço: " + this.endereco + " | Telefone: " + this.telefone);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }
}
