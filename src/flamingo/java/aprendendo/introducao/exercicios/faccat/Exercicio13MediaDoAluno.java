package flamingo.java.aprendendo.introducao.exercicios.faccat;

import java.lang.reflect.Array;
import java.util.Scanner;
public class Exercicio13MediaDoAluno {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float primeiraNota, segundaNota, terceiraNota;
        System.out.println("Programa Media do Aluno");
        System.out.println("Digite a 1°nota do aluno:");
        primeiraNota = sc.next();
        System.out.println("Digite a 2°nota do aluno:");
        segundaNota = sc.nextByte();
        System.out.println("Digite a 3°nota do aluno:");
        terceiraNota = sc.nextByte();

        float mediaFinal = (primeiraNota*2+segundaNota*3+terceiraNota*5)/10;

        System.out.printf("A Média do aluno é %.2f",mediaFinal);


    }
}
