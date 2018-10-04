package lt.gaidukevicius;

import java.util.Scanner;

public class Ciklai {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++ ) {
			System.out.println("Hello, World");
		}
		
		System.out.println("-----------------");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Iveskite skaiciu: ");
		int sk = input.nextInt();
		for(int i = 1; i <= sk; i++) {
			System.out.println("Hello, World!");
		}
		
		System.out.println("-----------------");
		
		for(int i = 1; i <= 50; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("----for-------------");
		
		int suma = 0;
		for(int i = 1; i <= 100; i++) {
			suma += i;
			System.out.println(suma);
		}
		
		System.out.println("------while-----------");
		
		suma = 0;
		int j = 1;
		while (j <= 100) {
			suma += j;
			System.out.println(suma);
			j++;
		}
		
		System.out.println("-------do while----------");
		
		suma = 0;
		j = 1;
		do {
			suma += j;
			System.out.println(suma);
			j++;
		} while (j <= 100);
	}
}
