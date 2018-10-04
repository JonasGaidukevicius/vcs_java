package lt.gaidukevicius;

import java.util.Scanner;

public class TrysUzduotys {

	public static void main(String[] args) {
		// 2018.08.28    08 paskaita
		
		//1 uzduotis. Apskaiciuoti paduoto skaiciaus faktoriala
		System.out.println("---1 uzduotis---");
		Scanner input = new Scanner(System.in);
		System.out.print("Iveskite skaiciu: ");
		int sk = input.nextInt();
		System.out.println("Skaiciaus " + sk + " faktorialas yra " + faktorialas(sk));
		
		//2 uzduotis
		System.out.println();
		System.out.println("---2 uzduotis---");
		System.out.println("Kiek Fibonacci skaiciu atspausdinti: ");
		int fib = input.nextInt();
		fibonacci(fib);
		
		//3 uzduotis
		System.out.println();
		System.out.println("---3 uzduotis---");
		System.out.println("Kelinta Fibonacci skaiciu atspausdinti: ");
		int fib0 = input.nextInt();
		fibonacci0(fib0);
	}
	
	
	


	//1 uzduoties metodas
	private static int faktorialas(int sk) {
		int rezultatas = sk;
		for (int i = sk - 1; i > 0; i--) {
			rezultatas *= i;
		}
		if (rezultatas == 0) {
			rezultatas = 1;
		}
		return rezultatas;
		
	}
	
	//2 uzduoties metodas
	private static void fibonacci(int fib) {
		int a = 0;
		int b = 1;
		int c;
		System.out.print("0 1 ");
		for(int i = 3; i <= fib; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		
	}
	
	
	//3 uzduoties metodas
		private static void fibonacci0(int fib) {
			int a = 1;
			int b = 1;
			int c = 0;
			if(fib == 1) {
				System.out.println(fib + "-as Fibonacci skaicius yra 0");
			} else if(fib == 2 || fib == 3) {
				System.out.println(fib + "-as Fibonacci skaicius yra 1");
			} else {
				for(int i = 4; i <= fib; i++) {
					c = a + b;
					a = b;
					b = c;
				}
			
			}
			System.out.println(fib + "-as Fibonacci skaicius yra " + c);
		}

}
