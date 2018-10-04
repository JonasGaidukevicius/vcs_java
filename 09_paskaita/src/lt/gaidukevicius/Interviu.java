package lt.gaidukevicius;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Interviu {

	public static void main(String[] args) {
		
		
		//1 uzduotis
		//Isskaidyti keturzenkli skaiciu i 4 vienzenklius
		System.out.println("--- 1 uzduotis---");
		int skaicius = 7135;
		int sk1, sk2, sk3, sk4;
		
		sk4 = skaicius % 10;
		sk3 = skaicius / 10 % 10;
		sk2 = skaicius / 100 % 10;
		sk1 = skaicius / 1000;
		
		System.out.println("sk1 yra " + sk1);
		System.out.println("sk2 yra " + sk2);
		System.out.println("sk3 yra " + sk3);
		System.out.println("sk4 yra " + sk4);
		
		//2 uzduotis (reiketu kitaip dar padaryti)
		System.out.println();
		System.out.println("--- 2 uzduotis---");
		List<Integer> skaiciai = new ArrayList<Integer>();
		Random rand = new Random();
		int ats = rand.nextInt(26) + 1;
		skaiciai.add(ats);
		for(int i = 1; i <= 14; i++) {
			ats = rand.nextInt(26) + 1;
			if(skaiciai.contains(ats)) {
				i--;
				continue;
			} else {
				skaiciai.add(ats);
			}
		}
		System.out.println("Skaiciai yra " + skaiciai);
		
		/*
		//3 uzduotis
		System.out.println();
		System.out.println("--- 3 uzduotis---");
		
		Scanner input = new Scanner(System.in);
		List<Integer> skaiciaiNaujas = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			System.out.print("Iveskite " + i + "-aji skaiciu: ");
			int a = input.nextInt();
			skaiciaiNaujas.add(a);
		}
		System.out.println(skaiciaiNaujas);
		int suma = 0;
		int count = 0;
		for(int j = 0; j < skaiciaiNaujas.size(); j++) {
			if(skaiciaiNaujas.get(j) % 2 == 0) {
				suma += skaiciaiNaujas.get(j);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Lyginiu skaiciu nera");
		} else {
			System.out.println("Lyginiu skaiciu vidurkis yra " + (suma / count));
		}
		
			
		//4 uzduotis
		System.out.println();
		System.out.println("--- 4 uzduotis---");
		List<Integer> skaiciai100 = new ArrayList<Integer>();
		Random randKitas = new Random();
		int sks = 1;
		for(int i = 1; i <= 100; i++) {
			while(sks % 4 != 0) {
				sks = rand.nextInt(1001) + 1;
			}
			skaiciai100.add(sks);
			sks = 1;
		}
		System.out.println("100 skaiciu, kurie dalinasi is 4: " + skaiciai100);
		System.out.println("Listo dydis - " + skaiciai100.size());
		
		
		//5 uzduotis
		System.out.println();
		System.out.println("--- 5 uzduotis---");
		
		System.out.print("Iveskite pirmaji skaiciu: ");
		int skPirmas = input.nextInt();
		int skAntras = 0;
		while(skAntras <= skPirmas) {
			System.out.print("Iveskite antraji skaiciu: ");
			skAntras = input.nextInt();
			if(skAntras <= skPirmas) {
				System.out.println("Antrasis skaicius turi buti didesnis uz pirmaji");
			}
		}
		System.out.println("Pirmas - " + skPirmas);
		System.out.println("Antras - " + skAntras);
		
		for(int i = skPirmas; i <= skAntras; i++) {
			System.out.print(i + " ");
			if(i % 3 == 0) {
				i++;
			}
		}
		*/
		
		/*
		//6 uzduotis
		System.out.println();
		System.out.println("--- 6 uzduotis---");
		Scanner ivesti = new Scanner(System.in);
		double bankas = 0.0;
		double ideta = 0.0;
		double moneta = 0.0;
		while (bankas < 5 || bankas > 10) {
			System.out.print("Iveskite pinigu suma nuo 5 iki 10: ");
			bankas = ivesti.nextDouble();
			if(bankas < 5 || bankas > 10) {
				System.out.println("Neteisinga pinigu suma!");
			}
		}
		System.out.println("Ivesta pinigu suma " + bankas);
		while(ideta < bankas) {
			while(moneta != 0.01 && moneta != 0.02 && moneta != 0.05 && moneta != 0.1 &&
					moneta != 0.2 && moneta != 0.5 && moneta != 1 && moneta != 2) {
				System.out.print("Idekite moneta (0.01, 0.02, 0.05, 0.10, 0.20, 0.50, 1, 2): ");
				moneta = ivesti.nextDouble();
				System.out.println("Moneta yra " + moneta);
				if(moneta != 0.01 && moneta != 0.02 && moneta != 0.05 && moneta != 0.1 &&
					moneta != 0.2 && moneta != 0.5 && moneta != 1 && moneta != 2) {
					System.out.println("Neteisinga moneta!");
				}
				
			}
			ideta += moneta;
			moneta = 0.0;
			System.out.print("Ideta ");
			System.out.printf("%.2f", ideta);
			if(ideta > bankas) {
				System.out.print(" Jusu graza ");
			    System.out.printf("%.2f", (ideta - bankas));
				break;
			} else if(ideta == bankas) {
				System.out.println(" Sumoketa visa suma. Aciu.");
			} else {	
				System.out.print(" Dar liko ");
				System.out.printf("%.2f", (bankas - ideta));
				System.out.println();
			}
			
		}*/
		
		
		//7 uzduotis
		System.out.println();
		System.out.println("--- 7 uzduotis---");
		int[] masyvas = {1,5,7,10};
		for(int i = 0; i < masyvas.length; i++) {
			for(int j = i + 1; j < masyvas.length; j++) {
				if((masyvas[i] + masyvas[j]) == 12) {
					System.out.println("12 gaunasi sudejus " + i + " ir " + j + " elementus");
				}
			}
		}
		
	}

}
