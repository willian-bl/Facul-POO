/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author willi
 */
public class Empregado extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private double  percentualImposto;

    public Empregado(int codigoSetor, double salarioBase, double percentualImposto, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.percentualImposto = percentualImposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getPercentualImposto() {
        return percentualImposto;
    }

    public void setPercentualImposto(double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpregado{" + "codigoSetor=" + codigoSetor + ", salarioBase=" + salarioBase + ", percentualImposto=" + percentualImposto + '}';
    }
    
    // Definir o método obterValorImposto. Este método retorna o valor do imposto que é o percentual
    // aplicado ao salário
    public double obtemValorImposto(){
        return this.getSalarioBase() * this.getPercentualImposto();  // Pode ou não por o this e pode usar o get ou o atributo direto
    }
    
    // Definir método obter salário líquido. Esse método retorna o salário base menos o valor do imposto
    public double obterSalarioLiquido(){
        return this.salarioBase - this.obtemValorImposto();  
    }
    
}