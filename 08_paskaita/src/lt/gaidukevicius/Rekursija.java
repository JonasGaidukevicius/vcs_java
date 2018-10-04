package lt.gaidukevicius;

public class Rekursija {

	public static void main(String[] args) {
		// Rekursija eina po TrysUzduotys
		
		System.out.println("Faktorialas yra " + faktorialasRekursija(5));
		
		//3 uzduotis
		System.out.println("---3 uzduotis---");
		skaitmenysAtvirksciai(123456);
		
		//4 uzduotis
		System.out.println();
		System.out.println("--- 4 uzduotis ----");
		System.out.println("Skaitmenu suma yra " + sumaRekursija(1));
		
		
		//5 uzduotis
		//Atspausdinti Fibonacci skaicius su rekursija
		System.out.println();
		System.out.println("--- 5 uzduotis ---");
		System.out.print("0 1 ");
		int sk1 = 0;
		int sk2 = 1;
		fibonacciRekursija(sk1, sk2);
	

	}
	
	//5 uzduoties metodas
	private static void fibonacciRekursija(int sk1, int sk2) {
		if(sk2 > 10000) {
			System.out.println("Pabaiga");
		} else {
		System.out.print((sk1 + sk2) + " ");
		fibonacciRekursija(sk2, (sk1 + sk2));
		}
	}

	//4 uzduoties metodas
	private static int sumaRekursija(int i) {
		if(i < 10) {
			return i;
		} 
		return (i % 10) + sumaRekursija(i / 10);
	}

	//3 uzduoties metodas
	private static void skaitmenysAtvirksciai(int i) {
		if (i < 10) {
			System.out.print(i);
		} else {
			System.out.print(i % 10);
			skaitmenysAtvirksciai(i / 10);
		}
	}

	private static int faktorialasRekursija(int n) {
		if (n == 1) {
			return 1;
		}
		return n * faktorialasRekursija(n - 1);
		
		/* arba
		 n == 1 ? 1 : n * factorial(n-1); - tai vadinasi Ternary operator
		 
		 n == 1 ? - salyga
		 1 : - jeigu salyga true, vykdoma si dalis (iki dvitaskio)
		 n * factorial(n-1); - jeigu salyga yra false, vykdoma dalis (po dvitaskio)
		 
		 */
	}

}
