package topico4;

import java.io.IOException;
import java.util.Scanner;

public class LeitorStringChar {
// atrav�s da cl�usula throws indicamos que n�o iremos tratar poss�veis erros na entrada de dados realizada
// atrav�s do m�todo "read" do pacote de classes System.in
	public static void main(String args[]) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		char sexo;
		
		System.out.println("Informe um nome:\n");
		nome = leitor.nextLine();
		
		System.out.printf("\nInforme o sexo (M/F):\n");
		sexo = (char)System.in.read();
		
		if ((sexo == 'M') || (sexo == 'm')) {
			System.out.printf("\nSeja bem-vindo Sr. %s.\n", nome);
		}else {
			System.out.printf("\nSeja bem-vinda Sra. %s\n", nome);
		}
		
	}

}
