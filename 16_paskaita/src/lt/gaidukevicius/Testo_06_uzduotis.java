package lt.gaidukevicius;

class A2 {
	public void sayAbc() throws Exception {
		System.out.println("abc!");
	}
}

class B2 extends A2 {
	public void sayAbc() throws Exception {
		super.sayAbc();
		System.out.println("ABC!");
		throw new IndexOutOfBoundsException();
	}
}

class C2 extends A2 {
	public void sayAbc() throws Exception {
		System.out.println("!!!");
		throw new Exception();
	}
}


public class Testo_06_uzduotis {

	public static void main(String[] argv) {
		A2[] m = { new A2(), new B2(), new C2() };
		try {
			for (int i = 0; i <= m.length; i++) {
				m[i].sayAbc();
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("-1");
		} catch (Exception e) {
			System.out.println("ERR");
		}
	}
}

