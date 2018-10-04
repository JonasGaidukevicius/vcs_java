package lt.gaidukevicius;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;


		System.out.println("Before swapping : a, b = "+a+", "+ + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping : a, b = "+a+", "+ + b);

		
		int x = 34;
		int y = 78;
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		System.out.println("x yra " + x + ", o y yra " + y);
				
	}

}
