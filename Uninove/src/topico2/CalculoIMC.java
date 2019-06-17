package topico2;

//Importa a classe Scanner para ser utilizada aqui:
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String args[]) {

		// Declara��o do scanner;
		Scanner leitor = new Scanner(System.in);

		// Declra��o das vari�veis que ser�o utilizadas:
		float peso, altura, imc;

		// Leitura do teclado:
		// Informa��o de instru��es para o usu�rio:
		System.out.println("Informe seu peso: ");

		// L� e armazena o valor do peso:
		peso = leitor.nextFloat(); // L� um valor do tipo ponto flutuante

		// L� e armazena o valor da altura:
		System.out.println("Informe sua altura: ");
		altura = leitor.nextFloat();// L� um valor do tipo ponto flutuante

		// Calcula:
		imc = peso / (altura * altura);

		// Imprime o resultado
		// Note que pode-se concatenar o resultado com a impress�o de texto
		System.out.println("\n\tO IMC desta pessoa �:  " + imc + "\n\n");

	}

}
