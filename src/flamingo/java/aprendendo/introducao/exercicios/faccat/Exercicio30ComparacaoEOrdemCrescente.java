package flamingo.java.aprendendo.introducao.exercicios.faccat;

//30) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
//crescente.

import java.util.Scanner;

public class Exercicio30ComparacaoEOrdemCrescente {
	static void main() {
		Scanner sc = new Scanner(System.in);
		short[]valores = new short[3];
		short valor1,valor2,valor3;
		for(byte vez = 0; vez < valores.length; vez++){
			System.out.printf("Digite o %d° valor:",(vez+1));
			valores[vez]=sc.nextShort();
		}
		if (valores [0] > valores[1] && valores[0] > valores[2] ){
			valor1 = valores[0];
			if (valores[1]>valores[2]){
				valor2=valores[1];
				valor3=valores[2];
			}else{
				valor2=valores[2];
				valor3=valores[1];
			}
		}else if(valores [1] > valores[0] && valores[1] > valores[2]){
			valor1 = valores[1];
			if (valores[2]>valores[0]){
				valor2=valores[2];
				valor3=valores[0];
			}else{
				valor2=valores[0];
				valor3=valores[2];
			}
		}else {
			valor1 = valores[2];
			if(valores[1]>valores[0]){
				valor2=valores[1];
				valor3=valores[0];
			}else{
				valor2=valores[0];
				valor3=valores[1];
			}
		}
		System.out.printf("1°valor: %d\n2°valor: %d\n3°valor: %d", valor1,valor2,valor3);
		sc.close();
	}
}
