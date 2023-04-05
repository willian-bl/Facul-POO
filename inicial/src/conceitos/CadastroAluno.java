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
    
    
    // Criar um método para retirar um aluno do vetor
    public Aluno excluiAluno(int rgm){
    // Se encontrar o aluno que tenha o rgm igual ao rgm passado como parâmetro, atribuir null para a posição onde está armazenado.
    // O método retorna o aluno que foi excluído. Se não encontrar aluno para ser excluído, o método retorna null
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null){
                if(alunos[i].getRgm() == rgm){
                    Aluno a = alunos[i];
                    alunos[i] = null;
                    return a;
                }
            }
        }
        return null;
    }
    
    
    public Aluno obtemAlunoMaiorNota(){
        // Retorna o aluno com a maior nota
        double maiorNota = -1;
        Aluno alunoMaiorNota = null;
        for(Aluno aluno:alunos){
            if(aluno != null && aluno.getNotaAluno() > maiorNota){
                alunoMaiorNota = aluno;
                maiorNota = aluno.getNotaAluno();
            }
        }
        
        return alunoMaiorNota;
    }
    
    
    // Método para facilitar a criação do vetor de alunos aprovados. Ele é acessível somente dentro da classe,
    // para nos auxiliar. Métodos auxiliares são privados!
    private void incluiVetor(Aluno vetor[], Aluno a){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == null){
                vetor[i] = a;
                return;
            }
        }
    }
    
    
    // Escrever um método que retorna um vetor com todos os alunos aprovados. Para ser aprovado 
    // o aluno precisa ter nota maior ou igual a seis
    public Aluno[] obtemAlunosAprovados(){
        // retorna um vetor com objetos do tipo aluno
        Aluno aprovados[] = new Aluno[alunos.length];
        for (Aluno a : alunos) {
            if(a != null && a.getNotaAluno() >= 6){
                incluiVetor(aprovados, a);
            }
        }
        return aprovados;
    }
    
    
    // Escrever um método para retornar a quantidade de alunos com nota maior que a media de todos os alunos
    
}
