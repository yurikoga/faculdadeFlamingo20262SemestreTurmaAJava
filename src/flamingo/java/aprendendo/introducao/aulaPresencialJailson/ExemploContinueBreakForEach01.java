package flamingo.java.aprendendo.introducao.aulaPresencialJailson;

public class ExemploContinueBreakForEach01 {
	static void main(String[] args) {
		int[]numeros={3,-1,7,0,9}; //lista com 5 elementos
		for(int n : numeros){ //atribui determinado valor da lista a uma váriavel chamada 'n'
			if(n<0){//testa se 'n' for menor que 0, ele pula para o próximo elemento da lista
				continue;
			}
			if (n==0){//mais um teste, se 'n' for igual a 0 o laço "para"
				break;
			}
			System.out.println(n);// 3, 7
		}
	}
}
