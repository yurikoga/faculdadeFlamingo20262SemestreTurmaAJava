package flamingo.java.aprendendo.introducao.exercicios.apostilaManzano.exercicio07;
import java.util.Scanner;

/**a) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
 conversão é F  (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */

public class L01A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tempDigitada, fahrenheit;
		System.out.println("\t--PROGRAMA DE CONVERSÃO DE TEMPERATURA PARTE-01--");
		System.out.println("Digite a temperatura a ser convertida para Fahrenheit:");
		tempDigitada = sc.nextDouble();
		fahrenheit = (9 * tempDigitada + 160d) / 5d;
		System.out.printf("\n\nTemperatura Digitada: %.2f°C\nTemperatura Convertida: %.2f°F\n\n",tempDigitada,fahrenheit);
	}
}
