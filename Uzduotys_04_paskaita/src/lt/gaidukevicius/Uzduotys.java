package lt.gaidukevicius;

import java.util.Scanner;

public class Uzduotys {

	public static void main(String[] args) {
		// 02 uzduotis is 03 prezentacijos
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Iveskite skaiciu: ");
		int sk = input.nextInt();
		input.close();		
		switch (sk) {
		case 1:
			//System.out.println("Ivestas zinomas skaicius: " + sk);
			spausdinu(sk);
			break;
		case 2:
			//System.out.println("Ivestas zinomas skaicius: " + sk);
			spausdinu(sk);
			break;
		case 3: case 5:
			//System.out.println("Ivestas zinomas skaicius: " + sk);
			spausdinu(sk);
			break;
		default:
			System.out.println("Ivestas nezinomas skaicius");
		}
		*/
		
		/*
		//03 uzduotis
		Scanner iv = new Scanner(System.in);
		System.out.println("1. Iveskite 2 skaicius, kad juos sudeti.");
		System.out.println("2. Iveskite 2 skaicius, kad juos sudauginti.");
		System.out.println("3. Atspausdinti 256 skaiciaus kvadrata.");
		int sk1 = iv.nextInt();
		//iv.close();
		switch (sk1) {
		case 1:
			//Scanner skaiciai = new Scanner(System.in);
			System.out.println("Iveskite pirma skaiciu: ");
			int s1 = iv.nextInt();
			System.out.println("Iveskite antra skaiciu: ");
			int s2 = iv.nextInt();
			iv.close();
			System.out.println("Ivestu skaiciu suma yra " + (s1 + s2));
			break;
		case 2:
			//Scanner skaiciai1 = new Scanner(System.in);
			System.out.println("Iveskite pirma skaiciu: ");
			int s11 = iv.nextInt();
			System.out.println("Iveskite antra skaiciu: ");
			int s22 = iv.nextInt();
			iv.close();
			System.out.println("Ivestu skaiciu sandauga yra " + sandauga(s11, s22));
			break;
		case 3:
			System.out.println("256 kvadratu yra " + (256 * 256));
			break;
		default:
			System.out.println("Ivestas netinkamas meniu punktas");
		}
		*/
		/*
		// 03 uzduotis su ciklu be pabaigos
		Scanner iv = new Scanner(System.in);
		int meniu = -1;
		while (meniu != 0) {
			System.out.println("1. Iveskite 2 skaicius, kad juos sudeti.");
			System.out.println("2. Iveskite 2 skaicius, kad juos sudauginti.");
			System.out.println("3. Atspausdinti 256 skaiciaus kvadrata.");
			meniu = iv.nextInt();
			switch (meniu) {
			case 0:
				break;
			case 1:
				System.out.println("Iveskite pirma skaiciu: ");
				int s1 = iv.nextInt();
				System.out.println("Iveskite antra skaiciu: ");
				int s2 = iv.nextInt();
				System.out.println("Ivestu skaiciu suma yra " + (s1 + s2));
				break;
			case 2:
				System.out.println("Iveskite pirma skaiciu: ");
				int s11 = iv.nextInt();
				System.out.println("Iveskite antra skaiciu: ");
				int s22 = iv.nextInt();
				System.out.println("Ivestu skaiciu sandauga yra " + sandauga(s11, s22));
				break;
			case 3:
				System.out.println("256 kvadratu yra " + (256 * 256));
				break;
			default:
				System.out.println("Ivestas netinkamas meniu punktas");
			}
		}
		iv.close();
		*/
		
		//ciklas for each
		int[] masyvas = {2, 5, 9, 0, 4, 7};
		
		for(int q = 0; q < masyvas.length; q++) {
			System.out.print(masyvas[q] + " ");
		}
		System.out.println();
		
		//for each ciklas
		for(int nariai: masyvas) {
			System.out.print(nariai + " ");
		}
		
		//while ciklas
		System.out.println();
		int a = 5, b = 10;
		while(a < b) {
			System.out.println("aa");
			a++;
		}
		
		// do while ciklas
		
		System.out.println();
		a = 10;
		b = 10;
		do {
			System.out.println("Do atvejis");
			b--;
		} while (a < b);
				
	}
	
	private static int sandauga(int s11, int s22) {
		return s11 * s22;
	}

	//02 uzduotis
	static void spausdinu(int a) {
		System.out.println("Ivestas zinomas skaicius: " + a);
	}

}
