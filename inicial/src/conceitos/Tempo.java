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
2) Criar um método para mostrar a hora de maneira formatada (hh:mm:ss)

*/

public class Tempo {
    private int hora, minuto, segundo;
    
    public Tempo(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    
    public Tempo(int hora){
        setHora(hora);
        minuto = 0;
        segundo = 0;
    }
    
    public int getHora(){
        return hora;
    }
    
    public void setHora(int hora){
        if(hora >= 0 && hora <= 23){
            this.hora = hora;
        }
        else{
            this.hora = 0;
        }
    }
            
    public int getMinuto(){
        return minuto;
    }
    
    public void setMinuto(int minuto){
        if(minuto >= 0 && minuto <= 60){
            this.minuto = minuto;
        }
        else{
            this.minuto = 0;
        }
    }
            
            
    public int getSegundo(){
        return segundo;
    }
    
    public void setSegundo(int segundo){
        if(segundo >= 0 && segundo <= 60){
            this.segundo = segundo;
        }
        else{
            this.segundo = 0;
        }
    }
        
    
    public void incrementaSegundo(){
        segundo++;
        if(segundo > 59){
            segundo = 0;
            minuto++;
            
            if(minuto > 59){
                minuto = 0;
                hora++;
                
                if(hora > 23){
                    hora = 0;
                }
            }
        }
    }
    
        public void decrementaSegundo(){
        segundo--;
        if(segundo < 0){
            segundo = 59;
            minuto--;
            
            if(minuto < 0){
                minuto = 59;
                hora--;
                
                if(hora < 0){
                    hora = 23;
                }
            }
        }
    }
        
    public String obtemHora(){
        String s;
        s = hora+":"+minuto+":"+segundo;
        
        return s;
    }
        

}

// this -> a palavra reservada this representa a própria classe.
// Quando ela é chamada dentro de uma classe, ela se auto-referencia. Ou seja, é como se a classe chamasse ela mesma.
// Ex: Se minha classe tem um atributo "a" e quero acessá-lo, podemos usar this.a


/*
Assinatura de um método

O que difere um método de outro método não é o nome, mas a sua assinatura.
A assinatura abrange o nome do método e a lista de parâmetros.

Exemplos:
    pulblic void soma(){...}
    pulblic void soma(int a){...}
    pulblic void soma(int a, int b){...}
    pulblic void soma(double a, double b) {...}

Assim, na classe, podemos ter vários métodos construtores, desde que possuam lista de parâmetros distintos

*/