package esercizi;

import java.util.Scanner;

public class MainEs2 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		kmALl();
	}

	public static void kmALl() throws Exception {
		int l = 0;
		int km = 0;
		try {
			System.out.println("Inserisci i chilometri fatti");
			km = s.nextInt();
			Es2.calcolaConsumo(l, km);
			System.out.println("Inserisci i litri consumati");
			l = s.nextInt();
			Es2.calcolaConsumo(l, km);
			} catch (Exception exc) {
				System.out.println(exc);
			}
		}
	}

