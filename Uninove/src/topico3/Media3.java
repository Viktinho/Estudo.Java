package topico3;

import java.util.Scanner;

public class Media3 {

	public static void main(String args[]) {
		
		//Declarações
		Scanner teclado = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		
		//Leitura das notas
		System.out.println("Informe suas notas: ");
		
		//Nota1:
		System.out.println("\n\tNota1: ");
		nota1 = teclado.nextInt();
		
		//Nota2:
		System.out.println("\tNota2: ");
		nota2 = teclado.nextInt();
		
		//Nota3:
		System.out.println("\tNota3: ");
		nota3 = teclado.nextInt();
		
		//Calucula usando um método com retorno:
		media = calculaMedia(nota1, nota2, nota3);
		
		System.out.println("\n\tA média é: "+ media);
		
	}
	
	//O método estático (static) permite ser invocado sem a instância da classe:
	public static float calculaMedia(float n1, float n2, float n3) {
		
		float media;
		
		//Verifica as duas maiores e tira a média:
		if(n1 < n2 && n1 < n3) {
			media = (n2 + n3) / 2;
		}else if( n2 < n3) {
			media = (n1 + n3) / 2;
		}else {
			media = (n1 + n2) / 2;
		}
		return media;
	}
}
