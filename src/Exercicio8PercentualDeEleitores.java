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
        while (totalDeVotosBrancos > totalDeEleitores){
            System.out.println("Digite a quantidade correta!\n"+totalDeVotosBrancos+" é maior que o total de eleitores que é "+totalDeEleitores);
			totalDeVotosBrancos = entradaDeDados.nextInt();
        }

		System.out.println("Digite a quantidade de votos nulos");
		int totalDeVotosNulos = entradaDeDados.nextInt();
		while (totalDeVotosNulos > (totalDeEleitores-totalDeVotosBrancos)){
			System.out.println("Digite a quantidade correta!\n"+totalDeVotosNulos+" é maior que a quantidade restante de eleitores que é "+(totalDeEleitores-totalDeVotosBrancos));
			totalDeVotosNulos = entradaDeDados.nextInt();
		}

		int totalDeVotosValidos = totalDeEleitores-totalDeVotosBrancos-totalDeVotosNulos;


		float porcentagemDeVotosBrancos = (totalDeVotosBrancos/totalDeEleitores)*100;
		float porcentagemDeVotosNulos = (totalDeVotosNulos/totalDeVotosValidos)*100;
		float porcentagemDeVotosValidos = (totalDeVotosValidos/totalDeEleitores)*100;

		System.out.println("Percentuais adquiridos nessa eleição");
		System.out.println("Votaram Branco: "+totalDeVotosBrancos+"%");
		System.out.println("Votaram Nulo: "+totalDeVotosNulos+"%");
		System.out.println("Votaram Válidos: "+totalDeVotosValidos+"%");

    }
}
