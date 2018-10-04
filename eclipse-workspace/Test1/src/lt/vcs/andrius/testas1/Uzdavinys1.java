package lt.vcs.andrius.testas1;

public class Uzdavinys1 {
	
	public static boolean arTiesa(boolean b) {
		return !(b & b || b);
	}
	
	public static void main(String argv[]) {
		
		boolean b1 = arTiesa(false); // true
		boolean b2 = arTiesa(true); // false
		
		if(b1 && b2) {
			System.out.println("1" + 1);
		}
		
		if(b1 || b2) {
			System.out.println("tiesa");
		}
		
		int i = 0;
		
		// true							true		true
		if(!!(b1 || arTiesa(true)) && arTiesa(b2) && 1 == ++i) {
			System.out.println("whew" + i++);
		}
		
	}
	
}
