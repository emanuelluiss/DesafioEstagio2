import java.util.ArrayList;

public class QuestaoOito {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new Pessoas().universo;

		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa pessoaNoArray = pessoas.get(i);
			String nomeComPrimeiraMaiuscula = "";
			pessoaNoArray.nome = ("" + pessoaNoArray.nome.charAt(0)).toUpperCase() + pessoaNoArray.nome.substring(1);

			for (int j = 0; j < pessoaNoArray.nome.length(); j++) {
				nomeComPrimeiraMaiuscula = nomeComPrimeiraMaiuscula + pessoaNoArray.nome.charAt(j);
				if (j == 0) {
					nomeComPrimeiraMaiuscula = nomeComPrimeiraMaiuscula.toUpperCase();
				}
			}
			System.out.println("Olá, " + pessoaNoArray.nome + pessoaNoArray.sobreNome);
		}

	}

}
