package topico4;
import java.io.IOException;
import java.util.Scanner;

public class Vetor2 {

	public static void main(String args[]) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		
		String mes[] = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" };
		int tot[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		char escolha;
		
		System.out.println("O ano é bisexto?" + " 'S' para sim e 'N' para não");
		escolha = (char)System.in.read();
		
		
		for (int c = 0; c < mes.length; c++) {
			
			if(escolha == 'S') {
				tot[1] = 29;
			}			
			System.out.println("O mês de "+ mes[c]+ " tem " + tot[c] + " dias ao todo.");
		}
	}

}
