package topico3;

import java.util.Scanner;

public class EstruturaIfElse {

	public static void main(String ars[]) {

		Scanner leitor = new Scanner(System.in);

		int a, b;


		System.out.println("Escreva o valor da variável a: ");
		a = leitor.nextInt();

		System.out.println("Escreva o valor da variável b: ");
		b = leitor.nextInt();

		if (a > b) {
			System.out.println("A variável a é maior que b");
		} else if (a < b) {
			System.out.println("A variável b é maior que a");
		} else if (a == b) {
			System.out.println("As variáveis possuem o mesmo valor");
		} else {
			System.out.println("Não foi possível concluir a comparação");
		}

	}

}
