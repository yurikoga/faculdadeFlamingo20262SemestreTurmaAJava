package flamingo.java.aprendendo.introducao.basico;

public class ExemploNarrowingCasting {
	public static void main(String[] args){
		double numeroDouble = 10.72d;
		int numero = (int)numeroDouble;
		System.out.printf("O número double é: %.2f\n",numeroDouble);
		System.out.println("O número inteiro é: "+numero);
	}
}
