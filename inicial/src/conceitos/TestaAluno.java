/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitos;

/**
 *
 * @author willi
 */
public class TestaAluno {
    // o main é um método
    // Dentro de um método uma variável é sempre local
    public static void main(String[] args) {
        // criar variáveis do tipo Aluno
        // new aloca espaço na memória para os atributos do objeto
        // instanciar é alocar um espaço na memória para a criação do objeto
        
        // Instanciando o objeto 
        Aluno_original a1 = new Aluno_original();
        a1.setRgm(120);
        a1.setNotaAluno(8);
        a1.setNomeAluno("Carlos");
        a1.setCursoAluno("Computação");
        
        System.out.println("a1: ");
        a1.printAluno();
        
        Aluno_original a2 = new Aluno_original();
        a2.setRgm(180);
        a2.setNotaAluno(9);
        a2.setNomeAluno("Adriana");
        a2.setCursoAluno("Sistema");
        
        System.out.println("\na2: ");
        a2.printAluno();
        
        Aluno_original a3;
//        a3.printAluno(); // Da erro pois não alocamos espaço na memória para a3 com o "new"
        
        a3=a1;  // a3 recebe o mesmo endereço guardado em a1, pois a passagem de valores de objetos se dá por referência
        // ou seja, não estamos copiando o objeto a1 para a3. Ao invés disso, ambas as variáveis a1 e a3 irão apontar para o mesmo objeto

        System.out.println("\na3, cópia de a1:");
        a3.printAluno();
        
        a3.setRgm(150);
        // atraves do a3, está alterando o atributo rgm do a1
        
        System.out.println("\nAlterado RGM pelo a3\n-------------------------------------");
        System.out.printf("%s%s%n%s%s%n","a1 RGM: ", a1.getRgm(), "a3 RGM: ", a3.getRgm());
        
        a3 = new Aluno_original();  // a partir de agora, instanciamos um novo objeto e a variável a3 está apontando para ele, deixando de ter ligação com o a1
        a3.setRgm(195);
        a3.setNomeAluno("Odair");
        a3.setCursoAluno("Engenharia");
        a3.setNotaAluno(7.5);
        
        System.out.println("\na3 depois de instanciar um novo objeto para ele:");
        a3.printAluno();
        System.out.println("Agora a1 não tem mais ligação com a3. \na1: ");
        a1.printAluno();
        
        a1 = null;  // limpando a variável a1. A partir de agora a1 já não está definida
        
//        System.out.println("Depois de limpar a variável: ");
//        a1.printAluno();  // Dá erro, pois a1 já não tem mais a referência do nosso objeto
    }
}

// a palavra reservada "final" declara uma constante. A convensão para escrever os nomes de variáveis nesse caso é usar tudo em maiúsculo