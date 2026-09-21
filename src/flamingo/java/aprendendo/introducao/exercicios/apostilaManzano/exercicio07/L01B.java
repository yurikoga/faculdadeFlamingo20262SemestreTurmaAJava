package flamingo.java.aprendendo.introducao.exercicios.apostilaManzano.exercicio07;
import java.util.Scanner;
/**b) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de
 conversão é C  (F - 32) * (5/9) , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

public class L01B {
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		double tempDigitada,celsius;
		System.out.printf("\t\n--PROGRAMA  DE CONVERSAO DE TEMPERATURA PARTE-02--");
		System.out.println("\nDigite a temperatura a ser convertida para Celsius:");
		tempDigitada = sc.nextDouble();
		celsius =(tempDigitada-32)*(5d/9d);
		System.out.printf("\nTemperatura Digitada: %.2f°F\nTemperatura Convertida: %.2f°C\n",tempDigitada,celsius);

	}
}
