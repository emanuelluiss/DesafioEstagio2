import java.util.ArrayList;

public class QuestaoNove {

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new Pessoas().universo;

		int somaDasIdades = 0;

		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa pessoa = pessoas.get(i);
			somaDasIdades = somaDasIdades + pessoa.idade;

		}
		System.out.println("A soma das idade é: " + somaDasIdades);
	}
}
