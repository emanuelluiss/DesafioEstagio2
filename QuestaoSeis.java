import java.util.Scanner;

public class QuestaoSeis {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int tamanho = 10;
		String nomes[] = new String[tamanho];
		int i = 0;
		boolean achou = false;

		for (i = 0; i < tamanho; i++) {
			System.out.println("Digite o " + (i + 1) + " nome:");
			nomes[i] = ler.nextLine();
		}

		System.out.println("Digite o nome que você queira buscar::");
		String buscarNomes = ler.nextLine();

		for (i = 0; i < tamanho; i++) {
			if (buscarNomes.equals(nomes[i])) {
				achou = true;
			}

		}
		if (achou == false) {
			System.out.println("NÃO ACHEI");
		} else {
			System.out.println("ACHEI");
		}

	}

}
