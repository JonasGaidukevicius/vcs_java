package lt.gaidukevicius;

public class Kintamieji {

	public static void main(String[] args) {
		//Uzdaviniai daryti 2018.08.09
		//1 uzduotis
		int a = 5;
		System.out.println("Skaicius a yra " + a);
		System.out.println("Skaicius a+1 yra " + (a+1));
		System.out.println("-------------");
		
		//2 uzduotis
		int b = 10, c = 2;
		System.out.println("Padalinus b is c gauname " + (b/c));
		System.out.println("-------------");
		
		//3 uzduotis
		int i = 3, j = 6;
		System.out.println("i ir j sandauga yra " + (i*j));
		System.out.println("-------------");
		
		//4 uzduotis
		String zodis = "Zodis";
		System.out.println(zodis);
		System.out.println("-------------");
		
		//5 uzduotis
		String pirmas = "Vardas", antras = "Pavarde";
		System.out.println(pirmas + " " + antras);
		System.out.println("-------------");
		
		//6 uzduotis
		double skaicius = 3.1415;
		System.out.println("Realus smaicius yra " + skaicius);
		System.out.println("Realus skaicius pridejus yra " + (skaicius + 1.2346));
		System.out.println("-------------");
		
		//7 uzduotis. Metodai
		System.out.println("Grazintas skaicius yra " + grazina(2));
		System.out.println("-------------");
		
		//8 uzduotis
		System.out.println("Atspausdinu is programos " + grazina1(5));
		System.out.println("-------------");
		
		//9 uzduotis
		System.out.println("Skaiciu 4 ir 5 suma yra " + suma(4, 5));
		System.out.println("-------------");
		
		//10 uzduotis
		System.out.println("Sujungus a ir b gaunasi - " + sujungia('a','b'));
		System.out.println("-------------");
		
		//11 uzduotis
		sujungiaSkaiciuSuString(1, "Tekstas");
		System.out.println("-------------");
		
		//12 uzduotis
		System.out.println("Grazinta logine reiksme yra " + logika());
		System.out.println("-------------");
		
	}

	//7 uzduotis. Metodai
	public static int grazina (int s) {
	int s1 = s;
	return s1;
	}
	
	//8 uzduotis
	public static int grazina1 (int t) {
		int t1 = t;
		System.out.println("Padaviau " + t + " ir metode atspausdinu " + t1);
		return t1;
		//atmink, kad paduota kintamaji naudoti galiu metodo kode.
		//nereikia kito kintamojo, kuriam priskirti butina atejusia reikme!!!!!!!
	}
	
	//9 uzduotis
	public static int suma(int p1, int p2) {
		return p1+p2;
	}
	
	//10 uzduotis
	public static String sujungia(char c1, char c2) {
		String sujungtas = String.valueOf(c1) + String.valueOf(c2);
		//arba
		StringBuilder builder = new StringBuilder();
		builder.append(c1);
		builder.append(c2);
		System.out.println("Per builder - " + builder);
		//jeigu noreciau grazinti builder reiksme, tai reiketu paversti objekta i Stringa
		//o tai pasidaro taip - builder.toString()
		return sujungtas;
	}
	
	//11 uzduotis
	public static void sujungiaSkaiciuSuString(int sk, String tekstas) {
		System.out.println(sk + tekstas);
	}
	
	//12 uzduotis
	public static boolean logika() {
		return true;
	}
}
