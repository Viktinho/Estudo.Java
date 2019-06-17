package packageArrayList;

import java.util.ArrayList;

import topico4.Pessoa2;


public class ArrayList1 {

	public static void main(String args[]) {
		
		//Criando a lista do tipo pessoa
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		
		//Cria um objeto de "Pessoa" para podermos adiciona-lo a lista
		Pessoa pessoaLocal = new Pessoa();
		
		pessoaLocal.nome = "Sonic";
		pessoaLocal.idade = 200;
		pessoaLocal.email = "sonic@uninove.edu.br";
		
		//Adiciona a pessoa a lista:
		listaPessoas.add(pessoaLocal);
		
		//J� que a pessoa criada j� foi acrescentada � lista, podemos reaproveitar a vari�vel local para acrescentar outra pessoa:
		pessoaLocal = new Pessoa(); //"reseta" a vari�vel para poder ser reutilizada
		pessoaLocal.nome = "Lara Croft";
		pessoaLocal.idade = 21;
		pessoaLocal.email = "laracroftJava@uninove.edu.br";
		
		//Acrescenta:
		listaPessoas.add(pessoaLocal);
		
		//Mais uma pessoa
		pessoaLocal = new Pessoa(); //"reseta" a vari�vel a ser reutilizada
		pessoaLocal.nome = "Mario Bross";
		pessoaLocal.idade = 180;
		pessoaLocal.email = "donkeykongnaomepega@uninove.edu.br";
		
		//acrescenta:
		listaPessoas.add(pessoaLocal);
		
		
	}
	
}
