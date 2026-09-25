package flamingo.java.aprendendo.introducao.aulaPresencialJailson;

public class ExemploContinueWhile01 {
	static void main(String[] args) {
		int i = 0; //iniciou a váriavel
		while (i < 10) {//realizou o teste se i é menor que 10
			if (i == 4) { //testa i novamente, se i for igual a 4 ele pula para o próximo algarismo
				continue;
			}
			System.out.println(i);//imprimi i
			i++;//incrementa 1 a i
		}
	}
}
