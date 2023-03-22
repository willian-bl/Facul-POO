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
        Tempo t1 = new Tempo(23, 59, 59);
        
        t1.incrementaSegundo();
        t1.incrementaSegundo();
        
        System.out.println(t1.obtemHora());
        
        Tempo t2 = new Tempo(12);
        System.out.println("Hora t2: " + t2.obtemHora());
        }
    
    }

// Quando criamos uma nova variável/instanciamos um objeto sem declarar seu valor/atributos, os atributos/variáveis recebem valores padrão:
// Objeto: Null
// Boolean: false
// Numerico: 0

// Método construtor:
// *O método construtor é utilizado para iniciar os atributos. Atribui valores iniciais aos atributos
// *Ele é chamado quando o objeto é criado
// *Pussui o mesmo nome da classe
// *Pode ou não receber parâmetros
// *Não retorna nada, nem mesmo void
// *É obrigatório. Se não for definido a maquina virtual cria o método construtor