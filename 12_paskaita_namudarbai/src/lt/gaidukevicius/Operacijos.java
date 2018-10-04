package lt.gaidukevicius;

import java.util.Scanner;

public class Operacijos {

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);

		Bankomatas operacija = new Bankomatas(500, 3, 1);
		Scanner ivesti = new Scanner(System.in);
		int oper;
		if (operacija.tikrinuPin()) {
			System.out.println("Bankomate yra " + operacija.getPinigai() + " pinigu.");
			while (operacija.getPinigai() >= 10 && operacija.getOperacijosTipas() == 1) {
				System.out.println("Norite issiimti pinigu [1] ar baigti darba [2]:");
				oper = ivesti.nextInt();
				if (oper == 1) {
					operacija.isgryninu();
				} else if (oper == 2) {
					System.out.println("Aciu, kad naudojotes musu paslaugomis");
					break;
				} else {
					System.out.println("Ivestas neteisingas operacijos kodas");
				}
			}
		}
		ivesti.close();
	}
}
