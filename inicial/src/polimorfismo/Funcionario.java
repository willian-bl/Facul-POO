/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author willi
 */
public class Funcionario {
    private int codigo;  
    private String nome;
    private double salario;
    private static int sequencia;  // Atributo de classe. Existe mesmo sem criar um objeto Funcionário  

    public Funcionario(String nome, double salario) {
        sequencia++;
        this.codigo = sequencia;  // Usa o atributo de classe "sequencia" para guardar os IDs dos objetos e fazer uma sequência de maneira automárica
        this.nome = nome;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

//    public static void setSalario(double salario) {  // Assim dá erro, pois um método de classe não pode acessar um atributo de instância 
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getSequencia() {
        return sequencia;
    }
    
    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + this.codigo + ", nome=" + this.nome + ", salario=" + this.salario + '}';
    }
    
}
