package lt.gaidukevicius;

import java.util.Scanner;

public class Masyvai {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		int[] array2 = new int[10];
		
		//ir taip ir taip galima, bet Egidijus rekomenduoja naudoti antra buda

		int[] masyvas = {3, 7, 4, 2, 9};
		
		for (int el: masyvas) {
			System.out.print(el + " ");
		}
		System.out.println();
		int suma = 0;
		for (int i: masyvas) {
			suma+=i;
		}
		System.out.println("Masyvo elementu suma yra " + suma);
		
		int[] kitasMasyvas = new int[masyvas.length];
		for(int i = 0; i <= masyvas.length - 1; i++ ) {
			kitasMasyvas[i] = masyvas[i];
		}
		System.out.println("Naujo masyvo elementai:");
		for(int el: kitasMasyvas) {
			System.out.print(el + " ");
		}
		System.out.println();
		System.out.println("---------------");
		
		//4 uzduotis
		Scanner input = new Scanner(System.in);
		int[] masyvas2 = new int[5];
		int k = 0;
		int sk = 0;
		while (k <= 4) {
			System.out.println("Iveskite " + (k + 1) + "-a skaiciu");
			sk = input.nextInt();
			masyvas2[k] = sk;
			//arba galima ivesta reiksme iskart deti i masyva, nenaudojant papildomo kintamojo!
			k++;
		}
		for(int el: masyvas2) {
			System.out.print(el + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		
		//5 uzduotis
		
		System.out.println("Iveskite kiek skaiciu reikes ivesti: ");
		int ilgis = input.nextInt();
		int[] masyvas3 = new int[ilgis];
		k = 0;
		sk = 0;
		while (k < ilgis) {
			System.out.println("Iveskite " + (k+1) + "-a skaiciu:");
			sk = input.nextInt();
			masyvas3[k] = sk;
			k++;
		}
		int suma0 = 0;
		System.out.println("Ivesti skaiciai:");
		for(int mas: masyvas3) {
			System.out.print(mas + " ");
			suma += mas;
		}
		System.out.println();
		System.out.println("Masyvo elementu suma yra " + suma0);
	}

}
