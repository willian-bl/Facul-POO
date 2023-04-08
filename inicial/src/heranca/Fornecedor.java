/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author willi
 */
public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDebito;
    
    // Por convensão, colocamos os atributos da superclasse primeiro (PESQUISAR)
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDebito) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDebito = valorDebito;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDebito() {
        return valorDebito;
    }

    public void setValorDebito(double valorDebito) {
        this.valorDebito = valorDebito;
    }
    
    // Criar método obterSaldo que retorna a diferença entre valorCredito e valorDebito
    public double obterSaldo(){
        return this.valorCredito - this.valorDebito;
    }
    
    // Criar método toString para melhorar nossa visualização ao printar o objeto
    @Override
    public String toString() {
        return super.toString() + "\nFornecedor{" + "valorCredito=" + valorCredito + ", valorDebito=" + valorDebito + '}';
    }
    // Outra informação interessante sobre o toString é que ele é um método da classe Object do Java que, por padrão, nos 
    // retorna o endereço do objeto na memória. Podemos sobrescrever ele nas nossas classes para que seja algo mais útil e que faça
    // mais sentido para nós
}
