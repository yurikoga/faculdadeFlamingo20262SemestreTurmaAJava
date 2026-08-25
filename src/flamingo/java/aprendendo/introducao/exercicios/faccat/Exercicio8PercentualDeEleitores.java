package exercicios.faccat;

import java.util.Scanner;
public class Exercicio8PercentualDeEleitores {
    public static void main(String[] args) {

        /* 8) Escreva um algoritmo para ler o número total de eleitores de um município,
         o número de votos brancos, nulos e válidos. Calcular e escrever o percentual
         que cada um representa em relação ao total de eleitores. */

		//testando commit

        Scanner entradaDeDados = new Scanner(System.in);
        boolean decisao = true;

        System.out.println("Programa de Cálculo de Percentual de Eleitores");
        System.out.println("Digite o total de eleitores:");
        int totalDeEleitores = entradaDeDados.nextInt();


        System.out.println("Digite a quantidade de votos brancos");
        int totalDeVotosBrancos = entradaDeDados.nextInt();
        while (totalDeVotosBrancos >= totalDeEleitores){
            System.out.println("Digite a quantidade correta!\n"+totalDeVotosBrancos+" é maior que o total de eleitores que é "+totalDeEleitores);
			totalDeVotosBrancos = entradaDeDados.nextInt();
        }

		System.out.println("Digite a quantidade de votos nulos");
		int totalDeVotosNulos = entradaDeDados.nextInt();
		while (totalDeVotosNulos >= (totalDeEleitores-totalDeVotosBrancos)){
			System.out.println("Digite a quantidade correta!\n"+totalDeVotosNulos+" é maior que a quantidade restante de eleitores que é "+(totalDeEleitores-totalDeVotosBrancos));
			totalDeVotosNulos = entradaDeDados.nextInt();
		}

		int totalDeVotosValidos = totalDeEleitores-totalDeVotosBrancos-totalDeVotosNulos;

		/*
		* As variáveis totalDeVotosBrancos, totalDeVotosNulos e totalDeEleitores são do tipo int. Em Java, a divisão entre dois números inteiros descarta as casas decimais. Como o número de votos é menor que o total, a divisão resulta em 0, e ao multiplicar por 100f, o resultado final fica 0.0%.
		*
		* Casting para float: Multiplique a variável por 100.0f antes de realizar a divisão ou faça o casting (float) totalDeVotos / totalDeEleitores * 100.*/

		float porcentagemDeVotosBrancos = totalDeVotosBrancos*100.0f/totalDeEleitores;
		float porcentagemDeVotosNulos = totalDeVotosNulos*100.0f/totalDeEleitores;
		float porcentagemDeVotosValidos = totalDeVotosValidos*100.0f/totalDeEleitores;

//		System.out.println("Percentuais adquiridos nessa eleição");
//		System.out.printf("Votaram Branco: %.2f %%\n", porcentagemDeVotosBrancos);
//		System.out.printf("Votaram Nulo: %.2f %%\n", porcentagemDeVotosNulos);
//		System.out.printf("Votaram Válidos: %.2f %%\n", porcentagemDeVotosValidos);

		System.out.printf("Percentuais adquiridos nessa eleição\nTotal de Eleitores: %d\nVotaram Branco: %.2f%% dos Eleitores\nVotaram Nulo: %.2f%% dos Eleitores\nVotos Válidos: %.2f%% dos Eleitores ",totalDeEleitores,porcentagemDeVotosBrancos,porcentagemDeVotosNulos,porcentagemDeVotosValidos);

    }
}
