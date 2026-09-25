package flamingo.java.aprendendo.introducao.aulaPresencialJailson;

public class ExemploContinue01 {
	static void main(String[] args) {
		for(int i=0;i<10;i++){
			//se a condição for verdadeira(true) o laço de repetição "pula" uma interação e vai para a próxima interação, vai para o próximo algarismo
			if(i==4){
				continue;
			}
			System.out.println(i);
		}
	}
}
