package esercizi;

import java.util.Scanner;

public class Es2 {

	static Scanner s = new Scanner(System.in);

	int l, km;

	public Es2(int l, int km) throws Exception {
		this.l = l;
		this.km = km;
	}

	public static void calcolaConsumo(int l, int km) throws Exception {

		int kmALl = 0;
		if (l < 0) {
			throw new RuntimeException("Hai inserito numero negativo di litri");
		}
		if (km < 0) {
			throw new RuntimeException("Hai inserito numero negativo di km");
		}
		kmALl = km / l;
		System.out.println("Chilometri al litro fatti :" + kmALl);

	}
}