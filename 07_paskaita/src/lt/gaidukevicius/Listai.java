package lt.gaidukevicius;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listai {

	public static void main(String[] args) {
		//2018.08.27 07 paskaita
		//listai();
		
		//1 uzduotis. Ar listai yra vienodo ilgio ir reiksmiu
		
		List<String> sarasas01 = new ArrayList();
		List<String> sarasas02 = new ArrayList();
		sarasas01.add("Pirmas");
		sarasas01.add("Antras");
		sarasas01.add("Trecias");
		sarasas02.add("Pirmas");
		sarasas02.add("Antras");
		sarasas02.add("Trecias");
		
		//nebaigeme daryti
		
		//2 uzduotis --- neuzbaigta
		//nes reikia nustatyti kiek buvo ivesta vienetu, dvejetu, trejetu ir t. t.
		System.out.println("---2 uzduotis---");
		Scanner input = new Scanner(System.in);
		int skaicius = 0;
		int i = 0;
		List<Integer> eilute = new ArrayList();
		while (i != -1) {
			System.out.println("Iveskite skaiciu nuo 0 iki 10: ");
			skaicius = input.nextInt();
			if(skaicius == -1) {
				break;
			} else if (skaicius < 0 || skaicius > 10) {
				System.out.println("Netinkamas skaicius");
				continue;
			}
			eilute.add(skaicius);
		}
		System.out.println("Ivesti skaiciai yra");
		System.out.println(eilute);
		
		//reikia susikurti metoda, i kuri bus kreipiamasi is ciklo
		for(int j = 0; j <= 10; j++) {
			patikrink(eilute, j);
		}
		
		
		//3 uzduotis
		System.out.println("---3 uzduotis---");
		List<Integer> listas = new ArrayList<Integer>();
		listas = listoGeneravimas();
		System.out.print("Iveskite skaiciu: ");
		int sks = input.nextInt();
		System.out.println("Ivesto skaiciaus pozicija liste yra " + arYra(listas, sks));
		System.out.println("Ivesto skaiciaus pozicija liste 2 variantu yra " + arYra1(listas, sks));
		
		//2018.08.27. 08 paskaita.
		//4 uzduotis
		System.out.println("---4 uzduotis---");
		List<Integer> listasB = new ArrayList<Integer>();
		listasB = listoGeneravimas();
		System.out.println("Listo eilute yra " + keitimasIString(listasB));
		System.out.println("Listo eilute yra kitu metodu " + keitimasIString1(listasB));
		
	}
	
	//2 uzduoties metodas
	private static void patikrink(List<Integer> eilute, int j) {
		int kiekis = 0;
		for(int z = 0; z < eilute.size(); z++) {
			if(eilute.get(z).equals(j)) {
				kiekis++;
			}
		}
		System.out.println(j + "-tu yra " + kiekis);
		
	}
	//3 uzduoties metodai
	
	
	//sitas metodas panaudojamas ir 4 uzduotyje
	private static List listoGeneravimas() {
		List<Integer> listas = new ArrayList<Integer>();
		listas.add(1);
		listas.add(2);
		listas.add(3);
		listas.add(4);
		listas.add(5);
		return listas;
	}
	
	private static int arYra(List<Integer> listas, int i) {
		int pos = 0;
		for(int k = 0; k < listas.size(); k++) {
			//System.out.println(listas.get(k));
			if(listas.get(k).equals(i)) {
				pos = k;
				break;
				//return k; - kazkodel nepriima sios eilutes kaip metodo return eilutes
			} else {
				pos = -1;
				// return -1; - cia irgi nepriima eilutes kaip metodo return eilutes
			}
		}
		return pos;
	}
		
		//arba galima naudoti komandas contains(i) ir indexOf(i).
		//pirmoji patikrina ar liste yra tokia reiksme, o kita komanda nustato reiksmes indeksa
	
		private static int arYra1(List<Integer> listas, int i) {
			if(listas.contains(i)) {
				return listas.indexOf(i);
					
				} else {
					return -1; 
				}
			}
					
	
	
	//4 uzduoties metodas
	private static String keitimasIString(List<Integer> listasB) {
		String eilute = "";
		for (int i = 0; i < listasB.size(); i++) {
			eilute += listasB.get(i);
		}
		//System.out.println("Listo eilute yra " + eilute);
		return eilute;
	}
	
	private static String keitimasIString1(List<Integer> listasB) {
		return listasB.toString();
		
	}
	
	

	private static void listai() {
		//neparametrizuotas listas
		List sarasas = new ArrayList();
		sarasas.add("Pirmas");
		sarasas.add("Antras");
		sarasas.add(3);
		System.out.println(sarasas);
		
		//parametrizuotas listas
		List<String> sarasas1 = new ArrayList();
		sarasas1.add("Pirmas");
		sarasas1.add("Antras");
		sarasas1.add("Trecias");
		System.out.println(sarasas1);
		
		sarasas.get(1); //paimu is listo elementa, kurio indeksas 1
		sarasas.set(1, "Papildomas");
		System.out.println(sarasas);
		sarasas.remove(0);
		System.out.println(sarasas);
		sarasas.add(0, "Naujas pirmas");
		System.out.println(sarasas);
		
		
		
	}

}
