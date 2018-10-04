package lt.gaidukevicius;

import java.util.Scanner;

public class String_tipas {

	public static void main(String[] args) {
		//2018.09.03
		//10 paskaita
		
		String str = "abc";
		//String yra objektas arba char masyvas
		char raide = 65;
		System.out.println(raide);
		
		char[] raides = {'a', 'b', 'c'};
		String tekstas = new String(raides);
		
		System.out.println(tekstas);
		 
		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = new String("Cat");
		s2 = s3;
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		s2 = "aaa"; //sako, kad niekas taip nedaro, nes String kintamasis yra nekintamas.
		System.out.println(s2);
		System.out.println("----------------");
		
		//String builder
		
		stringBuilder();
		
		//---- kita uzduotis
		String textas = "Sveiki atvyke";
		int raidziu = 0;
		for(int i = 0; i < textas.length(); i++) {
			if(textas.charAt(i) >= 97 && textas.charAt(i) <= 108) { //97 yra a raides ascii kodas, o 108 yra l raides ascii kodas
				raidziu++;
			}
		}
		System.out.println("Nuo a iki l siame zodyje yra " + raidziu);
		
		//String uzduotys
		System.out.println("---------------------------");
		Scanner input = new Scanner(System.in);
		System.out.print("Iveskite zodi: ");
		String zodis = input.nextLine();
		
		
		//0 uzduotis
		System.out.println("Ivestas tekstas - " + zodis);
		
		//1 uzduotis - ivesto zodzio ilgis
		System.out.println("Ivesto zodzio ilgis yra " + zodis.length());
		
		//11 paskaita
		// 2018.09.05
		
		
		//2 uzduotis - a raides indeksas
		System.out.println("a pozicija yra " + zodis.indexOf('a'));
		
		//3 uzduotis - atspausdinti paskutines a raides indeksa
		System.out.println("paskutines a pozicija yra " + zodis.lastIndexOf('a'));
		
		//4 uzduotis - nuvalyti pradzioje ar gale esancius tarpus
		System.out.println("Be tarpu zodis yra " + zodis.trim());
		
		//5 uzduotis - paversti teksta i diziasias/mazasias reiksmes
		System.out.println("Didziosiomis - " + zodis.toUpperCase());
		System.out.println("Mazosiomis - " + zodis.toLowerCase());
		
		//6 uzduotis - ar tekstas prasideda / baigiasi abc?
		System.out.println("Ar tekstas prasideda ar baigiasi abc? " + arTekstasPrasidedaAbc(zodis));
		
		//7 uzduotis - ar talpina teksta 'test'?
		
		
		
		//zodis.cointains("test")
		
		
		//8 uzduotis pakeisti abc i def
		//zodis.replace(abc, def)
		System.out.println("abc pakeicia i def ir gaunasi - " + zodis.replace("abc", "def"));
	
		//9 uzduotis - surasti abc indeksa
		System.out.println("abc indeksas yra " + zodis.indexOf("abc"));
		
		//10 uzduotis - panaudoti substring metoda ir iskirpti teksta iki abc
		System.out.println("Iskirpus iki abc gaunasi - " + zodis.substring(zodis.indexOf("abc")));
		//jis cia luzta, jeigu ivedu teksta be abc
		
		//11 uzduotis - su substring iskirpti pirma puse teksto
		System.out.println("Pirma zodzio puse - " + zodis.substring(0, (zodis.length()/2)));
		
		
		//12 uzduotis - su substring iskirpti antra dali teksto
		System.out.println("Antra zodzio puse - " + zodis.substring(zodis.length() / 2));
		
		//13 iskaidyti sakini
		//zodis.split(" ") - sudeda i masyva zodzius, kurie yra paduotame zodyje yra atskirti tarpais
		System.out.println("skaidymas - " + zodis.split(" "));
		System.out.println("padalintas zodis su tarpais - " + "\n" + zodis.replace(" ", "\n"));
		
	}
	//6 uzduoties metodai
	private static String arTekstasPrasidedaAbc(String zodis) {
		// TODO Auto-generated method stub
		if(zodis.startsWith("abc")) {
			return "Taip";
		} else {
		return "Ne";
		}
	}

	private static void stringBuilder() {
		String text = "abc";
		System.out.println(text);
		text.concat("ef");
		System.out.println(text);
		System.out.println(text.concat("ef"));
		
		StringBuilder text1 = new StringBuilder("ABC");
		text1.append("EF");
		System.out.println(text1);
		//String a1 = text1; //klaida yra todel, kad neatitinka kintamuju tipai
		String a2 = text1.toString();
		
	}

}
