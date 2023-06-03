/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;

/**
 *
 * @author willi
 */

// Singleton é um padrão de projeto que faz com que seja permitido criar apenas um objeto dessa classe
// Outros padrões de projeto: factory, 
public class Singleton {
    private static Singleton instancia;  // A classe pode ter um atributo do mesmo tipo que a classe;
    private String usuario;
    
    private Singleton(){  // Construtor é privado, então a classe não pode ser instanciada diretamente
        usuario="padrao";
    }
    
    // synchronized não deixa que mais de um usuário entre ao mesmo tempo para executar o método. Eles ficam na fila esperando o outro usuário atual terminar de usar.
    //              útil para programas em servidores onde vários usuários estarão usando e fazendo requisições ao mesmo tempo. Pode se tratar de uma conexão com o banco de dados, por exemplo.
    // Relembrando: métodos e atributos estáticos pertencem à classe, então não é necessário criar um objeto para acessá-los
    public static synchronized Singleton obterInstancia(){  // Precisa ser de classe para poder acessá-lo sem ter um objeto (isso acontece quando queremos instanciar um objeto, já que ele não existe)
        if(instancia == null){  // Só instancia se ele é nulo. Então, só poderemos instanciar um objeto dessa classe
            instancia = new Singleton();  // Aqui que é chamado o construtor da classe propriamente dito, então se quisermos instanciar o objeto devemos chamar esse método
        }
        return instancia;  // Retorna o objeto
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    // Fazendo o main no mesmo arquivo para economizar arquivos
    public static void main(String[] args) {
        Singleton obj1, obj2;
        
//        obj1 = new Singleton(); // Dá erro se tentar instanciar assim, pois o construtor é privado. Aqui só não vai dar erro porque o main está dentro da própria classe, então tem acesso a esse método. Mas em condições normais daria erro
        obj1 = Singleton.obterInstancia(); // Usando o método estático para instanciar o objeto. Esse método que chama o construtor privado e, por ser um método de classe, não precisamos de ter uma instância para chamar o método, justamente o que precisamos para que a classe seja instanciada corretamente.
        obj1.setUsuario("João");
        System.out.println("Usuário 1: " + obj1.getUsuario());
        System.out.println("Endereço do objeto 1: " + obj1);
        
        System.out.println("Tentando instanciar o objeto novamente");
        obj1 = Singleton.obterInstancia(); 
        System.out.println("Endereço do objeto 1: " + obj1);
        System.out.println("Com isso, podemos ver que não instanciou e é o mesmo objeto de antes");
        
        System.out.println("\nObtendo instância para o objeto 2: Agora o objeto 2 também aponta para o mesmo objeto que o 1");
        obj2 = Singleton.obterInstancia();
        System.out.println("Usuário 2: " + obj2.getUsuario());
        System.out.println("Endereço do objeto 1: " + obj1);
        System.out.println("Endereço do objeto 2: " + obj2);
    }
    
}
