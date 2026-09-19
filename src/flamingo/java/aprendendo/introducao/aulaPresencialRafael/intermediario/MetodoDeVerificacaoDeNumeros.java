package flamingo.java.aprendendo.introducao.aulaPresencialRafael.intermediario;

import java.util.Scanner;

public class MetodoDeVerificacaoDeNumeros {
	static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String numeroDigitado,texto;
		byte contadoraDeRepeticoes=0;

		do {
			if (contadoraDeRepeticoes>0){
				System.out.println("\tDigite Novamente!!");
			}
			System.out.println("Digite um número qualquer:");
			numeroDigitado=sc.nextLine();
			contadoraDeRepeticoes++;
		}while(!verificarNumero(numeroDigitado));
		//para que o java não indique um erro é necessário realizar a conversão da ','(vírgula) para '.'(ponto)
		texto = numeroDigitado.replace(',', '.');
		System.out.printf("Número Digitado Corresponde a %.2f Reais\n",Double.parseDouble(texto));
	}
	public static boolean verificarNumero(String num){
		//O num == null serve para verificar:
		//Se o usuário não preenche um campo opcional, enviando um null como padrão, ou então, se o usuário cancela a ação, como fechar a janela ou algo assim, retornando null como padrão
		//Resumindo: Se o usuário deixou de preencher algo ou cancelou uma ação
		//No caso do desenvolvedor ele verifica se a váriavel existe ou verifica se o dado que está sendo buscado existe.
		//ao invés de .equals("") poderia utilizar .isEmpty()
		if(num == null || num.equals("") ){
			return false;
		}
			//num.length() contabiliza a quantidade de caracteres do valor de uma váriavel
			//vez<num.length() cria um teste, se o valor de 'vez' for menor que a quantidade de caracteres do valor da váriavel
		byte quantidadePontos=0;
			for (byte vez=0;vez<num.length();vez++){
				//o metodo charAt() com a váriavel 'vez' dentro dele - charAt(vez) - identifica o caracter que está na posição númerica indicada pela váriavel vez. Se vez igual 5 então o Quinto caracter será atribuido a uma váriavel chamada 'caracter'.
				//A variavel 'caracter' é do tipo CHAR, isso possibilita utilizar a tabela ASCII para realizar verificações
				char caracter=num.charAt(vez);
				// 1. Permite o sinal de menos (-) apenas na primeira posição
				if (vez == 0 && caracter == '-') {
					continue; // Pula para o próximo caractere
				}
				// 2. Permite ponto (.) ou vírgula (,) mas apenas 1 vez
				if (caracter == '.' || caracter == ',') {
					quantidadePontos++;
					if (quantidadePontos > 1) {
						return false; // Mais de um ponto torna o número inválido (ex: 10.5.2)
					}
					continue; // Pula para o próximo caractere
				}
				//Dentro do SE está sendo realizado um teste para verificar se determinado caracter está fora dos códigos algarismos númericos correspondentes na tabela ASCII, ou seja, na tabela ASCII os algarismos númericos comecçam no código 48 e terminam no código 57, sendo o número '0' -> 48 e o número '9' -> 57
				//poderia ser modificado para if(!Character.isDigit(caracter))
				if (caracter < 48 || caracter > 57){
					return false;
				}
			}
		// Impede que o texto seja apenas um ponto "." ou apenas um hífen "-"
		if (num.equals(".") || num.equals(",") || num.equals("-")) {
			return false;
		}
		return true;
	}
}
