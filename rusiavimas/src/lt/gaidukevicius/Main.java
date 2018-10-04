package lt.gaidukevicius;

import java.util.Random;

public class Main { // rusiavimas

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

		quickSort(masyvas, 0, 9);

		/*
		 * for (int i = 0; i < masyvas.length; i++) { int mazesnis = masyvas[i]; int
		 * indeksas = i; // System.out.println("pirmas mazesnis " + mazesnis); for (int
		 * j = i + 1; j < masyvas.length; j++) { int kitas = masyvas[j]; if (kitas <
		 * mazesnis) { mazesnis = kitas; indeksas = j; // System.out.println(mazesnis);
		 * 
		 * } } // System.out.println("maziausias yra " + mazesnis +
		 * " ir yra pozicijoje " + // indeksas); masyvas[indeksas] = masyvas[i];
		 * masyvas[i] = mazesnis;
		 * 
		 * for (int j : masyvas) { System.out.print(j + " "); } System.out.println();
		 */
	}

	public static int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];
		System.out.println("Pivot -> " + pivot);
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
			for (int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}

		
		return i;
	}

	public static void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

}