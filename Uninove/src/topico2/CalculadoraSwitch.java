package topico2;

import java.util.Scanner;

public class CalculadoraSwitch {
	
	public static void main (String args[]) {
		int valor1, valor2, escolha, resultado;
		
		Scanner scanner = new Scanner(System.in);		//Declara��o do scanner
		
		System.out.println("Escreva o primeiro valor:");
		valor1 = scanner.nextInt();
		
		System.out.println("Escreva o segundo valor: ");
		valor2 = scanner.nextInt();
		
		System.out.println("Qual opera��o deseja fazer?\n");
		System.out.println("Adi��o digite -> 1");
		System.out.println("Subtra��o digite -> 2");
		System.out.println("Multiplica��o digite -> 3");
		System.out.println("Divisa� digite -> 4");
		escolha = scanner.nextInt();
		
		switch(escolha) {
		case 1:
			resultado = valor1 + valor2;
			System.out.println("O resultado da adi��o �: "+ resultado);
			break;
		case 2:
			resultado = valor1 - valor2;
			System.out.println("O resultado da divis�o �: "+ resultado);
			break;
		case 3:
			resultado = valor1 * valor2;
			System.out.println("O resultado da multiplica��o �: "+ resultado);
			break;
		case 4:
			resultado = valor1 / valor2;
			System.out.println("O resultado da divis�o �: "+ resultado);
			break;
		}
	}

}
