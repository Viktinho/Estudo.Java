package topico1;

import java.util.Scanner;

public class Principal {
	public static void main (String args[]) {
		
		//Define o leitor do teclado
		Scanner leitor = new Scanner(System.in);
		
		//Define as vari�veis locais
		int x, y;
		
		//Le:
		System.out.println("Informe o 1� valor: ");
		x = leitor.nextInt();
		
		System.out.println("Informe o 2� valor: ");
		y = leitor.nextInt();
		
		//Cria a inst�ncia da classe matem�tica utilizando o construtor
		
		Matematica mat = new Matematica(x, y);
		
		// Imprime o resultado das opera��es atrav�s
		// de chamados aos m�todos da classe matem�tica
		
		System.out.println("-------------------"); //Apenas para organizar a sa�da
		System.out.println("O valor da soma �: "+ mat.soma());
		System.out.println("O valor da subtra��o �:"+ mat.subtrai());
		System.out.println("O valor da Multiplica��o �:"+ mat.multiplica());
		System.out.println("O valor da Divis�o �: "+ mat.divide());
		System.out.println("-------------------");
	}
}
