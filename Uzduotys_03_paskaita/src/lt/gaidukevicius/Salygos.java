package lt.gaidukevicius;

public class Salygos {

	public static void main(String[] args) {
		
		//1 uzduotis
		System.out.println(checkIfNumberIsNegtive(-7));
		
		//2 uzduotis
		arTrizenklis(-111);
		
		//3 uzduotis
		arReziuose(20, 15, 25);
	}

	//1 uzduotis
	private static boolean checkIfNumberIsNegtive(int i) {
		if (i < 0) {
			return true;
		}
		return false;
	}
	
	//2 uzduotis
	private static void arTrizenklis(int i) {
		if(Math.abs(i) > 99 && Math.abs(i) < 1000) {
			System.out.println("Skaicius yra trizenklis");
		} else {
			System.out.println("Skaicius nera trizenklis");
		}
	}
	
	//3 uzduotis
	private static boolean arReziuose(int sk, int r1, int r2) {
		if(r1 >= r2) {
			System.out.println("r1 didesnis uz r2");
			return false;
		} else if(sk >= r1 && sk <= r2) {
			System.out.println("sk yra tarp r1 ir r2");
			return true;
		} else {
			System.out.println("sk nera tarp r1 ir r2");
			return false;
		}
	}
}
