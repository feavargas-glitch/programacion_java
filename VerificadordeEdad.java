
import java.util.Scanner;

public class VerificadordeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el año actual: ");
        int anioActual = scanner.nextInt();

        System.out.println("IngresaS tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        int edad = anioActual -anioNacimiento;
        System.out.println("Tienes aproximadamente " + edad + " años.");

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
        else {
            System.out.println("Eres mayor de edad.");
        }

        scanner.close();
    }
}
//Cambio de prueba para forzar el envío
