package lt.vcs.andrius.kaimynai;

public class Main {

	public static void main(String[] args) {
		Zmogus zmogus = new Zmogus("Petras");
		
		zmogus.kaimynas = new Zmogus("Vytenis");
		
		zmogus.kalbek();
		zmogus.kaimynas.kalbek();
		zmogus.kaimynas.kaimynas.kalbek();
		zmogus.kaimynas.kaimynas.kaimynas.kalbek();
		
		
		//Zmogus z2 = new Zmogus("Vytenis");
		//zmogus.kaimynas = z2;
		
		/*zmogus.kaimynai.add(new Zmogus("Vytenis"));
		
		
		Zmogus z2 = new Zmogus("Vytautas");
		
		zmogus.kaimynai.add(z2);
		
		zmogus.kaimynai.add(zmogus);*/

	}

}
