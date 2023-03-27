/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitos;

/**
 *
 * @author willi
 */
public class TestaCadastroAlunos {
    
    public static void main(String[] args) {
        Curso c1 = new Curso("Ciencia da Computacao", "Exatas", 1994);
        Aluno a1 = new Aluno(10, "Paula", c1, 9);
        Aluno a2 = new Aluno(20, "Adenor", c1, 7.5);
        
        CadastroAluno cad = new CadastroAluno();
        cad.incluiAluno(a1);
        cad.incluiAluno(a2);
        cad.incluiAluno(new Aluno(30, "Willyan", c1, 8.5));
        
        cad.mostraAlunos();
        
        System.out.println("Quantidade de alunos aprovados: " + cad.quantidadedeAprovados());
        
        a2.printAluno();
        cad.alteraNota(20, 10);
        a2.printAluno();
    }
}
