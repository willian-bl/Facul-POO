/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author willi
 */
public class Administrador extends Empregado{
    
    private double ajudaCusto;

    public Administrador(double ajudaCusto, int codigoSetor, double salarioBase, double percentualImposto, String nome, String endereco, String telefone) {
        super(codigoSetor, salarioBase, percentualImposto, nome, endereco, telefone);
        this.ajudaCusto = ajudaCusto;
    }

    public double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAdministrador{" + "ajudaCusto=" + ajudaCusto + '}';
    }
    
    
}
