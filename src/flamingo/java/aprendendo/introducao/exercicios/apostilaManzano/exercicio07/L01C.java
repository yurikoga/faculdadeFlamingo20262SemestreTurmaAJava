package flamingo.java.aprendendo.introducao.exercicios.apostilaManzano.exercicio07;
import java.util.Scanner;
import java.lang.Math;
/**Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:<br>
 * Volume ← π * Raio² * Altura */
public class L01C {
	static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double raio,altura,volume,pi=3.14;
		System.out.println("\t\n--PROGRAMA DE CÁLCULO DE VOLUME DE UMA LATA DE ÓLEO--");
		System.out.println("Digite o raio da lata de óleo:");
		raio=sc.nextFloat();
		System.out.println("Digite a altura da lata de óleo:");
		altura= sc.nextFloat();
		volume=pi*Math.pow(raio,2)*altura;
		System.out.printf("Volume igual a %.2fcm²",volume);
	}
}
