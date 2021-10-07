import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuestaoDoze {

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoasSemOrdenacaoNaIdade = new Pessoas().universo;

		Collections.sort(pessoasSemOrdenacaoNaIdade, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa proximo, Pessoa anterior) {
				if (proximo.idade > anterior.idade) {
					return -1;
				} else if (proximo.idade == anterior.idade) {
					return proximo.id < anterior.id ? +1 : -1;
				}
				return 0;
			}
		});
		System.out.println(pessoasSemOrdenacaoNaIdade);
	}

}
