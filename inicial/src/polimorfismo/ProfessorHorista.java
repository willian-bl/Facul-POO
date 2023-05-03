/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author willi
 */
public class ProfessorHorista extends Professor {
    private int qtdHoras;
    private double valorHora;

    public ProfessorHorista(int codigo, String nome, String curso, int qtdHoras, double valorHora) {
        super(codigo, nome, curso);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
}
