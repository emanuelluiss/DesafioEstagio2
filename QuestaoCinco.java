
public class QuestaoCinco {

	public static void main(String[] args) {

		String frase = "T35t3 d3 35t4g1o";
		String novaFrase = "";

		for (int i = 0; i < frase.length(); i++) {
			boolean foiSubistituito = false;
			if (frase.charAt(i) == '3') {
				novaFrase = novaFrase + 'e';
				foiSubistituito = true;
			}
			if (frase.charAt(i) == '5') {
				novaFrase = novaFrase + 's';
				foiSubistituito = true;
			}
			if (frase.charAt(i) == '4') {
				novaFrase = novaFrase + 'a';
				foiSubistituito = true;
			}
			if (frase.charAt(i) == '1') {
				novaFrase = novaFrase + 'i';
				foiSubistituito = true;
			}

			if (foiSubistituito == false) {
				novaFrase = novaFrase + frase.charAt(i);
			}
		}
		System.out.println(novaFrase);
	}
}
