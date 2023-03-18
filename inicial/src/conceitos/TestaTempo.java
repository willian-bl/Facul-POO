/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitos;

/**
 *
 * @author willi
 */
public class TestaTempo {
    
    public static void main(String[] args) {
        Tempo t1 = new Tempo();
        t1.setHoras(23);
        t1.setMinutos(59);
        t1.setSegundos(59);
        
        t1.incrementaSegundo();
        t1.incrementaSegundo();
        
        System.out.println(t1.obtemHora());
        
        Tempo t2 = new Tempo();
        t2.setHoras(0);
        t2.setMinutos(0);
        t2.setSegundos(2);
        
        t2.decrementaSegundo();
        t2.decrementaSegundo();
        t2.decrementaSegundo();
        
        System.out.println(t2.obtemHora());
        
//        System.out.println("\n\n");
//            for (int i = 0; i < 60; i++) {
//            t2.incrementaSegundo();
//            System.out.println(t2.obtemHora());
//        }
    
    }
}
