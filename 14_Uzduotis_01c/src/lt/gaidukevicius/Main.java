package lt.gaidukevicius;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 uzduotis. a dalis
		// Vartotojas iveda 4 taskus ir reikia nustatyti ar taskai sudaro kvadrata
		
		Scanner input = new Scanner(System.in);
		double taskas = 0;
		Taskas aTaskas = new Taskas();
		Taskas bTaskas = new Taskas();
		Taskas cTaskas = new Taskas();
		Taskas dTaskas = new Taskas();
		System.out.print("Iveskite keturkampio a tasko X koordinate: ");
		aTaskas.setxKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio a tasko Y koordinate: ");
		aTaskas.setyKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio b tasko X koordinate: ");
		bTaskas.setxKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio b tasko Y koordinate: ");
		bTaskas.setyKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio c tasko X koordinate: ");
		cTaskas.setxKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio c tasko Y koordinate: ");
		cTaskas.setyKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio d tasko X koordinate: ");
		dTaskas.setxKoordinate(input.nextDouble());
		System.out.print("Iveskite keturkampio d tasko y koordinate: ");
		dTaskas.setyKoordinate(input.nextDouble());
		
		//patikrinti ar kvadratas?
		
		if(aTaskas.arKvadratas(aTaskas, bTaskas, cTaskas, dTaskas) == true){
			System.out.println("Ivesti taskai sudaro kvadrata");
			
			Taskas eTaskas = new Taskas();
			Taskas fTaskas = new Taskas();
			System.out.print("Iveskite atkarpos e tasko X koordinate: ");
			eTaskas.setxKoordinate(input.nextDouble());
			System.out.print("Iveskite atkarpos e tasko Y koordinate: ");
			eTaskas.setyKoordinate(input.nextDouble());
			System.out.print("Iveskite atkarpos f tasko X koordinate: ");
			fTaskas.setxKoordinate(input.nextDouble());
			System.out.print("Iveskite atkarpos f tasko Y koordinate: ");
			fTaskas.setyKoordinate(input.nextDouble());
			
			//patikrinti ar atkarpa kerta kvadrata
			aTaskas.arKerta(aTaskas, bTaskas, cTaskas, dTaskas, eTaskas, fTaskas);
			
			
		} else {
			System.out.println("Ivesti taskai kvadrato nesudaro");
		}
		
		/*
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
		}*/
	
	
	}

	

	

	

}
