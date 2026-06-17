import java.util.Scanner;

/**
 * Clase que representa unha calculadora básica para obter o área de figuras xeométricas.
 * * @author O teu nome
 * @version 1.0
 */
public class exemplo {

    /**
     * Método principal que serve como punto de entrada para a aplicación.
     * Solicita ao usuario o radio por consola e mostra o resultado do área.
     * * @param args Argumentos de liña de comandos (non utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);

        System.out.println("--- Calculadora de Area de un Circulo ---");
        System.out.print("Por favor, ingresa el radio del circulo: ");
        
        double radio = scanner.nextDouble();

        // Chámase ao método documentado para calcular o área
        double areaCirculo = calcularArea(radio);

        System.out.printf("El area del circulo con radio %.2f es: %.2f\n", radio, areaCirculo);
        
        scanner.close();
    }

    /**
     * Calcula o área dun círculo utilizando o radio proporcionado.
     * Emprega a fórmula matemática do produto de PI polo radio ao cadrado.
     * * @param radio O radio do círculo en formato de punto flotante (double).
     * @return O área calculada do círculo (double).
     */
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
