import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {
		System.out.println("Digite a primeira palavra:");
		Scanner scanner = new Scanner(System.in);
		String primeiraPalavra = scanner.nextLine();

		System.out.println("Digite a segunda palavra:");
		String segundaPalavra = scanner.nextLine();
		scanner.close();

		boolean primeiraMaior = primeiraPalavra.length() > segundaPalavra.length();
		boolean segundaMaior = primeiraPalavra.length() < segundaPalavra.length();
		boolean mesmoTamanho = primeiraPalavra.length() == segundaPalavra.length();

		if (primeiraMaior) {
			System.out.println("Maior palavra é: " + primeiraPalavra);
		} else if (segundaMaior) {
			System.out.println("Maior palavra é: " + segundaPalavra);

		} else if (mesmoTamanho) {
			System.out.println("Palavras são do mesmo tamanho.");
		}

	}

}
