/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpga;

/**
 *
 * @author Gustavo Huerta
 */
public class MaquinaPGA {
    private double[] promAsigns;

    public MaquinaPGA(double[] promAsigns) {
        this.promAsigns = promAsigns;
    }

    public MaquinaPGA() {
    }

    public double[] getPromAsigns() {
        return promAsigns;
    }

    public void setPromAsigns(double[] PromAsigns) {
        this.promAsigns = PromAsigns;
    }
    
    
    public double calcularPeso(int cantHorasAi, int cantTotalHoras){
        Calculadora cal = new Calculadora(cantHorasAi,cantTotalHoras);
        double peso = cal.div();
        return peso;
    }
    public double calculo1(double peso, int i){
        Calculadora cal = new Calculadora(peso,this.promAsigns[i]);
        return cal.mulp();   
    }
    public double calculo2(double pga, double calculo1){
        Calculadora cal = new Calculadora(pga,calculo1);
        return cal.suma();
    }
}
