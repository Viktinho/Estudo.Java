package topico1;

import java.util.Scanner;

public class Principal {
	public static void main (String args[]) {
		
		//Define o leitor do teclado
		Scanner leitor = new Scanner(System.in);
		
		//Define as variáveis locais
		int x, y;
		
		//Le:
		System.out.println("Informe o 1º valor: ");
		x = leitor.nextInt();
		
		System.out.println("Informe o 2º valor: ");
		y = leitor.nextInt();
		
		//Cria a instância da classe matemática utilizando o construtor
		
		Matematica mat = new Matematica(x, y);
		
		// Imprime o resultado das operações através
		// de chamados aos métodos da classe matemática
		
		System.out.println("-------------------"); //Apenas para organizar a saída
		System.out.println("O valor da soma é: "+ mat.soma());
		System.out.println("O valor da subtração é:"+ mat.subtrai());
		System.out.println("O valor da Multiplicação é:"+ mat.multiplica());
		System.out.println("O valor da Divisão é: "+ mat.divide());
		System.out.println("-------------------");
	}
}
