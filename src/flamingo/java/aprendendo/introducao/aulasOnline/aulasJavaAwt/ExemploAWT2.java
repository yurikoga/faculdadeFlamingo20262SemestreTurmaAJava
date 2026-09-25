package flamingo.java.aprendendo.introducao.aulasOnline.aulasJavaAwt;

// imoportando a biblioteca java awt
import java.awt.*;

public class ExemploAWT2 {

		// Iniciando com o metodo construtor
		ExemploAWT2() {

			// criando um frame de nome 'frame'
			Frame frame = new Frame();

			// criando uma etiqueta de nome 'etiqueta'
			Label etiqueta = new Label("Digite:");

			// criando um botão de nome 'botao'
			Button botao = new Button("Clique aqui!");

			// criando um campo de texto com o nome "texto"
			TextField texto = new TextField();

			// definindo a posição e tamanho dos componentes dentro do frame
			etiqueta.setBounds(20, 80, 80, 30);
			texto.setBounds(20, 100, 100, 30);
			botao.setBounds(100, 100, 80, 30);

			// adicionando os componentes dentro do frame
			frame.add(botao);
			frame.add(etiqueta);
			frame.add(texto);

			// definindo o tamanho do frame (largura, altura)
			frame.setSize(600,300);

			// definindo o título do frame
			frame.setTitle("Exemplo AWT - 2");

			// sem gerenciador de layout
			frame.setLayout(null);

			// definindo que estará visível
			frame.setVisible(true);
		}

		// metodo principal
		public static void main(String[] args) {

		// criando uma instância para o frame dentro do metodo principal
			ExemploAWT2 frame = new ExemploAWT2();

		}
}
