package lt.gaidukevicius;

public class NamuDarbai {

	public static void main(String[] args) {
		// 1 uzduotis
		//Masyva uzpildome skaiciais nuo 1 iki 9. Programa turi atspausdinti visus masyvo skaicius, kurie dalinasi is 3.
		System.out.println("--- 1 uzduotis ---");
		int[] skaiciai = new int[9];
		for(int i = 0; i < skaiciai.length; i++) {
			skaiciai[i] = i+1;
		}
		for(int i = 0; i < skaiciai.length; i++) {
			if(skaiciai[i] % 3 == 0) {
				System.out.print(skaiciai[i] + " ");
			}
		}
		
		
		//2 uzduotis
		/*Parasyti programa, kuri suskaiciuotu visus pirminius skaicius nuo 10 iki 100. Pirminis skaicius yra tas
		skaicius, kuris dalinasi iš 1 ir is pats saves. Atsakymas turi buti toks : 11, 13, ... 97. */
		
		System.out.println();
		System.out.println("--- 2 uzduotis ---");
		int skaicius = 10;
		//System.out.print("1 ");
		pirminisRekursija(skaicius);
		
	}
		//2 uzduoties metodas
	
	private static void pirminisRekursija(int skaicius) {
		if (skaicius > 100) {
			//System.out.println("Pabaiga");
			return;
		} else {
			int skaitliukas = 0;
			for(int i = skaicius; i > 0; i--) {
				if(skaicius % i == 0) {
					skaitliukas++;
				}
			}
			if(skaitliukas == 2) {
				System.out.print(skaicius + " ");
			}
			pirminisRekursija(skaicius + 1);
		}
		
	}
}
