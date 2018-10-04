package lt.gaidukevicius;

import java.util.Scanner;

public class Dvigubi {

	public static void main(String[] args) {
		// 2018.08.21 6 paskaita
		//Dvigubu ciklu uzduotys
		
		//1 uzduotis
		Scanner input = new Scanner(System.in);
		System.out.println("---1 uzduotis---");
		System.out.print("Iveskite eiluciu skaiciu: ");
		int param1 = input.nextInt();
		System.out.print("Iveskite stulpeliu skaicius: ");
		int param2 = input.nextInt();
		staciakampis(param1, param2);
		
		//2 uzduotis
		System.out.println("---2 uzduotis---");
		System.out.print("Iveskite eiluciu skaiciu: ");
		int eil = input.nextInt();
		System.out.print("Iveskite stulpeliu skaicius: ");
		int stul = input.nextInt();
		staciakampisKitoks(eil, stul);
		
		//3 uzduotis - Daugybos lentele
		System.out.println("---3 uzduotis---");
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
				//System.out.format(%s, (i * j));
			}
			System.out.println();
		}
						
	}

	//1 uzduoties metodas
	private static void staciakampis(int param1, int param2) {
		for(int i = 1; i <= param1; i++) {
			for(int j = 1; j <= param2; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	//2 uzduoties metodas
	private static void staciakampisKitoks(int eil, int stul) {
		for(int i = 1; i <= eil; i++) {
			if(i % 2 == 0) {
				System.out.print(" "); 
			}
			for(int j = 1; j <= stul; j++) {
				
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
