/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca_continuacao;

/**
 *
 * @author willi
 */

// Classe abstrata. Não posso instanciá-la
public abstract class FiguraPlana {
    private String nomeFigura;

    public FiguraPlana(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
    // Método abstrato
    public abstract double calculaArea();
    // Não implementamos nada aqui, somente declaramos que esse método É OBRIGATÓRIO nas classes filhas que não são abstratas
    // Os métodos que não forem abstratos e herdarem dessa classe precisam ter, obrigatoriamente, esse método implementado
            
}
