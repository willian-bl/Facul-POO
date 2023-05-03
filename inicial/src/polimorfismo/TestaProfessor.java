/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author willi
 */
public class TestaProfessor {
    
    public static void main(String[] args){
        
        CadastroProfessor cad = new CadastroProfessor();
        
        ProfessorHorista ph1 = new ProfessorHorista(10, "Wanderson", "Computação", 30, 58);
        ProfessorHorista ph2 = new ProfessorHorista(35, "Talita", "Sistemas da Informação", 25, 50);
        ProfessorMensalista pm1 = new ProfessorMensalista(14, "Isabel", "Pedagogia", 4200);
        ProfessorMensalista pm2 = new ProfessorMensalista(26, "Rafael", "Educação Física", 3800);
        
        cad.incluiProfessor(ph1);
        cad.incluiProfessor(ph2);
        cad.incluiProfessor(pm1);
        cad.incluiProfessor(pm2);
        
        cad.mostrarSalarioHorista();
    }
}
