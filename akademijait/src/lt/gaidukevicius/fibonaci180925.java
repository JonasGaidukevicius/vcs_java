package lt.gaidukevicius;

import java.util.Scanner;

public class fibonaci180925 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.println("Kelinta Fibonacci skaiciu atspausdinti: ");
		int fib0 = input.nextInt();
		fibonacci0(fib0);
		input.close();
	}

	
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
