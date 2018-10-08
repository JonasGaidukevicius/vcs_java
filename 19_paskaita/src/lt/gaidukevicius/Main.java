package lt.gaidukevicius;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	// Error pavyzdys
	public static void testError() {
		testError();
	}

	// Runtime pavyzdys
	public static void testRuntime() {
		int[] array = { 0 };
		array[1] = 2;
	}

	// Exception pavyzdys
	public static void testException() throws Exception {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("/nofilethere/file.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			throw new Exception("Neteisingas failo vardas", e);
		}

		//////
	}

	// Exception pavyzdys
	public static void testException2() throws IOException {
		BufferedReader reader;

		reader = new BufferedReader(new FileReader("/nofilethere/file.txt"));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();

	}

	public static void main(String[] args) throws IOException {
		System.out.println("Pradedame darba");
		// testException();
		// testException2();
		// testRuntime();

		try {
			testException();
			//
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Baigiame darba");

		/*
		 * System.out.println("Pradedame darba");
		 * 
		 * new KlaidosPavyzdys();
		 * 
		 * System.out.println("Baigiame darba");
		 */

	}

}

class KlaidosPavyzdys {
	public KlaidosPavyzdys() {
		init();
	}

	private void init() {
		throw new RuntimeException("Basi klaida!", new NullPointerException("Padarei klaida!"));
	}
}