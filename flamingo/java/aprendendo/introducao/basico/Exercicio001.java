package flamingo.java.aprendendo.introducao.basico;

import java.time.LocalDate; //pegar a data atual
import java.time.format.DateTimeFormatter; //formata o modelo da data

import java.util.Locale;
import java.text.NumberFormat;

public class Exercicio001 {
	static void main() {
		String nome = "Yuri Koga Santos";
		String endereco = "06351-035" ;

		float salario = 4200.5f;
		Locale localBrasil = new Locale("pt","BR");
		NumberFormat formatoEmReais = NumberFormat.getCurrencyInstance(localBrasil);
		String salarioFormatado = formatoEmReais.format(salario);

		LocalDate hoje = LocalDate.now(); //pega a data atual
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");//formato definido
		String dataFormatada = hoje.format(formato);//formato aplicado em cima da 'data atual'

		System.out.printf("Eu %s, morando no endereço de CEP %s, confirmo o salário de %S , na data %s.", nome, endereco, salarioFormatado, dataFormatada);
		//teste
	}
}
