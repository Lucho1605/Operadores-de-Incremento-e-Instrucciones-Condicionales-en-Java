//ejercicio 4
package primer_taller;

import java.util.Scanner;

/**
 *
 * Luis Alejandro Acuña Aldana 
 */
public class Ejercicio_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ingr;
        int punt;
        double antig;
        int crit = 0;

        System.out.print("Ingrese sus ingresos mensuales: ");
        ingr = sc.nextDouble();

        System.out.print("Ingrese su puntaje crediticio: ");
        punt = sc.nextInt();

        System.out.print("Ingrese su antigüedad laboral en años: ");
        antig = sc.nextDouble();

        if (ingr > 5000000) {
            crit++;
        }

        if (punt > 750) {
            crit++;
        }

        if (antig > 2) {
            crit++;
        }


        if (crit == 3) {
            System.out.println("Crédito Aprobado.");
        } else if (crit >= 2) {
            System.out.println("Crédito Condicionado.");
        } else {
            System.out.println("Crédito Rechazado.");
        }

    }
}
