package division;

import java.util.Scanner;

public class ClaseDivision {

    public static void main(String[] args) {

        try {
            int valor1, valor2, resultado;
            Scanner entrada = new Scanner(System.in);

            System.out.print("Ingrese el primer valor: ");
            valor1 = entrada.nextInt();

            System.out.print("Ingrese el segundo valor: ");
            valor2 = entrada.nextInt();

            resultado = valor1 / valor2;

            System.out.println("El resultado de la division es igual a: " + resultado);

        } catch (Exception e) {
            System.out.println("Error!!!! " + e);
        } finally {
            System.out.println("Operación concluída!!");
        }

    }

}
