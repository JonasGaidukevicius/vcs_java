package lt.gaidukevicius;

public class Main {

	public static void main(String[] args) {
		//2018.08.08
		System.out.println("Hello, World");
		int skaicius = 5;
		System.out.println(skaicius);
		//Masyvas
		int array[] = new int[10];
		//cia pasakiau, kad yra sveikuju skaiciu masyvas array, kuris tures 10 elementu
		System.out.println(array);
		int array2[] = {1, 2}; //o cia sukuriau masyva iskart priskirdamas reiksmes. Ir automatiskai masyvas gaunasi 2 elementu ilgio
		System.out.println(array2);
		System.out.println(array2[0]);
		char raide = 'c';
		System.out.println(raide);
		// objektai toliau
		String tekstas = "pq";
		System.out.println(tekstas);
		String tekstas2 = new String();
		
		//2018.08.09
		int a, b;
		a = 1;
		b = (a==1) ? 20: 30; // cia idomus operatorius
		System.out.println(b);
		
		String s = "aaa";
		String l = "bbb";
		String z;
		z = (s=="aaa") ? "Tiesa": l;
		System.out.println(z);
	}

}
