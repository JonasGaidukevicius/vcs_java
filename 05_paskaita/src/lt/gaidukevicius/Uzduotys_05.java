package lt.gaidukevicius;

import java.util.Scanner;

public class Uzduotys_05 {

	public static void main(String[] args) {
	//Kastinimas 2018.08.20
	
		//1 uzduotis
		lyginisNelyginis(4);	
		
		//2 uzduotis
		paskutinisSkaitmuo(1234);
		
		//3 uzduotis
		keliazenklis(1970);
		
		//2018.08.21 6 paskaita
		//4 uzduotis
		
		daliklis(3, 5);
		
		//5 uzduotis
		atvirksciai(158777);
		
		//6 uzduotis
		minuciuKonvertavimas(3700);
		
		//Dabar CAST uzduotys
		//1 uzduotis
		System.out.println("---1 CAST uzduotis----");
		Scanner input = new Scanner(System.in);
		System.out.println("Iveskite 2 skaicius:");
		int sk1 = input.nextInt();
		int sk2 = input.nextInt();
		double rez = (double) sk1 / (double) sk2;
		System.out.println("Rezultatas yra " + rez);
		
		//2 uzduotis
		System.out.println("---2 CAST uzduotis-----");
		System.out.println("Iveskite skaiciu kieki n: ");
		int n = input.nextInt(); //galima isiversti ir be sio kintamojo, nes vidurkio paskaiciavimui galime naudoti masyvo ilgio dydi
		int[] skaiciai = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Iveskite " + (i+1) + "-a skaiciu:");
			skaiciai[i] = input.nextInt();
		}
		System.out.println("Ivestu skaiciu suma yra " + suma(skaiciai));
		vidurkis(skaiciai, n);
		sandauga(skaiciai);
		
		//3 CAST uzduotis
		System.out.println("---3 CAST uzduotis-----");
		System.out.print("Iveskite 1-centimetrai, 2-coliai: ");
		int tipas = input.nextInt();
		System.out.print("Iveskite ilgi: ");
		int ilgis = input.nextInt();
		if(tipas == 1) {
			centimetraiIColius(tipas, ilgis);
		} else {
			coliaiICentimetrus(tipas, ilgis);
		}
		
	}
	
	

	//3 CAST uzduotis     2 metodai
	private static void centimetraiIColius(int tipas, int ilgis) {
		System.out.println(ilgis + " centimetru yra " + ((double) ilgis / 2.54) + " coliu");
		
	}
	
	private static void coliaiICentimetrus(int tipas, int ilgis) {
		System.out.println(ilgis + " coliu yra " + ((double) ilgis * 2.54) + " centimetru");
		
	}

	//2 CAST UZDUOTIS - 3 metodai jai priklauso
	private static void sandauga(int[] skaiciai) {
		int sandauga = 1;
		for(int el: skaiciai) {
			sandauga *= (double) el;
		}
		System.out.println("Suvestu skaiciu tarpusavio sandauga yra " + sandauga);
		
	}

	private static void vidurkis(int[] skaiciai, int n) {
		System.out.println("Suvestu skaiciu vidurkis yra " + suma(skaiciai)/(double) n);
		
	}

	private static double suma(int[] skaiciai) {
		double sum = 0;
		for(int el: skaiciai) {
			sum += (double) el;
		}
		//System.out.println("Suvestu skaiciu suma yra " + sum);
		return sum;
	}

	
	
	
	


	//1 uzduotis
	private static void lyginisNelyginis(int i) {
		if(i % 2 == 0) {
			System.out.println("Skaicius yra lyginis");
		} else {
			System.out.println("Skaicius yra nelyginis");
		}
		System.out.println("---------------");
	}
	
	//2 uzduotis
	private static void paskutinisSkaitmuo(int i) {
		System.out.println(i % 10);
		System.out.println("---------------");
	}

	//3 uzduotis
	private static void keliazenklis(int i) {
		int sk = 1;
		while(i >= 10) {
			sk++;
			i /= 10;
		}
		System.out.println("Skaicius turi " + sk + " zenklu.");
		System.out.println("---------------");
	}
	
	//4 uzduotis
	private static void daliklis(int dal, int sk) {
		int[] masyvas = new int[sk];
		for(int k = 1; k <= sk; k++) {
			masyvas[k - 1] = dal * k;
		}
		for(int el: masyvas) {
			System.out.print(el + " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}

	//5 uzduotis


	private static void atvirksciai(int i) {
		//is pradziu nustatau kiek skaitmenu skaicius
		int sk = 1;
		int skaicius = i;
		while(i >= 10) {
			sk++;
			i /= 10;
		}
		//galima panaudoti jau kurta metoda, bet tada reikia ji modifikuoti, o as nenoriu pakeisti to, kas buvo kitoje pamokoje
		//gera praktika ir butu kazkokius apskaiciavimus deti i metodus
		int[] eilute = new int[sk];
		
		for(int z = 0; z < sk; z++) {
			int liekana = skaicius % 10;
			eilute[z] = liekana;
			skaicius /= 10;
			System.out.print(eilute[z]);
			
		}
		System.out.println();
		System.out.println("-----6 uzduotis----------");
	}
	
	//6 uzduotis
	private static void minuciuKonvertavimas(int i) {
		int d = 0;
		int v = 0;
		//dienoje yra 1440 minuciu
		d = i / 1440;
		v = (i - d * 1440) / 60;
		System.out.println("Dienu: " + d + ", valandu: " + v);
		/*arba
		 d = i/60/24; Cia suzinau kiek yra dienu is duotu minuciu
		 v = i/60%24; Cia suzinau kiek yra valandu is duotu minuciu (jau atemus dienu skaiciu)
		 */
		
	}
}
