import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        double num1 = lector.nextDouble();

        System.out.println("Ingresa el operador(+, -, *, /): ");
        char operador = lector.next().charAt(0);

        System.out.println("Ingresa el segundo numero: ");
        double num2 = lector.nextDouble();

        double resultado = 0;
        boolean operacionValida = true;
         
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado =  num1 / num2;
                } else {
                    System.out.println("Error: no se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operador no valido.");
                operacionValida = false;
                
        
            
        }
        
        if (operacionValida){
            System.out.println("El resultado es: " + resultado);
        }

        lector.close();
    }
}
