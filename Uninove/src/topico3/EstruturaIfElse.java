package topico3;

import java.util.Scanner;

public class EstruturaIfElse {

	public static void main(String ars[]) {

		Scanner leitor = new Scanner(System.in);

		int a, b;


		System.out.println("Escreva o valor da vari�vel a: ");
		a = leitor.nextInt();

		System.out.println("Escreva o valor da vari�vel b: ");
		b = leitor.nextInt();

		if (a > b) {
			System.out.println("A vari�vel a � maior que b");
		} else if (a < b) {
			System.out.println("A vari�vel b � maior que a");
		} else if (a == b) {
			System.out.println("As vari�veis possuem o mesmo valor");
		} else {
			System.out.println("N�o foi poss�vel concluir a compara��o");
		}

	}

}
