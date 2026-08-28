//el ejercicio 3
package primer_taller;

import java.util.Scanner;

/**
 *
 * Luis Alejandro Acuña Aldana 
 */
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cal;
        int via;
        String disponible;
        int cond = 0;

        System.out.print("Ingrese la calificación del conductor: ");
        cal = sc.nextDouble();

        System.out.print("Ingrese la cantidad de viajes realizados: ");
        via = sc.nextInt();

        sc.nextLine();

        System.out.print("¿El conductor está disponible? (si/no): ");
        disponible = sc.nextLine();

        if (cal >= 4.8) {
            cond++;
        }

        if (via > 500) {
            cond++;
        }

        if (disponible.equalsIgnoreCase("si")) {
            cond++;
        }

        System.out.println();
        System.out.println("===== RESULTADO =====");

        if (cond == 3) {
            System.out.println("Asignación: Conductor Premium.");
        } else if (cond == 2) {
            System.out.println("Asignación: Conductor Estándar.");
        } else {
            System.out.println("No puede ser asignado.");
        }


    }
}
    

    