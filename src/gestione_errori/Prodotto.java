package gestione_errori;

public class Prodotto {

	String nome;
	int qnt;

	public Prodotto(String n, int q) throws Exception {
		this.nome = n;

		if (n == "") {
			throw new Exception("Nome non valido");
		}
		if (q < 0) {
			throw new RuntimeException("Qnt non accettato");
		}
		this.qnt = q;
		this.nome = n;
	}
}