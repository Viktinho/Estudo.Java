package topico1;

public class Matematica {
	//Atributos locais
	
	int a, b;
	
	//Construtor da classe, que recebe dois valores (X e Y) e atribui
	//aos valores locais (a e b)
	
	public Matematica (int x , int y) {
		a = x;
		b = y;
	}
	
	//M�todo de soma
	public int soma() {
		return a + b;
	}
	//M�todo de subtra��o
	public int subtrai() {
		return a - b;
	}
	//M�todo de multiplica��o
	public int multiplica() {
		return a * b;
	}
	//M�todo de divis�o
	public int divide() {
		return a / b;
	}
}
