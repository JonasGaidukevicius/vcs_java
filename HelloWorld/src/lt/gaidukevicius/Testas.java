package lt.gaidukevicius;

import java.util.Random;

public class Testas {

	public static void main(String[] args) {
		Random rand = new Random();
		int atsitiktinis = 0;
		for(int i = 1; i <= 200; i++) {
			atsitiktinis = rand.nextInt(4+1);
			System.out.print(atsitiktinis + " ");
		}
	}

}
