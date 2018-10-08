package lt.gaidukevicius;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TemperaturosTikrinimas {

	public static List<Ligonis> uzpildykLigonius(int skaicius) {
		List<Ligonis> ligoniai = new ArrayList<>();
		for (int i = 0; i < skaicius; i++) {
			ligoniai.add(new Ligonis("Ligonis" + i));
		}
		return ligoniai;
	}

	public static void matuokTemperatura(Ligonis ligonis) throws BlogaTemperatura {
		int temperatura = generuokTemperatura();

		if (temperatura > 36 && temperatura < 50) {
			System.out.println(ligonis + " labai susiles!");
			throw new Karsta(ligonis.getVardas(),temperatura);
		}
		if (temperatura >= 50 || temperatura < 30) {
			throw new Sakes(ligonis.getVardas(),temperatura);
		}
		if (temperatura >= 30 && temperatura < 36) {
			throw new Salta(ligonis.getVardas(),temperatura);
		}

		System.out.println(ligonis + " sveikas!");
	}

	public static void tikrinkSveikata(List<Ligonis> ligoniai) {
		for (Ligonis ligonis : ligoniai) {
			try {
				matuokTemperatura(ligonis);
			} catch (Karsta|Salta e) {
				// gydymas
				//System.out.println(" Ligoniui" +e.ligonioVardas +"ajajaj... temperatura:" + e.temperaturosVerte);
			}  catch (Sakes e) {
				//System.out.println(e.temperaturosVerte);
			}catch (Exception e) {
				//e.printStackTrace();
				//System.out.println("....." );
			}
		}
	}

	public static int generuokTemperatura() {
		return new Random().nextInt(100) - 20;
	}

	public static void main(String[] args) {
		List<Ligonis> ligoniai = uzpildykLigonius(10);

		try {
			tikrinkSveikata(ligoniai);
		}  catch (Exception e) {
			System.out.println("padariau klaida, prasileidau...");
		}
	
		

	}

}

