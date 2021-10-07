
public class QuestaoQuatro {

	public static void main(String[] args) {
		String teste = "Teste 1 de 2 string 3";
		String nova = "";
		String subtituicao = "[removido]";

		for (int i = 0; i < teste.length(); i++) {
			if (teste.charAt(i) == '1' || teste.charAt(i) == '2' || teste.charAt(i) == '3')
				nova = nova + subtituicao;
			else {
				nova = nova + teste.charAt(i);
			}
		}
		System.out.println(nova);
	}

}
