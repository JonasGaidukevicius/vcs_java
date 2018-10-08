package lt.gaidukevicius;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		SurioPicosAparatas surioPica = new SurioPicosAparatas();
		GrybuPicosAparatas grybuPica = new GrybuPicosAparatas();
		KumpioPicosAparatas kumpioPica = new KumpioPicosAparatas();
		int variantas = kokiaPica();
		System.out.println("Picos variantas yra " + variantas);
		//Cia turi buti tikrinimas ar buvo ivesta 4, kas yra servisas
		int dydis = 0;
		if(variantas != 4 ) {
			dydis = koksDydis();
		}
		System.out.println("Picos dydis yra " + dydis);
		System.out.println("Surio picos ingridientu yra: padu - " + surioPica.getPadas() + ", surio - " + surioPica.getSuris() + ", padazo - " + surioPica.getPadazas());
		
		switch (variantas){
			case 1:
				System.out.println(surioPica.arYraProduktu(dydis));
				if(surioPica.arYraProduktu(dydis)) {
					surioPica.padarykSurioPica(dydis);
				}
				break;
			case 2:
				System.out.println(grybuPica.arYraProduktu(dydis));
				break;
			case 3:
				System.out.println(kumpioPica.arYraProduktu(dydis));
				break;
			case 4:
				//serviso procedura
				System.out.println("Cia vykdomas servisas");
				break;
		}
		System.out.println("Po switch:");
		System.out.println("Surio picos ingridientu yra: padu - " + surioPica.getPadas() + ", surio -" + surioPica.getSuris() + ", padazo - " + surioPica.getPadazas());

	}

	// picos rusies pasirinkimas
	public static int kokiaPica() {
		Scanner input = new Scanner(System.in);
		int pasirinkimas = -1;
		while (pasirinkimas < 1 || pasirinkimas > 4) {
			System.out.println("Kokios picos pageidaujate?");
			System.out.println("1 - Surio | 2 - Grybu | 3 - Kumpio:");
			pasirinkimas = input.nextInt();
		}
		return pasirinkimas;
	}

	// picos dydzio pasirinkimas
	private static int koksDydis() {
		Scanner input = new Scanner(System.in);
		int dydis = -1;
		while (dydis < 1 || dydis > 3) {
			System.out.println("Kokio dydzio picos pageidaujate?");
			System.out.println("1 - Maza | 2 - Vidutine | 3 - Didele");
			dydis = input.nextInt();
		}
		return dydis;
	}

}
