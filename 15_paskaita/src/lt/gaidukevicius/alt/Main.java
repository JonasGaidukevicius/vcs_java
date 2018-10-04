package lt.gaidukevicius.alt;

import lt.gaidukevicius.KitaKlase;

public class Main {

	
	final static void method4() {
		
	}
	
	public int  method() {
		return 9.0;
	}
	public static void main(String[] args) {
		// 2018.09.25
		
		//importuoju klase is kito paketo ir tada galiu sukurti tos klases objekta
		//kadangi tas kintamasis yra public, tai jis cia yra matomas
		KitaKlase obj = new KitaKlase();
		
		obj.objektoKintamasis = 9;
		
		obj.getObjektoKintamasis1();
		int xx1 =10;
		System.out.println(xx1 > 2 ? xx1 < 4 ? 10 : 8 : 7);
		
		/*
		boolean x = true, z = true;
		int y = 20;
		x = (z=false);
		x = (y != 10) ^ (z=false);
		*/
		
		for (int i = 0; i  < 10; ) {
			i = i+1;
			System.out.println("Hello World");
		}
		
		/*for (int i = 0; ;) {
			System.out.println("Kazkas");
		}*/
		
	/*	int x = 0;
		String s = null;
		if (x == s) System.out.println("Success");
		else System.out.println("Failure");*/
		
		int count = 0;
		ROW_LOOP: for (int row = 1; row <= 3; row++)
			for(int col = 1; col <= 2; col++) {
				if(row * col % 2 == 0) continue ROW_LOOP;
				count++;
			}
		System.out.println(count);
		
		String a ="";
		a += 2;
		System.out.println(a);
		a+='c';
		System.out.println(a);
		a+=false;
		System.out.println(a);
		
		
		
		
				
	}	

}
