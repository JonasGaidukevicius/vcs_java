package lt.gaidukevicius;

class A1 {
	int sk = 5;
	public void printSk(){
		System.out.println(sk);
	}
}

class B1 extends A1 {
	public void printSk(){
		System.out.println(super.sk+sk);
	}
}

class C1 extends B1 {
	int sk = 3;
}

public class Testo_05_uzduotis {
	
	
	
	public static void main(String[] argv) {
		new A1().printSk();
		new B1().printSk();
		new C1().printSk();
	}
}

