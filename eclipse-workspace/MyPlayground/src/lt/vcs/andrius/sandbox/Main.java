package lt.vcs.andrius.sandbox;

public class Main {
	
	
	public static void didinkReiksme(int sk) {
		sk++;
	}
	
	public static void didinkReiksme(Skaicius sk) {
		sk.skaicius ++;
	}
	
	public static void main(String [] argv) {
		
		/*int skaicius = 5;
		
		System.out.println(skaicius);
	
		didinkReiksme(skaicius);
		
		System.out.println(skaicius);*/
		
		
		/*Skaicius skaicius = new Skaicius();
		
		System.out.println(skaicius.skaicius);
		
		didinkReiksme(skaicius);
		
		System.out.println(skaicius.skaicius);*/
		
		//int sk = 0;
		
		Integer skObj = 0;
		
		
		Skaicius sk = new Skaicius();
		sk.skaicius = 10;
		
		
		sk = new Skaicius();
		
		Skaicius sk2 = sk;
	}

}


class Skaicius {
	public int skaicius;
}
