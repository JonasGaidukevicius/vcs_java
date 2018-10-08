package lt.gaidukevicius;

import java.util.Scanner;

public class VartotojoSasaja {

	public static void main(String[] args) {
		Servisas servisas = new Servisas();
		Scanner input = new Scanner(System.in);
		
		//kuriamas picos aparatas
		System.out.print("Iveskite picos aparato pavadinima: ");
		String picosAparatoPavadinimas = input.nextLine();
		servisas.prideduPicosAparata(picosAparatoPavadinimas);
		
		//kuriu antra aparata
		System.out.print("Iveskite antro picos aparato pavadinima: ");
		picosAparatoPavadinimas = input.nextLine();
		servisas.prideduPicosAparata(picosAparatoPavadinimas);
		
		//atspausdinus visus picos aparatus
		servisas.atspausdinkPicosAparatuSarasa();
		
		//kuriamas picos receptas
		System.out.println("Iveskite picos pavadinima: ");
		String picPav = input.nextLine();
		System.out.println("Iveskite padu kieki: ");
		int pd = input.nextInt();
		System.out.println("Iveskite surio kieki: ");
		int sr = input.nextInt();
		System.out.println("Iveskite grybu kieki: ");
		int gr = input.nextInt();
		System.out.println("Iveskite kumpio kieki: ");
		int km = input.nextInt();
		System.out.println("Iveskite padazo kieki: ");
		int pz = input.nextInt();
		servisas.prideduPicosRecepta(picPav, pd, sr, gr, km, pz);
		servisas.atspausdinkPicuReceptus();
		
		
		System.out.println("Kokios picos noretumete (skaicius)? ");
		servisas.atspausdinkPicuReceptus();
		int pasirinkimas = input.nextInt();
		System.out.println("Kokio dydzio picos noretumete (1 - 3): ");
		int dydis = input.nextInt();
		servisas.picuAparatai.get(0).kepuPica(servisas.picuReceptai.get(pasirinkimas-1), dydis);
		
	}

}
