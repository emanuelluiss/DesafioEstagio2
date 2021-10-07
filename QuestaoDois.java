import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		/*
		 * Exemplo usando método reverse System.out.println("Digite seu nome:"); Scanner
		 * scanner = new Scanner(System.in); String nomePessoa = scanner.nextLine();
		 * scanner.close();
		 * 
		 * System.out.println(new StringBuilder(nomePessoa).reverse().toString());
		 */

		System.out.println("Digite seu nome:");
		Scanner scanner = new Scanner(System.in);
		String nomePessoa = scanner.nextLine();
		scanner.close();
		String reverso = "";
		for (int b = nomePessoa.length() - 1; b >= 0; b--) {
			reverso += String.valueOf(nomePessoa.charAt(b));

		}
		System.out.println(reverso);

	}

}
