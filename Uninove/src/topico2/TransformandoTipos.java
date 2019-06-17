package topico2;

public class TransformandoTipos {
	
	public static void main (String args[]) {
		float X = 10;
		int Y = (int) X;
		System.out.println("O valor de X é: "+ X);
		System.out.println("O valor de Y é: "+ Y);
		
		System.out.println("\n");
		
		float A = 20.5F;
		int B = (int) A; // Neste caso o B valerá 20
		System.out.println("O valor de A é: "+ A);
		System.out.println("O valor de B é: "+ B);
	}

}
