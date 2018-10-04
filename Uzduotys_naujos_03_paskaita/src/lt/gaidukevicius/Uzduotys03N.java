package lt.gaidukevicius;

import java.util.Scanner;

public class Uzduotys03N {

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("Iveskite skaiciu: ");
		int skaicius = s.nextInt();
		System.out.println(skaicius);
		System.out.println("Iveskite teksta: ");
		String tekstas = s.next();
		System.out.println(tekstas);
		s.close();*/
		
		//2 uzduotis
		Scanner input = new Scanner(System.in);
		System.out.print("Iveskita pirma skaiciu: ");
		int sk1 = input.nextInt();
		System.out.print("Iveskite antra skaiciu: ");
		int sk2 = input.nextInt();
		//input.close();
		System.out.println("Skaiciu suma yra " + suma(sk1, sk2));
		
		//3 uzduotis
		System.out.print("Iveskite teksta: ");
		String text = input.next();
		
		System.out.println("Ivestas tekstas yra " + text);
		//input.close();
		
		//4 uzduotis
		System.out.print("Iveskite pirma zodi: ");
		String zodis1 = input.next();
		System.out.print("Iveskite antra zodi: ");
		String zodis2 = input.next();
		System.out.print("Ivesti zodziai yra " + zodis1 + " ir " + zodis2);
	}
	
	//2 uzduotis
	private static int suma(int s1, int s2) {
		return s1 + s2;
	}

	
}
