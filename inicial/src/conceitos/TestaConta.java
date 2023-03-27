/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitos;

/**
 *
 * @author willi
 */
public class TestaConta {
    
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(2378, "Carlos", 3000, 4000);
        
        c1.extrato();
        
        ContaCorrente c2 = new ContaCorrente(2529, "João");
        c2.extrato();
        
        c1.transferePara(c2, 1000);
        
        c1.extrato();
        c2.extrato();
        
        
    }
}
