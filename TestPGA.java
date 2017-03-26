/*
 * https://github.com/Gustavo131997/Tarea01 Este es el link del repositorio
 */
package testpga;

import java.util.Scanner;

/**
 *
 * @author Gustavo Huerta
 */
public class TestPGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar Cantidad de Asignatura");
        int cantAi = leer.nextInt();
        MaquinaPGA pga = new MaquinaPGA(new double [cantAi]);
        int cont=0;
        int cantTotalHoras = 0 ;
        int cantH = 0;
        int [] cantHs = new int[cantAi];
        do {
            double prom1=0;
            do{
            System.out.println("Ingrese promedio de Asignatura "+(cont+1));
           prom1 = leer.nextDouble();
            }while(!validarPromedio(prom1));
            pga.getPromAsigns()[cont] = prom1 ;
            System.out.println("Ingrese cantidad de horas de Asignatura "+(cont+1));
             cantH = leer.nextInt();
            cantTotalHoras = cantTotalHoras+cantH;
            cantHs[cont] = cantH;
            cont++;
        } while (cantAi != cont);
        cont = 0;
        double Pga=0;
        do {
            double peso;
            peso = pga.calcularPeso(cantHs[cont], cantTotalHoras);
            Pga = pga.calculo2(Pga,pga.calculo1(peso, cont));
            cont++;
        } while (cont != cantAi);
        System.out.println("PGA: "+Pga);
        
    }
   public static boolean validarPromedio(double promedio){
       return promedio >= 1 && promedio <= 7;
   }
}
