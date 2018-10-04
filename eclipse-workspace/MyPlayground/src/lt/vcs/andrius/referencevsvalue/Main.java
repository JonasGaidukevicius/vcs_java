package lt.vcs.andrius.referencevsvalue;

public class Main {
	
	
	public static void spausdinkTaskaDukart(Taskas t) {
		System.out.println("Dvigubas taskas:"+t.toString() + t.toString());
	}
	
	
	
	public static void main(String [] argv) {
		
		new Main().spausdinkTaskaDukart(new Taskas(7, 9));
		
		Main.spausdinkTaskaDukart(new Taskas(7, 9));
		
		spausdinkTaskaDukart(new Taskas(7, 9));
		
		/*Taskas.getSkaicius();
		
		Taskas t = new Taskas(7, 9);
		t.getSkaicius();
				
		new Taskas(7, 9);
		new Taskas(6, 8);
		
		Taskas.getSkaicius();*/
			
		
	
	}

}
