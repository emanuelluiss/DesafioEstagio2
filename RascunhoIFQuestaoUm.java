import java.util.Scanner;

public class RascunhoIFQuestaoUm {
	public static void main(String[] args) {

		System.out.println("Digite a primeira palavra:");
		Scanner scanner = new Scanner(System.in);
		String primeiraPalavra = scanner.nextLine();

		System.out.println("Digite a segunda palavra:");
		String segundaPalavra = scanner.nextLine();
		scanner.close();

		boolean primeiraPalavraMaiorQueSegunda = primeiraPalavra.length() > segundaPalavra.length();
		boolean segundaPalavraMaiorQuePrimeira = primeiraPalavra.length() < segundaPalavra.length();
		boolean palavrasSaoDoMesmoTamanho = primeiraPalavra.length() == segundaPalavra.length();
		boolean quandoSegundaPalavraForMaior = !primeiraPalavraMaiorQueSegunda && segundaPalavraMaiorQuePrimeira;
		if (!primeiraPalavraMaiorQueSegunda) {
			System.out.println("xxx");
		}
		// IF ELSE IF

		if (primeiraPalavraMaiorQueSegunda) {
			System.out.println("xxx");
		} else if (segundaPalavraMaiorQuePrimeira) {
			System.out.println("Segunda palavra � a maior 1");
		}

//IF = Se
//ELSE = SENAO
		if (primeiraPalavraMaiorQueSegunda) {
			System.out.println("Primeira palavra � a maior: ");
		} else if (segundaPalavraMaiorQuePrimeira) {
			System.out.println("Segunda palavra � a maior: 2");
		} else {
			System.out.println("Palavras s�o do mesmo tamanho!");
		}

		/*
		 * if(quandoAsPalavrasSaoDoMesmoTamanho) {
		 * System.out.println("Palavras s�o do mesmo tamanho!"); }
		 */
		if (primeiraPalavraMaiorQueSegunda) {
			System.out.println("Primeira palavra � a maior: ");
		}

		if (segundaPalavraMaiorQuePrimeira) {
			System.out.println("Segunda palavra � a maior: 3");

		}
		if (palavrasSaoDoMesmoTamanho) {
			System.out.println("Palavras s�o do mesmo tamanho!");
		}
		if (quandoSegundaPalavraForMaior) {
			System.out.println("Segunda palavra � a maior: 4");
		}
	}
}
