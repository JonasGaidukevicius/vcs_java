package lt.vcs.andrius.referencevsvalue;

public class Taskas {
	

	
		
	public static int getSkaicius() {
		System.out.println("Skaicius: " + skaicius);
		return skaicius;
	}
	
	public static int skaicius;

	public int x;
	public int y;

	public Taskas(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		skaicius++;
	}


	public String toString(int sk) {
		int i = 0;
		return "Taskas --- [x=" + x + ", y=" + y + "]";
	}

}