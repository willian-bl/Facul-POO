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
    
    public static void desenhaLinha(){
    System.out.println("\n-------------------------------------------------------\n");
   }
    
    public static void main(String[] args) {
        Curso c1 = new Curso("Ciencia da Computacao", "Exatas", 1994);
        Aluno a1 = new Aluno(10, "Paula", c1, 9);
        Aluno a2 = new Aluno(20, "Adenor", c1, 7.5);
        
        CadastroAluno cad = new CadastroAluno();
        cad.incluiAluno(a1);
        cad.incluiAluno(a2);
        cad.incluiAluno(new Aluno(30, "Willyan", c1, 8.5));
        
        cad.mostraAlunos();
        desenhaLinha();
        
        System.out.println("Quantidade de alunos aprovados: " + cad.quantidadedeAprovados());
        desenhaLinha();
        
        a2.printAluno();
        cad.alteraNota(20, 10);
        a2.printAluno();
        
        desenhaLinha();
        
        cad.mostraAlunos();
        System.out.println("-----------------------");
        Aluno a = cad.excluiAluno(20);
        if(a != null){
            System.out.println("Aluno com RGM " + a.getRgm() + " removido do cadastro dos alunos!");
        }
        else{
            System.out.println("Aluno não encontrado");
        }
        cad.mostraAlunos();
        
        desenhaLinha();
        
        a = cad.obtemAlunoMaiorNota();
        System.out.println("Aluno com a maior nota: " + a.getNomeAluno() + " | Nota " + a.getNotaAluno());
        
        Aluno aprov[];
        aprov = cad.obtemAlunosAprovados();
        System.out.println("Alunos aprovados: ");
        for(Aluno a_aprov:aprov){
            if(a_aprov != null){
                System.out.println("Nome: " + a_aprov.getNomeAluno() + " | Nota: " + a_aprov.getNotaAluno());
            }
        }
        
    }
}
