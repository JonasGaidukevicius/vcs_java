package lt.gaidukevicius;

import java.util.Scanner;

public class Uzduotys03N_toliau {

	public static void main(String[] args) {
		
		//1 uzduotis
		/*Scanner input = new Scanner(System.in);
		System.out.println("Iveskite skaiciu: ");
		int skaicius = input.nextInt();
		input.close();
		if(skaicius < 0) {
			System.out.println("Ivestas skaicius yra neigiamas");
		} else if(skaicius == 0) {
			System.out.println("Ivestas skaicius lygus nuliui");
		} else {
			System.out.println("Ivestas skaicius yra teigiamas");
		}*/
		
		//2 uzduotis
		/*Scanner ivesti = new Scanner(System.in);
		System.out.print("Iveskite zmogaus amziu: ");
		int amzius = ivesti.nextInt();
		ivesti.close();
		if(amzius < 0 || amzius > 100) {
			System.out.print("Ivestas amzius yra neteisingas");
		} else if (amzius < 18) {
			System.out.print("Zmogus balsuoti negali");
		} else {
			System.out.print("Zmogus gali balsuoti");
		}*/
		
		//3 uzduotis
		Scanner iv = new Scanner(System.in);
		System.out.println("Iveskite skaiciu: ");
		int skaicius = iv.nextInt();
		iv.close();
		if (skaicius < 0) {
			System.out.println("Skaicius yra neigiamas");
		} else if(skaicius > 100) {
			System.out.println("Skaicius yra didesnis uz 100");
		} else if(skaicius >= 40 && skaicius <= 60) {
			System.out.println("Skaicius yra tarp 40 ir 60");
		} else {
			System.out.println("Visi kiti atvejai");
		}
	}

}
