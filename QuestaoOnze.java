import java.util.ArrayList;

public class QuestaoOnze {

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new Pessoas().universo;
		ArrayList<Pessoa> pessoasMenoresQue30 = new ArrayList<Pessoa>();

		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa pessoaDoArray = pessoas.get(i);
			if (pessoaDoArray.idade < 30) {
				pessoasMenoresQue30.add(pessoaDoArray);
			}
		}

		for (Pessoa pessoa : pessoasMenoresQue30) {
			System.out.println(pessoa);
		}

	}

}
