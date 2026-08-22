import java.util.Scanner;

public class Exercicio9ReajusteSalarial{
	static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		/*9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário. */
		System.out.println("Programa Reajuste Salarial");
		System.out.println("Digite o valor bruto do seu salário atual:");
		float valorBrutoDoSalario = entradaDeDados.nextFloat();
		System.out.println("Digite o percentual de reajuste:");
		float percentualDeReajuste = entradaDeDados.nextByte();
//		System.out.println(valorBrutoDoSalario);
//		System.out.println(percentualDeReajuste);

		float salarioReajustado = valorBrutoDoSalario+(valorBrutoDoSalario*(percentualDeReajuste/100));

		System.out.println("O Salário "+valorBrutoDoSalario);

		entradaDeDados.close();
	}
}
