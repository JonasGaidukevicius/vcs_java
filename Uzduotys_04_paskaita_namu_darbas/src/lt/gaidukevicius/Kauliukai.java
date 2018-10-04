package lt.gaidukevicius;

import java.util.Random;
import java.util.Scanner;

public class Kauliukai {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int pinigai = 100, zaisti = 1, statymas = 0, kauliukas = 0, spejimas = 0;
		Random rand = new Random();
		
		while (zaisti == 1) {

			System.out.println("Jus turite " + pinigai + " pinigu.");
			System.out.println("1. Zaisti");
			System.out.println("2. Baigti zaidima");
			zaisti = reader.nextInt();

			switch (zaisti) {
			case 1:
				while (statymas < 5 || statymas > 20) {
					System.out.println("Koks Jusu statymas (nuo 5 iki 20)? ");
					statymas = reader.nextInt();
					if (statymas < 5 || statymas > 20) {
						System.out.println("Netinkama statymo suma");
					}
				}
				pinigai -= statymas;
				while (spejimas < 1 || spejimas > 6) {
					System.out.println("Koks Jusu spejimas (nuo 1 iki 6)? ");
					spejimas = reader.nextInt();
					if (spejimas < 1 || spejimas > 6) {
						System.out.println("Netinkamas spejimas");
					}
				}
				kauliukas = rand.nextInt(6) + 1;
				System.out.println("Iskrito kauliukas " + kauliukas);
				if (spejimas == kauliukas) {
					System.out.println("Sveikinu! Jus laimejote");
					System.out.println("Jusu laimejimas yra " + (statymas * 6));
					pinigai += statymas * 6;
					statymas = 0;
					spejimas = 0;
					// break;
				} else {
					System.out.println("Apgailestauju, bet Jus pralosete");
					statymas = 0;
					spejimas = 0;
					// break;
				}
				break;
			case 2:
				System.out.println("Aciu uz zaidima.");
				break;
			default:
				System.out.println("Neteisingas pasirinkimas");
				zaisti = 1;
				break;
			}
			if(pinigai < 5) {
				System.out.println("Jus neturite pakankamai pinigu tolimesniam zaidimui. Zaidimas baigtas.");
				zaisti = 2;
			}
		}
		reader.close();
	}
}
