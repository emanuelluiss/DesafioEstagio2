import java.util.ArrayList;

public class QuestaoDez {

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new Pessoas().universo;
		ArrayList<Pessoa> pessoasMenoresQue26 = new ArrayList<Pessoa>();

		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa pessoaDoArray = pessoas.get(i);
			if (pessoaDoArray.idade < 26) {
				pessoasMenoresQue26.add(pessoaDoArray);
			}
		}

		for (Pessoa pessoa : pessoasMenoresQue26) {
			System.out.println(pessoa);
		}
	}

}
