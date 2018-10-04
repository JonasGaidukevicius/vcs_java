package lt.gaidukevicius;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 uzduotis. a dalis
		// Vartotojas iveda 4 taskus ir reikia nustatyti ar taskai sudaro kvadrata
		
		//o paskui dar pagalvojau, kad reikia klase taskas kurti, o ne keturkampis
		//ir pasinaudoti zodeliou "this"
		
		Scanner input = new Scanner(System.in);
		double taskas = 0;
		Keturkampis suvestasKeturkampis = new Keturkampis();
		System.out.print("Iveskite keturkampio a tasko X koordinate: ");
		suvestasKeturkampis.setaTaskasXKoordinate(input.nextDouble());
		//System.out.prdoubleln(arKvadratas.getaTaskasXKoordinate());
		System.out.print("Iveskite keturkampio a tasko Y koordinate: ");
		suvestasKeturkampis.setaTaskasYKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio b tasko X koordinate: ");
		suvestasKeturkampis.setbTaskasXKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio b tasko Y koordinate: ");
		suvestasKeturkampis.setbTaskasYKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio c tasko X koordinate: ");
		suvestasKeturkampis.setcTaskasXKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio c tasko Y koordinate: ");
		suvestasKeturkampis.setcTaskasYKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio d tasko X koordinate: ");
		suvestasKeturkampis.setdTaskasXKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio d tasko y koordinate: ");
		suvestasKeturkampis.setdTaskasYKoordinate(input.nextDouble());
		
		//patikrinti ar kvadratas?
		
		
		
		
		if(suvestasKeturkampis.arKvadratas(suvestasKeturkampis.getaTaskasXKoordinate(), suvestasKeturkampis.getaTaskasYKoordinate(), suvestasKeturkampis.getbTaskasXKoordinate(),
				suvestasKeturkampis.getbTaskasYKoordinate(), suvestasKeturkampis.getcTaskasXKoordinate(), suvestasKeturkampis.getcTaskasYKoordinate(),
				suvestasKeturkampis.getdTaskasXKoordinate(), suvestasKeturkampis.getdTaskasYKoordinate()) == true) {
			System.out.println("Ivesti taskai sudaro kvadrata");
			
			Atkarpa ivestaAtkarpa = new Atkarpa();
			System.out.print("Iveskite atkarpos e tasko X koordinate: ");
			ivestaAtkarpa.seteTaskasXKoordinate(input.nextDouble());
			System.out.print("Iveskite atkarpos e tasko Y koordinate: ");
			ivestaAtkarpa.seteTaskasYKoordinate(input.nextDouble());
			System.out.print("Iveskite atkarpos f tasko X koordinate: ");
			ivestaAtkarpa.setfTaskasXKoordinate(input.nextDouble());
			System.out.print("Iveskite atkarpos f tasko Y koordinate: ");
			ivestaAtkarpa.setfTaskasYKoordinate(input.nextDouble());
		} else {
			System.out.println("Ivesti taskai kvadrato nesudaro");
		}
	}

	

	

}
