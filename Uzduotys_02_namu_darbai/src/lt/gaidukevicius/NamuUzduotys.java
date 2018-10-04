package lt.gaidukevicius;

public class NamuUzduotys {

	public static void main(String[] args) {
		
		//1 uzduotis
		boolean loginis = true;
		if(loginis == true) {
			System.out.println("Tiesa");
		} else {
			System.out.println("Netiesa");
		}
		System.out.println("--------------");
		
		//2 uzduotis
		int sk = 105;
		if(sk > 100) {
			System.out.println("Skaicius yra didesnis uz 100");
		}
		System.out.println("--------------");
		
		//3 uzduotis
		int sk1 = 105;
		if(sk1 > 100) {
			System.out.println("Skaicius yra didesnis uz 100");
		} else {
			System.out.println("Skaicius yra mazesnis arba lygus 100");
		}
		System.out.println("--------------");
		
		// 4 uzduotis
		int sk2 = 100;
		if (sk2 >= 0 && sk2 <= 100) {
			System.out.println("Skaicius yra tarp 0 ir 100");
		} else {
			System.out.println("Skaicius nera tarp 0 ir 100");
		}
		System.out.println("--------------");
	}

}
