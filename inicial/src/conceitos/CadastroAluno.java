/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitos;

/**
 *
 * @author willi
 */
public class CadastroAluno {
    private Aluno alunos[] = new Aluno[20];
    
    // Criar um método para incluir um objeto do tipo Aluno recebido como parâmetro no vetor alunos
    // O objeto será colocado em uma posição livre (igual a null) do vetor.
    
    public void incluiAluno(Aluno aluno){
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] == null){  // Verifica se a posição i está livre, para não atribuir 
                alunos[i] = aluno;
                return;
            }
        }
        
        System.out.println("O vetor de alunos está cheio, \nA inclusão não foi feita!");
    }
    
    //Incluir método para mostrar o conteúdo do vetor alunos
    public void mostraAlunos(){
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null){
                System.out.println("RGM: " + alunos[i].getRgm());
                System.out.println("Nome do aluno: " + alunos[i].getNomeAluno());
                System.out.println("Curso: " + alunos[i].getCursoAluno().getNome());
            }
            
        }
    }
    
    // Criar um método para retornar a quantidade de alunos com nota maior ou igual a 6
    public int quantidadedeAprovados(){
        int qtd = 0;
        for(int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null){
                if (alunos[i].getNotaAluno() >= 6){
                qtd++;
                }
            }
        }
        return qtd;
    }
    
    // Criar um método para alterar a nota de um aluno. O método recebe como parâmetroo rgm e a nova nota
    // Ele vai alterar a nota do aluno que tenha RGM igual ao RGM do parâmetro
    
    public void alteraNota(int rgm, double novaNota){
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null){
                if (alunos[i].getRgm() == rgm){
                    System.out.println("Aluno com rgm " + rgm + " teve sua nota alterada de " + alunos[i].getNotaAluno() + " para " + novaNota);
                    alunos[i].setNotaAluno(novaNota);
                    return;
                }
            }
        }
        System.out.println("Aluno com rgm " + rgm + " não está cadastrado!");
    }
    
    
}
