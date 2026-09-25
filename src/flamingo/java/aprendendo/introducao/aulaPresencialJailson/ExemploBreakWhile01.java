package flamingo.java.aprendendo.introducao.aulaPresencialJailson;

public class ExemploBreakWhile01 {
	static void main(String[] args) {
		int i = 0; //iniciou a váriavel
		while (i < 10) {//realizou o teste se i é menor que 10
			System.out.println(i);//imprimiu i
			i++;//incrementou i
			if (i == 4) { //testou i novamente, se i for igual a 4 ele quebra o laço
				break;
			}
		}
	}
}
