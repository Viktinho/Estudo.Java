package topico3;

public class La�oRepeti��oWhile2 {

	public static void main(String args[]) {

		int cc = 1;
		while (cc <= 10) {
			cc++;
			if (cc == 5 || cc == 7 || cc == 9) {
				continue;
			}
			System.out.println("Cambalhota " + cc);
		}
	}

}
