/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author willi
 */
public class CadastroProfessor {
    
    private Professor professores[] = new Professor[100];
    
    public void incluiProfessor(Professor p){
        for(int i = 0; i < professores.length; i++){
            if(professores[i] == null){
                professores[i] = p;
                return;
            }
        }
        System.out.println("Vetor está cheio");
    }
    
    public void mostrarSalarioHorista(){
        ProfessorHorista ph;
        for(int i = 0; i < professores.length; i++){
            if (professores[i] != null && professores[i] instanceof ProfessorHorista){
                ph = (ProfessorHorista)professores[i];  // casting - Depois de ter certeza que professores[i] é do tipo ProfessorHorista, podemos fazer a coerção para ter acesso ao mundo de ProfessorHorista
                System.out.println("Nome: " + ph.getNome());
                System.out.println("Salário: " + 4*ph.getQtdHoras()*ph.getValorHora() + "\n");
            }
        }
    }
    
    
}
