package flamingo.java.aprendendo.introducao.aulaPresencialJailson;

public class ExemploContinueBreak01 {
	static void main(String[] args) {
		for(int i=0;i<10;i++){
			if (i==2){
				continue;
			}
			if (i==4){
				break;
			}
			System.out.println(i);
		}
	}
}
