package lt.gaidukevicius;

import java.util.Scanner;

public class KlientoSasaja {

	public static void main(String[] args) {
		
		//pirmine inicializacija
		PicosProduktai produktuLikuciai = new PicosProduktai(200, 200, 200, 200, 200, 200);
		SurioPica surioPica = inicializuojuSurioPica(1, 3, 0, 0, 0, 1);
		System.out.println(surioPica);
		
		inicializuojuPicosAparata();
		
		int pasirinkimas = 0, dydis = 0;
		pasirinkimas = kokiaPicaRenkates();
		dydis = kokioDydzioPica();
		System.out.println("Pasirinkta pica - " + pasirinkimas);
		System.out.println("Picos dydis - " + dydis);
		
	}
	
	

	



	







	public static int kokiaPicaRenkates() {
		Scanner input = new Scanner(System.in);
		int pasirinkimas = -2;
		while (pasirinkimas < -1 || pasirinkimas > 3) {
			System.out.println("Kokios picos noretumete?");
			System.out.println("Surio pica (1) | Grybu pica (2) | Kumpio pica (3) | Servisas (0) | Iseiti is programos (-1)");
			pasirinkimas = input.nextInt();
			if(pasirinkimas < -1 || pasirinkimas > 3) {
				System.out.println("Netinkamas pasirinkimas");
			}
		}
		//input.close();
		return pasirinkimas;
		
	}
	
	public static int kokioDydzioPica() {
		Scanner input = new Scanner(System.in);
		int dydis = 0;
		while (dydis < 1 || dydis > 3) {
			System.out.println("Kokio didzio pica?");
			System.out.println("Maza (1) | Vidutine (2) | Didele (3)");
			dydis = input.nextInt();
			if(dydis < 1 || dydis > 3) {
				System.out.println("Netinkamas pasirinkimas");
			}
		}
		input.close();
		return dydis;
	}
	
	public static void inicializuojuPicosAparata() {
		Pica surioPica = new Pica();
		surioPica.produktai.getPadazas();
		
	}
	
	public static SurioPica inicializuojuSurioPica(int padas, int suris, int grybai, int kumpis, int desra, int padazas) {
		SurioPica surioPica = new SurioPica(padas, suris, grybai, kumpis, desra, padazas);
		return surioPica;
	}

}
