package lt.gaidukevicius;

import java.util.Date;

public class Objektai {

	public static void main(String[] args) {
		// 2018.09.05
		//11 paskaita
		//jos pradzia dar suvesta i 10_paskaita faila
		
		//objekta galima sukurti 3 budais
		
		//1 budas - panaudojant bibliotekoje jau esancia klase
		Date data = new Date();
		System.out.println(data);
		
		//2 budas - sukuriant String tipo objekta
		String tekstas = "Tekstas";
		String kitasTekstas = new String("Kitas tekstas");
		
		//3 budas - sukuriant savo klase
		ManoKlase mk = new ManoKlase();
		
		Stalas st = new Stalas(); //konstruktorius be parametru
		Stalas str = new Stalas("Ruda"); //konstruktorius su parametru
		
		//uzduotis
		
		Taskas tsk = new Taskas();
		tsk.setX(1.1);
		tsk.setY(0.5);
		tsk.setSpalva("juoda");
		
		Taskas tskGalutinis = new Taskas();
		tskGalutinis.setX(2.5);
		tskGalutinis.setY(1.7);
		
		//apskaiciuoti atstuma tarp tasku
		System.out.println("Atstumas yra " + tskGalutinis.atstumasIkiKitoTasko(tsk.getX(), tsk.getY(), tskGalutinis.getX(),
				tskGalutinis.getY()));
		
		//2018.09.06
		//12 paskaita
		
		//kuriame ketvirtyje yra taskas?
		
		System.out.println(tsk.vietaKetvirtyje());
		
		//ar antras taskas yra tame paciame ketvirtyje kaip pirmas?
		
		System.out.println(tsk.arPriklausoTamPaciamKetvirciui(tsk, tskGalutinis));
		
		//parasyti equals metoda
		//veliau
		
		
		
		//konstruktoriai ivairus
		
		Taskas xy = new Taskas(3.5, 5.1);
		Taskas xySpalva = new Taskas(3.6, 6.2, "Zalia");
		Taskas Spalva = new Taskas("Melyna");
	}

}
