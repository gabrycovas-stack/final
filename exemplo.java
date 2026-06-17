import java.util.Scanner;

public class exemplo {

    // Método 1: El método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);

        System.out.println("--- Calculadora de Area de un Circulo ---");
        System.out.print("Por favor, ingresa el radio del circulo: ");
        
        double radio = scanner.nextDouble();

        // Llamada al segundo método
        double areaCirculo = calcularArea(radio);

        System.out.printf("El area del circulo con radio %.2f es: %.2f\n", radio, areaCirculo);
        
        scanner.close();
    }

    // Método 2: Calcula el área
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
