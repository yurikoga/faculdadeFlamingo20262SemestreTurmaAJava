package flamingo.java.aprendendo.introducao.aulaPresencialJailson;

public class ExemploForEach01 {
	static void main(String[] args) {
		//o laço de repetição for-each não precisa de valor previamente no início e no final
		//for = para
		//enquanto houver dados dentro do array ele irá executar o loop
		String[] carros={"fita isolante","alicate","chave de fenda cruzada","multímetro"};
		for(String carro:carros){
			System.out.println(carro);
		}
	}
}
