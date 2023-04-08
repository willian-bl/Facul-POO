/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author willi
 */

// No Java, a palavra reservada "extends" indica herança
// Sintaxe: public class subclasse extends superclasse

public class PessoaFisica extends Pessoa{
    private long cpf;
    
    // A primeira declaração do método construtor da subclasse deve ser a chamada do método construtor da superclasse
    // Para isso, usamos o comando "super" refere-se à superclasse, assim como a palavra "this" refere-se à própria classe que está sendo criada
    public PessoaFisica(String nome, String endereco, String telefone, long cpf){
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String endereco, long cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    // Criamos um método "mostra" com a mesma assinatura do método "mostra" da superclasse. O resultado será que, ao chamar
    // o método mostra do objeto PessoaFisica ele irá usar esse método (o da subclasse), e não o da superclasse
    public void mostra(){
        super.mostra();
        System.out.println("CPF: " + cpf);
    }
    
    // O método toString substitui o formato de string do nosso objeto, que é chamado ao printa-lo. Podemos
    // criá-lo com o atalho do alt + insert também
    @Override // indica que estamos sobrescrevendo um método da superclasse
    public String toString() {
        return super.toString() + "\nPessoaFisica{" + "cpf=" + cpf + '}';  // Usando super.toString() também estamos usando o método toString() da superclasse
        // Como esse método retorna uma string, estamos concatenando a string da superclasse com essa que definimos agora, da subclasse
    }
    
}
