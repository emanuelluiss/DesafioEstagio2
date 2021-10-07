
public class QuestaoSete {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1;
		String s = ", ";
		System.out.print(n1 + s);
		System.out.print(n2 + s);

		for (int i = 0; i < 12; i++) {
			n2 = n2 + n1;
			n1 = n2 - n1;
			System.out.print(n2 + s);
		}
	}

}
