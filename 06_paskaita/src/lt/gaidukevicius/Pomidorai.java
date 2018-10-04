package lt.gaidukevicius;

import java.util.Random;
import java.util.Scanner;

public class Pomidorai {

	public static void main(String[] args) {
		
		//Cia as isprendziau taip, kad skaiciuoju pomidoruos nuo 1, o ne nuo 0, kaip reikalauja salyga
		
		Scanner input = new Scanner(System.in);
		Random kazkoks = new Random();
		int kiekis = -1;
		//iveda pomidoru kieki
		while(kiekis <= 0 || kiekis > 10) {
		System.out.println("Iveskite pomidoru kieki (nuo 1 iki 10): ");
		kiekis = input.nextInt();
		}
		input.close();
		//iskrenta atsitiktinis pomidoras
		int pradinis = kazkoks.nextInt(kiekis) + 1;
		System.out.println("Pradinis sunokes pomidoras yra numeris " + pradinis);
		
		if((kiekis - pradinis) >= pradinis) {
			System.out.println("Pomidorai isnoks per " + (kiekis - pradinis) + " dienas(-a).");
		} else {
			System.out.println("Pomidorai isnoks per " + (pradinis-1) + " dienas(-a)");
		}
		
		//o cia kitoks, trumpesnis variantas
		System.out.println("Kitaip - " + Math.max((kiekis - pradinis), (pradinis - 1)));
	}
}
