package lt.gaidukevicius;

public class Testo_02_uzduotis {

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

			String spalva = m[sk++];

			spausdinkSpalva(spalva + "");
			spausdinkSpalva(m[sk++]);
			spausdinkSpalva(m[sk++]);

		}
		
}
