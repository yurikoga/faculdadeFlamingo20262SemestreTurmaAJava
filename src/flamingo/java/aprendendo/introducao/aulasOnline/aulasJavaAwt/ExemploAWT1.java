package flamingo.java.aprendendo.introducao.aulasOnline.aulasJavaAwt;

// importando a classe Java AWT
import java.awt.*;

// criando um frame a partir da classe principal, ou seja, a própria classe principal vira um Frame
public class ExemploAWT1 extends Frame {

	// iniciando com um metodo construtor
	ExemploAWT1() {

		// criando um botão
		Button b = new Button("Click Me!!");

		// definindo a posição e o tamanho do botão dentro do frame
		b.setBounds(30,100,80,30);

		// adicionando o botão ao Frame
		add(b);

		// definindo o tamanho do frame
		setSize(300,300);

		// definindo o Título que aparecerá no topo do Frame
		setTitle("Exemplo AWT 01");

		// definindo que não haverá um gerenciador de layout
		setLayout(null);

		// tornando o frame visível, sem este detalhe ele ficaria INvisível por padrão.
		setVisible(true);
	}

	// metodo principal
	public static void main(String[] args) {

		// instanciando um frame a partir do metodo principal
		ExemploAWT1 f = new ExemploAWT1();
	}
}
