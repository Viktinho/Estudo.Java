package topico4;

public class Arrays {
	
	public static void main(String args[]) {
		
		//Declara��o do array de strings de tamanho 3
		
		String nomes[] = new String[3];
		
		//seta, manualmente, cada posi��o do array, de 0 a 2 (tr�s posi��es)
		nomes[0] = "Josefino";
		nomes[1] = "Josefina";
		nomes[2] = "Marcelinho";
		
		//E para acessar cada posi��o, podemos usar um la�o de 0 a 2 (0, 1, 2 e tr�s posi��es):
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("Na posi��o " + i + " do array, temos: ");
			System.out.println(nomes[i]);
		}
		
	}

}
