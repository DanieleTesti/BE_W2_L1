package gestione_errori;

import java.util.Scanner;

public class Runnable {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		String n = askNome();
		int q = askQnt();
		try {
			Prodotto p = new Prodotto(n, q);
		} catch (Exception exc) {
			System.out.println(exc);
			askQnt();
		} finally {
			System.out.println("Prodotto creato");
		}

	}

	public static String askNome() {
		System.out.println("Inserire il nome prodotto");
		String n = s.nextLine();
		return n;
	}

	public static int askQnt() {
		int q = -1;
		System.out.println("Inserire quantita  prodotto");
		q = s.nextInt();
		return q;
	}
}
