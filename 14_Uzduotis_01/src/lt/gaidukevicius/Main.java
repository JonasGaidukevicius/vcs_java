package lt.gaidukevicius;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 uzduotis. a dalis
		// Vartotojas iveda 4 taskus ir reikia nustatyti ar taskai sudaro kvadrata
		
		//paskui as supratau, kad ne 3 krastines reikia lyginti, o reikia lyginti izambines!!!
		
		
		Scanner input = new Scanner(System.in);
		double taskas = 0;
		Keturkampis suvestasKeturkampis = new Keturkampis();
		System.out.print("Iveskite a tasko X koordinate: ");
		suvestasKeturkampis.setaTaskasXKoordinate(input.nextDouble());
		//System.out.prdoubleln(arKvadratas.getaTaskasXKoordinate());
		System.out.print("Iveskite a tasko Y koordinate: ");
		suvestasKeturkampis.setaTaskasYKoordinate(input.nextDouble());
		System.out.print("Iveskite b tasko X koordinate: ");
		suvestasKeturkampis.setbTaskasXKoordinate(input.nextDouble());
		System.out.print("Iveskite b tasko Y koordinate: ");
		suvestasKeturkampis.setbTaskasYKoordinate(input.nextDouble());
		System.out.print("Iveskite c tasko X koordinate: ");
		suvestasKeturkampis.setcTaskasXKoordinate(input.nextDouble());
		System.out.print("Iveskite c tasko Y koordinate: ");
		suvestasKeturkampis.setcTaskasYKoordinate(input.nextDouble());
		System.out.print("Iveskite d tasko X koordinate: ");
		suvestasKeturkampis.setdTaskasXKoordinate(input.nextDouble());
		System.out.print("Iveskite d tasko y koordinate: ");
		suvestasKeturkampis.setdTaskasYKoordinate(input.nextDouble());
		
		//patikrinti ar kvadratas?
		if(suvestasKeturkampis.arKvadratas(suvestasKeturkampis.getaTaskasXKoordinate(), suvestasKeturkampis.getaTaskasYKoordinate(), suvestasKeturkampis.getbTaskasXKoordinate(),
				suvestasKeturkampis.getbTaskasYKoordinate(), suvestasKeturkampis.getcTaskasXKoordinate(), suvestasKeturkampis.getcTaskasYKoordinate(),
				suvestasKeturkampis.getdTaskasXKoordinate(), suvestasKeturkampis.getdTaskasYKoordinate()) == true) {
			System.out.println("Ivesti taskai sudaro kvadrata");
		} else {
			System.out.println("Ivesti taskai kvadrato nesudaro");
		}
	}

	

	

}
