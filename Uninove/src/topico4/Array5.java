package topico4;

public class Array5 {

	public static void main(String args[]) {

		String nomesCompletos[][] = new String[3][3];

		// Pessoa 1:
		nomesCompletos[0][0] = "Josefino"; // Primeira linha, primeira coluna
		nomesCompletos[0][1] = " dos Paranaue Bahiano"; // Primeira linha, segunda coluna

		// Pessoa 2:
		nomesCompletos[1][0] = "Josefina"; // Segunda linha, primeira coluna
		nomesCompletos[1][1] = " Amado Batista"; // Segunda linha, segunda coluna

		// Pessoa 3:
		nomesCompletos[2][0] = "Marcelinho"; // Terceira linha, primeira coluna
		nomesCompletos[2][1] = " Supimpa Supimposo"; // Terceira linha, segunda coluna

		// Impressão dos nomes com os sobrenomes:

		for (int i = 0; i <= 2; i++) {
			System.out.print("Nome armazenado na linha " + i + ": ");
			// Pega a posição i (linha), a coluna do nome (0) e concatena com a coluna do
			// sobrenome (1)
			System.out.println(nomesCompletos[1][0] + nomesCompletos[i][1]);
		}

	}

}
