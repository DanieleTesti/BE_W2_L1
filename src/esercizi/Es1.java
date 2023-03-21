package esercizi;

public class Es1 {

	int n;

	public Es1(int n) throws Exception {
		this.n = n;

		if (n < 0)
	{
		throw new RuntimeException("Hai inserito numero negativo, COJONE");
	}
}
}
