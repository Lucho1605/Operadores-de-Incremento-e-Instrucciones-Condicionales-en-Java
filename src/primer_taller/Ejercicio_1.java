//para el primer ejercicio será sobre el proceso que realizan las cajas 
//registradoras automaticamente de una empresa de venta de artivulos al por 
//por mayor. implementar descuentos y dar el subtotal
//y total de la compra.
package primer_taller;

import static java.time.temporal.TemporalAdjusters.next;
import java.util.Scanner;

/**
 *
 * @author María Paula
 */
public class Ejercicio_1 {

    /**
     * Luis Alejandro Acuña Aldana 
     * 20261244210
     */
    public static void main(String[] args) {
        int cant,prec,subt;
        double des = 0,tot ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de productos a comprar: ");
        cant= sc.nextInt (); 
        
        System.out.println("ingrese el valor de unidad del producto: ");
        prec = (int) sc.nextLong(); 
        subt= (int) (cant*prec); 
        System.out.println("el valor a pagar sin descuento: "+subt);
        
        if (subt<100000){
            des= subt*0 ;
           
        }
        else if (subt>100000 && subt<300000){
            des= subt*0.1;
       
    }
        else if (subt>300000 && subt<500000){
            des= subt*0.15; 
        }
        else if (subt>500000){
            des= subt*0.2;
        }
        tot= subt-des; 
        System.out.println("el total: "+tot);
    }
}