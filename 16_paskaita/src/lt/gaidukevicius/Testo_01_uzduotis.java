package lt.gaidukevicius;

public class Testo_01_uzduotis {
	
	
	public static boolean arTiesa(boolean b) {
		return !(b & b || b);
	}
	
	public static void main(String argv[]) {
		
		boolean b1 = arTiesa(false);
		boolean b2 = arTiesa(true);
		
		if(b1 && b2) {
			System.out.println("1" + 1);
		}
		
		if(b1 || b2) {
			System.out.println("tiesa");
		}
		
		int i = 0;
		if(!!(b1 || arTiesa(true)) && arTiesa(b2) && 1 == ++i) {
			System.out.println("whew" + i++);
		}
		
	}
}
