/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca_continuacao;

/**
 *
 * @author willi
 */
public class Triangulo extends FiguraPlana{
    private double base;
    private double altura;

    public Triangulo(String nomeFigura, double base, double altura) {
        super(nomeFigura);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public double calculaArea(){
        double area;
        area = base*altura / 2;
        return area;
    }
    
}
