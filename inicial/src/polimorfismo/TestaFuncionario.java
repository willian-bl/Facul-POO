/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author willi
 */
public class TestaFuncionario {
    
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Teresa",4000);
        Funcionario f2 = new Funcionario("Juliano",3800);
        System.out.println("Funcionario 1: " + f1);
        System.out.println("Funcionario 2: " + f2);
        System.out.println("Valor da sequencia a partir de f1: " +f1.getSequencia());
        System.out.println("Valor da Sequencia a partir de f2: " + f2.getSequencia());
        System.out.println("Valor da sequencia a partir da classe: " + Funcionario.getSequencia());  // Posso chamar o atributo de classe através do nome da classe, sem ter nenhum objeto instanciado
        
        // ----------- Teste para o trabalho -----------------
        System.out.println("\nTeste de operações com strings:");
        
        String s="10/05/2023";
        String data[];
        data=s.split("/");
        for(String p:data){
            System.out.println("Partes da data: " + p);
        }
        System.out.println("Dia: " + data[0]);
        System.out.println("Mes: " + data[1]);
        System.out.println("Ano: " + data[2]);
    }
    
}
