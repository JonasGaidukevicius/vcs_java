package lt.gaidukevicius;

import java.util.Random;

public class Rikiavimas {

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

		for (int i = 0; i < masyvas.length; i++) {
			int mazesnis = masyvas[i];
			int indeksas = i;
			// System.out.println("pirmas mazesnis " + mazesnis);
			for (int j = i + 1; j < masyvas.length; j++) {
				int kitas = masyvas[j];
				if (kitas < mazesnis) {
					mazesnis = kitas;
					indeksas = j;
					// System.out.println(mazesnis);

				}
			}
			// System.out.println("maziausias yra " + mazesnis + " ir yra pozicijoje " +
			// indeksas);
			masyvas[indeksas] = masyvas[i];
			masyvas[i] = mazesnis;
		}

		for (int j : masyvas) {
			System.out.print(j + " ");
		}

	}

}
