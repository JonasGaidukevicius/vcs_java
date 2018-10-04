package lt.gaidukevicius;

public class Paslinkimai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = -153;
		printBinary(a, 16);
		int b = 2;
		printBinary(b, 16);
		int c = a + b;
		System.out.println(c);
		printBinary(c, 16);
		System.out.println("--operacija <<  ------------------");
		c = a << b;
		System.out.println(c);
		printBinary(c, 16);
		
		System.out.println("--operacija >>  ------------------");
		c = a >> b;
		System.out.println(c);
		printBinary(c, 16);
		
		System.out.println("--operacija >>>  ------------------");
		c = a >>> b;
		System.out.println(c);
		printBinary(c, 16);
	}

	private static void printBinary(int value, int size){
		for(int i = size - 1; i >= 0; i--){
			long mask = 1 << i;
			long result = (mask & value) >> i;
			System.out.print(result);

		}
		System.out.println();
		
		
	}

}
