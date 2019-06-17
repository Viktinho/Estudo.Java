package topico2;

import java.util.Scanner;

public class CalculadoraSwitch {
	
	public static void main (String args[]) {
		int valor1, valor2, escolha, resultado;
		
		Scanner scanner = new Scanner(System.in);		//Declaração do scanner
		
		System.out.println("Escreva o primeiro valor:");
		valor1 = scanner.nextInt();
		
		System.out.println("Escreva o segundo valor: ");
		valor2 = scanner.nextInt();
		
		System.out.println("Qual operação deseja fazer?\n");
		System.out.println("Adição digite -> 1");
		System.out.println("Subtração digite -> 2");
		System.out.println("Multiplicação digite -> 3");
		System.out.println("Divisaõ digite -> 4");
		escolha = scanner.nextInt();
		
		switch(escolha) {
		case 1:
			resultado = valor1 + valor2;
			System.out.println("O resultado da adição é: "+ resultado);
			break;
		case 2:
			resultado = valor1 - valor2;
			System.out.println("O resultado da divisão é: "+ resultado);
			break;
		case 3:
			resultado = valor1 * valor2;
			System.out.println("O resultado da multiplicação é: "+ resultado);
			break;
		case 4:
			resultado = valor1 / valor2;
			System.out.println("O resultado da divisão é: "+ resultado);
			break;
		}
	}

}
