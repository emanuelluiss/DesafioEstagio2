import java.util.Scanner;

public class QuestaoTres {

	public static void main(String[] args) {

		System.out.println("Digite a primeira palavra:");
		Scanner scanner = new Scanner(System.in);
		String primeiraPalavra = scanner.nextLine();

		System.out.println("Digite a segunda palavra:");
		String segundaPalavra = scanner.nextLine();

		System.out.println("Digite a terceira palavra:");
		String terceiraPalavra = scanner.nextLine();
		scanner.close();

		System.out.println(
				"Todas as palavras juntas: " + primeiraPalavra + " " + segundaPalavra + " " + terceiraPalavra + ".");
	}
}
