package lt.vcs.andrius.kaimynai;

import java.util.ArrayList;
import java.util.List;

public class Zmogus {
	
	public static  Zmogus anoniminisKaimynas = new Zmogus("anonimas");
	
	public Zmogus kaimynas = anoniminisKaimynas;
	
	public String vardas;
	
	public Zmogus(String vardas) {
		this.vardas = vardas;
	}
	
	public void kalbek() {
		System.out.println("Mano vardas:" + vardas);
	}

}
