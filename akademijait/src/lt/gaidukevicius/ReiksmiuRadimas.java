package lt.gaidukevicius;

import java.util.Random;

public class ReiksmiuRadimas {

	public static void main(String[] args) {
		Random rand = new Random();

		int[] masyvas = new int[10];

		for (int i = 0; i < masyvas.length; i++) {
			masyvas[i] = rand.nextInt(101);
		}

		for (int j : masyvas) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		int max = 0;
		int min = 100;
		for(int i : masyvas) {
			if(i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
		}
		System.out.println("Didziausia reiksme yra " + max);
		System.out.println("Maziausia reiksme yra " + min);
	}

}
