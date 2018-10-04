package lt.vcs.andrius.testas1;

class a {
	public int a;


	public a() {
		a++;
	}

	public a(int a) {
		this.a = a;
	}

	public a a(a a) {
		a.a++;
		return a;
	}

	public a clone() {
		a a2 = new a();
		a2.a = a;
		return a2;
	}
}

public class Uzdavinys3 {

	public static void main(String argv[]) {
		a a = new a(5); // 5 6
		a.a(a);

		System.out.println(a.a);
		System.out.println(++a.clone().a);
	}

}
