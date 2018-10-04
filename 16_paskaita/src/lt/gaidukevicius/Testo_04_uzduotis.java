package lt.gaidukevicius;

class Skaicius {
	public int sk;
}

public class Testo_04_uzduotis {
	
	public static Skaicius sk = new Skaicius();
	
	
	private int increment(int sk) {
		System.out.println(sk++);
		return ++sk;
	}
	
	private int increment(Skaicius sk) {
		System.out.println(sk.sk++);
		return sk.sk;
	}

	public static void main(String argv[]) {
	
		System.out.println(increment(sk.sk)); //kvieciami metodai nera STATIC, todel negalima ju pakviesti is MAINO tiesiog parasius
		System.out.println(increment(sk)); // ju pavadinima!!!
	}
}


