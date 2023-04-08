/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author willi
 */
public class TestaPessoa {
    
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("Carlos", "Rua Tiradentes", "(16)12345-6789", 1234567890);
        
        System.out.println("Resultado do método 'mostra':");
        pf1.mostra();
        
        System.out.println("----------------------------------------------------- \nResultado do método 'toString':");
        System.out.println("pf1: " + pf1);
    }
}
