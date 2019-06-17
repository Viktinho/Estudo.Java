package topico2;

//Importa a classe Scanner para ser utilizada aqui:
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String args[]) {

		// Declaração do scanner;
		Scanner leitor = new Scanner(System.in);

		// Declração das variáveis que serão utilizadas:
		float peso, altura, imc;

		// Leitura do teclado:
		// Informação de instruções para o usuário:
		System.out.println("Informe seu peso: ");

		// Lê e armazena o valor do peso:
		peso = leitor.nextFloat(); // Lê um valor do tipo ponto flutuante

		// Lê e armazena o valor da altura:
		System.out.println("Informe sua altura: ");
		altura = leitor.nextFloat();// Lê um valor do tipo ponto flutuante

		// Calcula:
		imc = peso / (altura * altura);

		// Imprime o resultado
		// Note que pode-se concatenar o resultado com a impressão de texto
		System.out.println("\n\tO IMC desta pessoa é:  " + imc + "\n\n");

	}

}
