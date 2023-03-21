package esercizi;

import java.util.Scanner;

public class MainEs1 {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);

		int[] elementi = new int[3];
		try {
			for (int i = 0; i < elementi.length; i++) {
				System.out.println("Sto inserendo un numero casuale nell'array in " + (i + 1) + " posizione");
				int n = (int) (Math.random() * 10) + 1;
				elementi[i] = n;
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}

		// STAMPA ARRAY
		for (int i = 0; i < elementi.length; i++)
			System.out.println(elementi[i]);

		int conta = -1;
		try {
			while (conta != 0) {
				System.out.println("Inserisci in che posizione mettere il nuovo numero ( 0 per uscire)");
				conta = s.nextInt();
				Es1 es1 = new Es1(conta);
				int sceltaArray = conta - 1;
				if (conta > 0 && conta < elementi.length + 1) {
					// System.out.println("inserimento della posizione sbagliato");
					System.out.println("Inserisci nuovo numero da inserire");
					int num = s.nextInt();
					elementi[sceltaArray] = num;
				}
				else if (conta > elementi.length) {
					System.out.println("Hai inserito un numero sbagliato");
				}
			}
		} catch (Exception exc) {
			System.out.println(exc);
			System.out.println("Adesso stai uscendo e verrà visualizzato l'array");
		}

		for (int i = 0; i < elementi.length; i++)
			System.out.println(elementi[i]);

	}
}
