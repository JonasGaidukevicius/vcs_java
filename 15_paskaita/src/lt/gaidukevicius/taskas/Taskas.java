package lt.gaidukevicius.taskas;

public class Taskas {
	public int x;
	public int y;
	
	public static int skaicius;
	
	public Taskas(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		skaicius++;
	}
	
	public static int getSkaicius() {
		System.out.println(Taskas.skaicius);
		return skaicius;
	}
	
	
	
}
