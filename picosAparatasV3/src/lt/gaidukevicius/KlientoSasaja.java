package lt.gaidukevicius;

import java.util.Scanner;

public class KlientoSasaja {

	public static void main(String[] args) {

		// pirmine inicializacija
		PicosProduktai produktuLikuciai = new PicosProduktai(10, 10, 10, 10, 10, 10);
		SurioPica surioPica = new SurioPica(1, 3, 0, 0, 0, 1);
		PicosAparatas picosAparatas1 = new PicosAparatas();
		// System.out.println("Surio picoje surio yra " + surioPica.getSuris());

		int pasirinkimas = -2, dydis = 0;
		while (true) {
			pasirinkimas = kokiaPicaRenkates(pasirinkimas);
			if (pasirinkimas == -1) {
				break;
			} else if (pasirinkimas == 0) {
				picosAparatas1.valauPicosAparata();
				pasirinkimas = -2;
			} else {
				dydis = kokioDydzioPica();
				System.out.println("Pasirinkta pica - " + pasirinkimas);
				System.out.println("Picos dydis - " + dydis);

				System.out.println(
						"Ar pagaminta pica ? - " + picosAparatas1.gaminuPica(pasirinkimas, dydis, produktuLikuciai));
				System.out.println("Liko padu - " + produktuLikuciai.getPadas());
				System.out.println("Liko grybu - " + produktuLikuciai.getGrybai());
				System.out.println("-----------------------------");
				pasirinkimas = -2;
			}

		}

	} // cia baigiasi MAIN

	public static int kokiaPicaRenkates(int pasirinkimas) {
		Scanner input = new Scanner(System.in);
		while (pasirinkimas < -1 || pasirinkimas > 3) {
			System.out.println("Kokios picos noretumete?");
			System.out.println(
					"Surio pica (1) | Grybu pica (2) | Kumpio pica (3) | Servisas (0) | Iseiti is programos (-1)");
			pasirinkimas = input.nextInt();
			if (pasirinkimas < -1 || pasirinkimas > 3) {
				System.out.println("Netinkamas pasirinkimas");
			}
		}
		// input.close();
		return pasirinkimas;

	}

	public static int kokioDydzioPica() {
		Scanner input = new Scanner(System.in);
		int dydis = 0;
		while (dydis < 1 || dydis > 3) {
			System.out.println("Kokio didzio pica?");
			System.out.println("Maza (1) | Vidutine (2) | Didele (3)");
			dydis = input.nextInt();
			if (dydis < 1 || dydis > 3) {
				System.out.println("Netinkamas pasirinkimas");
			}
		}
		// input.close();
		return dydis;
	}

	// Cia ateityje reikes tokio metodo, bet gal jis turetu buti servise?
	public static void inicializuojuPicosAparata() {

	}

	public static SurioPica inicializuojuSurioPica(int padas, int suris, int grybai, int kumpis, int desra,
			int padazas) {
		SurioPica surioPica = new SurioPica(padas, suris, grybai, kumpis, desra, padazas);
		return surioPica;
	}

	public static void gaminuPica(int pasirinkimas, int dydis) {
		// TODO Auto-generated method stub

	}

}
