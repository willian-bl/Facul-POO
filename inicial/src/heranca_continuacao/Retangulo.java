/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca_continuacao;

/**
 *
 * @author willi
 */
public class Retangulo extends FiguraPlana{
    private double lado1;
    private double lado2;

    public Retangulo(String nomeFigura, double lado1, double lado2) {
        super(nomeFigura);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public double calculaArea(){
        double area;
        area=lado1*lado2;
        return area;
    }
     
    
}
