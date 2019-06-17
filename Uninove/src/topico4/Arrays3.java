package topico4;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays3 {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite a posição " + i + " do número: ");

			int num = leitor.nextInt();
			array[i] = num;

		}

		Arrays.sort(array);

		int maior = array[9];
		int menor = array[0];

		System.out.println("Maior = " + maior + "\nMenor = " + menor + "\nDiferença = " + (maior - menor));

	}
}