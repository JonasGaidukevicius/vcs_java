package lt.gaidukevicius;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// 2018.10.02
		// Cia yra Map sarasas
		
		Map<Integer, String> sarasas = new HashMap<>();
		sarasas.put(1, "aaaaaaaaaaaaaaaa");
		sarasas.put(2, "bbbbbbbbbbbbbbbb");
		sarasas.put(3, "cccccccccccccccc");
		
		
		//3 budai atspausdinti Map tipo sarasa
		for(Map.Entry<Integer, String> s: sarasas.entrySet()) {
			System.out.println(s.getKey() + " -> " + s.getValue());
		}
		
		for(Integer raktas: sarasas.keySet()) {
			System.out.println(raktas + " -> " + sarasas.get(raktas));
		}
		
		for(String reiksme : sarasas.values()) {
			System.out.println(reiksme);
		}
		
	}

}
