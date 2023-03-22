/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitos;

/**
 *
 * @author willi
 */

/*
Exercício - Conta corrente
Criar uma classe denominada de ContaCorrente com os seguintes atributos:
    int nroConta;
    String nomeTitular;
    double saldo;
    double limite;
Métodos:
    - Criar um método construtor para inicializar todos os atributos
    - Criar um método construtor para inicializar o nroConta e o nomeTitular. Os demais atributos devem ser zerados
    - Métodos get & set para cada um dos atributos
        - Aceitar valores maiores ou iguais a zero para o atributo limite
        - Na alteração do saldo, a soma do saldo com o limite não pode ser menor que zero
    - Criar um método para depositar e um para sacar um certo valor. Fazer as validações necessárias dentro do método para que o limite da conta seja respeitado
    - Criar um método para visualizar as informações da conta (como se fosse um extrato)

*/

public class ContaCorrente {
    int numConta;
    String nomeTitular;
    double saldo;
    double limite;
    
    public ContaCorrente(int numConta, String nomeTitular, double saldo, double limite){
        setNumConta(numConta);
        setNomeTitular(nomeTitular);
        setSaldo(saldo);
        setLimite(limite);
    }
    
    
    public ContaCorrente(int numConta, String nomeTitular){
        setNumConta(numConta);
        setNomeTitular(nomeTitular);
        this.saldo = 0;
        this.limite = 0;
    }
    
    
    public int getNumConta(){
        return numConta;
    }
    
    
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    
    public String getNomeTitular(){
        return nomeTitular;
    }
    
    
    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    
    
    public double getSaldo(){
        return saldo;
    }
    
    
    public void setSaldo(double saldo){
        if (saldo + this.limite >= 0)
            this.saldo = saldo;
        else
            this.saldo = 0;
    }
    
    
    public double getLimite(){
        return limite;
    }
    
    
    public void setLimite(double limite){
        if(limite >= 0)
            this.limite = limite;
        else
            this.limite = 0;
    }
    
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor; 
    }
    
    
    public void sacar(double valor){
        if(this.saldo + this.limite >= valor)
            this.saldo = this.saldo - valor;
        else
            System.out.println("Saldo não suficiente!");
    }
    
    
    public void extrato(){
        System.out.println("\n====================================================================");
        System.out.println("N Conta: " + this.numConta + "| Titular: " + this.nomeTitular);
        System.out.println("Limite: " + this.limite + "| SALDO: " + this.saldo);
        System.out.println("====================================================================");
    }
    
}
