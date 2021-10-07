import java.util.ArrayList;

public class Pessoas {

	ArrayList<Pessoa> universo = new ArrayList<Pessoa>();

	public Pessoas() {
		Pessoa pessoaUm = new Pessoa();
		pessoaUm.nome = "josé";
		pessoaUm.sobreNome = " da silva";
		pessoaUm.id = 1;
		pessoaUm.idade = 42;
		universo.add(pessoaUm);

		Pessoa pessoaDois = new Pessoa();
		pessoaDois.nome = "joão";
		pessoaDois.sobreNome = " gonçalves";
		pessoaDois.id = 2;
		pessoaDois.idade = 21;
		universo.add(pessoaDois);

		Pessoa pessoaTres = new Pessoa();
		pessoaTres.nome = "pedro";
		pessoaTres.sobreNome = " garcia";
		pessoaTres.id = 3;
		pessoaTres.idade = 28;
		universo.add(pessoaTres);

		Pessoa pessoaQuatro = new Pessoa();
		pessoaQuatro.nome = "matheus";
		pessoaQuatro.sobreNome = " pinheiro";
		pessoaQuatro.id = 4;
		pessoaQuatro.idade = 21;
		universo.add(pessoaQuatro);
	}

}
