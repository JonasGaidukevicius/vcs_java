package lt.vcs.andrius.testas1;

class Skaicius {
	public int sk;
}

public class Uzdavinys4 {
	
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
	
		System.out.println(increment(sk.sk));
		System.out.println(increment(sk));
	}
}
