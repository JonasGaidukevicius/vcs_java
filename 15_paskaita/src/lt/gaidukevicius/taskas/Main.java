package lt.gaidukevicius.taskas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Taskas.getSkaicius();
		Taskas t1 = new Taskas(3, 5);
				
		Taskas.getSkaicius();
		
		Taskas tt = new Taskas(6, 9);
		tt.getSkaicius();
		
		new Main().spausdinkTaskaDuKart(tt);
		
		System.out.println("-----------------");
		int skaicius = 5;
		System.out.println(skaicius);
		didinkReiksme(skaicius);
		System.out.println(skaicius);
		
		System.out.println("-----------------");
		
		Skaicius sk = new Skaicius();
		System.out.println(sk.skaicius);
		
		didinkReiksme(sk);
		System.out.println(sk.skaicius);
		
	}
	
	public void spausdinkTaskaDuKart(Taskas t) {
		System.out.println("Spausdinu beleka");
	}
	
	public static void didinkReiksme(int sk) {
		sk++;
	}
	
	public static void didinkReiksme(Skaicius sk) {
		sk.skaicius++;
	}

}


class Skaicius{
	public int skaicius;
}