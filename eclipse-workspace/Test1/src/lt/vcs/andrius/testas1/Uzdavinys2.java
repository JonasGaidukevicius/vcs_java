package lt.vcs.andrius.testas1;

public class Uzdavinys2 {

	public static void spausdinkSpalva(String spalva) {
		switch (spalva) {
		case "baltas":
			System.out.println("Snaige");
		default:
			System.out.println("Vanduo");
		case "raudonas":
			System.out.println("Braske");
			break;
		}
	}

	public static void main(String argv[]) {

		String[] m = { "raudonas", "zalias", "melynas", "baltas" };

		int sk = 2 * (2 / 3) + 2 % 4;
		// 2 3 4 5

		String spalva = m[sk++];
		//"melynas"

		spausdinkSpalva(spalva + "");
		spausdinkSpalva(m[sk++]); // "baltas"
		spausdinkSpalva(m[sk++]);

	}
}
