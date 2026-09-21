package flamingo.java.aprendendo.introducao.exercicios.JavaBasicoGuiaDidaticoParteUm;
//Exercício 01 - Tipos de dados
//Crie a classe Exercicio01. Declare uma variável String para o nome de um aluno, int para a idade, double para a nota e boolean para informar se ele está matriculado. Exiba todos os valores.
import java.util.Scanner;
public class Exercicio01 {
	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomeAluno;
		int num;
		String nota,idade;
		boolean matricula = true;
		System.out.println("---PROVÃO DE ESTÁGIO PARA ALUNOS FLAMINGO---");
		System.out.println("---Preencha os campos solicitados para verificar sua aprovação---");
		while(true){
			System.out.println("DIGITE O SEU NOME:");
			nomeAluno = sc.nextLine();
			if((verificarCaracter(nomeAluno)) == true){
				break;
			}
		}
		while(true){
			System.out.println("DIGITE SUA IDADE:");
			idade= sc.nextLine();
			if((verificarNumero(idade)) == true){
				break;
			}
		}
		while(true){
			System.out.println("DIGITE SUA NOTA(número de acertos):");
			nota=sc.nextLine();
			if((verificarNumero(nota)) == true){
				num=Integer.parseInt(nota);
				break;
			}
		}
		if(num > 55){
			System.out.printf("PARABÉNS, %S! VC FOI MATRICULADO NO PROGRAMA DE ESTÁGIO PARA ALUNOS FLAMINGO COM %S ACERTOS",nomeAluno,nota);
		}else{
			System.out.printf("%S INFELIZMENTE VC NÃO FOI MATRICULADO NO PROGRAMA DE ESTÁGIO PARA ALUNOS FLAMINGO",nomeAluno);
		}
	}
	public static boolean verificarCaracter(String nome){
		if (nome == null){
			return false;
		}else if(nome.matches("[a-zA-Z ]+")){
			return true;
		}else{
			return false;
		}
	}
	public static boolean verificarNumero(String num){
		//O num == null serve para verificar:
			//Se o usuário não preenche um campo opcional, enviando null como padrão ou se o usuário cancela a ação, fecha a janela ou algo assim, retornando null como padrão
			//Resumindo: Se o usuário deixou de preencher algo ou cancelou uma ação
			//No caso do desenvolvedor ele verifica se a váriavel existe ou verifica se o dado que está sendo buscado existe.
			if(num == null || num.equals("") ){
				return false;
			}else {
				//num.length() contabiliza a quantidade de caracteres dentro de uma váriavel
				//vez<num.length() cria um teste, se o valor de 'vez' for menor que
				for (byte vez=0;vez<num.length();vez++){
					char caracter=num.charAt(vez);
					//tabela ASCII - '0'=48 e '9'=47
					if (caracter < 48 || caracter > 57){
						return false;
					}
				}
			}
		return true;
	}
}