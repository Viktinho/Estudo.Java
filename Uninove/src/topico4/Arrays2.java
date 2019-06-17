package topico4;

import java.util.Scanner;

public class Arrays2 {

	public static void main (String args[]) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nomes[] = new String[5];
		
		for(int i = 0; i <= 4; i++) {
		System.out.println("Escreva os nomes dos candidatos: ");
		nomes[i] = leitor.next();
		}
		for(int i = 0; i <= 4; i++) {
		System.out.println(nomes[i]);
		}
	}

}
