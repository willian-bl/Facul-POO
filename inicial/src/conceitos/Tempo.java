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
Exercício: Criar uma classe denominada Tempo com os seguintes atributos:
int hora - Com valores válidos entre 0 e 23
int minuto - Com valores válidos entre 0 e 59
int segundo - Com valores válidos entre 0 e 59

Qualquer inconsistência atribuir o valor 0

1) Criar um método para incrementar e um para decrementar o segundo em 1 unidade. Ex: 10:59:59 + 1s = 11:00:00
2) Criar um método para mostrar a hora no formato hh:mm:ss

*/

public class Tempo {
    private int horas, minutos, segundos;
    
    public int getHoras(){
        return horas;
    }
    
    public void setHoras(int hs){
        if(hs >= 0 && hs <= 23){
            horas = hs;
        }
        else{
            horas = 0;
        }
    }
            
    public int getMinutos(){
        return minutos;
    }
    
    public void setMinutos(int min){
        if(min >= 0 && min <= 60){
            minutos = min;
        }
        else{
            minutos = 0;
        }
    }
            
            
    public int getSegundos(){
        return segundos;
    }
    
    public void setSegundos(int seg){
        if(seg >= 0 && seg <= 60){
            segundos = seg;
        }
        else{
            segundos = 0;
        }
    }
        
    
    public void incrementaSegundo(){
        segundos++;
        if(segundos > 59){
            segundos = 0;
            minutos++;
            
            if(minutos > 59){
                minutos = 0;
                horas++;
                
                if(horas > 23){
                    horas = 0;
                }
            }
        }
    }
    
        public void decrementaSegundo(){
        segundos--;
        if(segundos < 0){
            segundos = 59;
            minutos--;
            
            if(minutos < 0){
                minutos = 59;
                horas--;
                
                if(horas < 0){
                    horas = 23;
                }
            }
        }
    }
        
    public String obtemHora(){
        String s;
        s = horas+":"+minutos+":"+segundos;
        
        return s;
    }
        

}
