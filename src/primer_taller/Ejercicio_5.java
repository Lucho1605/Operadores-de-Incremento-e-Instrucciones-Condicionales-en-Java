// ejercicio 5
package primer_taller;

import java.util.Scanner;

/**
 *
 * @author María Paula
 */
public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vue;
        String memb;
        String cat;
        boolean VIP = false;

        System.out.print("Ingrese la cantidad de vuelos realizados en el año: ");
        vue = sc.nextInt();

        sc.nextLine();

        System.out.print("¿Tiene membresía activa? (si/no): ");
        memb = sc.nextLine();

        if (vue > 50) {

            if (memb.equalsIgnoreCase("si")) {
                cat = "Oro";

                if (vue > 70) {
                    VIP = true;
                }

            } else {
                cat = "Básica";
            }

        } else if (vue >= 20 && vue <= 50) {

            if (memb.equalsIgnoreCase("si")) {
                cat = "Plata";
            } else {
                cat = "Básica";
            }

        } else {
            cat = "Básica";
        }


        System.out.println("Categoría obtenida: " + cat);

        if (VIP) {
            System.out.println("Acceso VIP: Sí");
        } else {
            System.out.println("Acceso VIP: No");
        }

    }
}
