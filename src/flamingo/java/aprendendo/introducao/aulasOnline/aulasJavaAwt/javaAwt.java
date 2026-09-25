package flamingo.java.aprendendo.introducao.aulasOnline.aulasJavaAwt;
/**<p>Com base nos exemplos fornecidos do Java AWT(Abstract Window Toolkit) Tutorial, a herança e a associação são duas abordagens fundamentais na Programação Orientada a Objetos para construir e estruturar interfaces gráficas. A principal diferença entre elas está na relação que a sua classe principal (<code>AWTExample</code>) estabelece com a classe <code>Frame</code> (a janela do AWT).</p>

 <h2>1. Herança (AWTExample1)</h2>
 <p>Na herança, a sua classe <strong>é um</strong> Frame (<code>extends Frame</code>).</p>
 <ul>
 <li><strong>Como funciona:</strong> A classe <code>AWTExample1</code> herda diretamente todos os métodos e propriedades da classe <code>Frame</code> (como <code>setSize</code>, <code>setTitle</code>, <code>setLayout</code> e <code>add</code>).</li>
 <li><strong>No código:</strong> Como a própria classe se torna uma janela, você não precisa criar uma variável separada para instanciar o frame. Métodos como <code>add(b)</code> ou <code>setSize(300, 300)</code> são chamados diretamente no contexto da própria classe.</li>
 <li><strong>Vantagem:</strong> O código fica mais limpo e enxuto para aplicações simples baseadas em uma única janela, pois evitam-se chamadas repetitivas de objetos intermediários.</li>
 </ul>

 <h2>2. Associação (AWTExample2)</h2>
 <p>Na associação, a sua classe <strong>tem um</strong> Frame (relação de composição ou uso).</p>
 <ul>
 <li><strong>Como funciona:</strong> A classe <code>AWTExample2</code> não herda de <code>Frame</code>. Em vez disso, ela cria e gerencia uma instância da classe <code>Frame</code> internamente (geralmente como uma variável local ou atributo, como <code>Frame f = new Frame();</code>).</li>
 <li><strong>No código:</strong> Todas as operações visuais precisam ser direcionadas explicitamente para o objeto criado. Por exemplo, em vez de chamar <code>setSize(...)</code>, você precisa chamar <code>f.setSize(...)</code>; e em vez de <code>add(b)</code>, você usa <code>f.add(b)</code>.</li>
 <li><strong>Vantagem:</strong> Promove um design mais modular e flexível, permitindo que a sua classe lógica controle múltiplos componentes ou janelas sem ficar presa rigidamente à hierarquia de herança do AWT.</li>
 </ul>*/

public class javaAwt {
	/*
	* - para importar o java AWT
	* import java.awt.*;
	*
	* Na herança não é necessário direcionar todas as operações diretamente pois a classe principal tem um frame próprio
	* - Herança (AWTExample1 É UM Frame)
		public class AWTExample1 extends Frame {
		- Construtor
    	AWTExample1() {
    * 	}
    *
    * Na associação é necessário direcionar todas as operações diretamente pois a classe principal não tem um frame próprio
	* - Construtor por associação:
		AWTExample2() {
			- Criando a instância da janela (Frame)
			Frame f = new Frame();
	*	}
	*
	* ambas as duas formas irão chamar o metodo construtor da mesma maneira
	* - public static void main(String[] args){
	* 		NomeDoMetodo nomeEscolhido = new NomeDoMetodo();
	*            igual o Scanner
	* 		Scanner sc = new Scanner();
	* }
    * */
}
