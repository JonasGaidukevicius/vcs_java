package lt.gaidukevicius;

public class KavosAparatas {
	
	private double cukrausKiekis;
	private double kavosPupeliuKiekis;
	private double vandensKiekis;
	private int panaudojimuSkaicius;
	public static final int PANAUDOJIMU_SKAICIAUS_RIBA = 10;
	
	public double getCukrausKiekis() {
		return cukrausKiekis;
	}

	public void setCukrausKiekis(double cukrausKiekis) {
		this.cukrausKiekis = cukrausKiekis;
	}

	public double getKavosPupeliuKiekis() {
		return kavosPupeliuKiekis;
	}

	public void setKavosPupeliuKiekis(double kavosPupeliuKiekis) {
		this.kavosPupeliuKiekis = kavosPupeliuKiekis;
	}

	public double getVandensKiekis() {
		return vandensKiekis;
	}

	public void setVandensKiekis(double vandensKiekis) {
		this.vandensKiekis = vandensKiekis;
	}

	public int getPanaudojimuSkaicius() {
		return panaudojimuSkaicius;
	}

	public void setPanaudojimuSkaicius(int panaudojimuSkaicius) {
		this.panaudojimuSkaicius = panaudojimuSkaicius;
	}

	
	//konstruktoriai
	public KavosAparatas(){
		
	}
	
	public KavosAparatas(int panaudojimuSkaicius) {
		System.out.println("Konstruktorius su panaudojimu skaiciumi - " + panaudojimuSkaicius);
	}
	
	
	//papildymo metodai
	public void papildytiVandeniu(double vanduo){
		this.setVandensKiekis(vanduo);
	}
	
	public void papildytiPupelemis(double pupeles) {
		this.setKavosPupeliuKiekis(pupeles);
	}
	
	public void papildytiCukrumi(double cukrus) {
		this.setCukrausKiekis(cukrus);
	}
	
	//kavos gaminimo metodai
	public void gamintiKava(String kavosTipas) {
		//patikrinti ar laikas plauti
		if("Paprasta".equals(kavosTipas)) {
			gamintiKavosPuodeli(10.0, 100.0, 30.0, kavosTipas);
		} else if("Ekonomine".equals(kavosTipas)) {
			gamintiKavosPuodeli(1.0, 90.5, 15.3, kavosTipas);
		} else if("Espresso".equals(kavosTipas)) {
			gamintiKavosPuodeli(0, 50.0, 60.0, kavosTipas);
		} else {
			System.out.println("Neteisingai ivesta kavos rusis");
		}
		if(panaudojimuSkaicius >= PANAUDOJIMU_SKAICIAUS_RIBA) {
			System.out.println("Praplaukite kavos aparata");
		}
	}

	private void gamintiKavosPuodeli(double cukrus, double vanduo, double kavosPupeles, String kavosTipas) {
		if(this.cukrausKiekis >= cukrus && this.vandensKiekis >= vanduo && this.kavosPupeliuKiekis >= kavosPupeles) {
			this.cukrausKiekis -= cukrus;
			this.vandensKiekis -= vanduo;
			this.kavosPupeliuKiekis -= kavosPupeles;
			panaudojimuSkaicius++;
			System.out.println("Pagamintas " + kavosTipas + " kavos puodelis");
		} else {
			System.out.println("Aparate truksta resursu");
		}
	}
	
	//kavos aparato plovimas
	public void atliktiPlovima() {
		this.panaudojimuSkaicius = 0;
		
	}
	
	//Ar pasiruoses veikti?
	public boolean arPasiruosesVeikti() {
		if(this.cukrausKiekis >= 10 && this.vandensKiekis >= 100
				&& this.kavosPupeliuKiekis >= 60 && this.panaudojimuSkaicius < PANAUDOJIMU_SKAICIAUS_RIBA) {
			return true;
		}
		return false;
	}

	public void produktuLikutis() {
		System.out.print("Siuo metu aparate yra " + this.cukrausKiekis + " cukraus, " + this.vandensKiekis + " vandens, " + this.kavosPupeliuKiekis + " ir kavos pupeliu.");
		
	}

	public void aparatoBusena() {
		produktuLikutis();
		System.out.print(" Iki plovimo liko " + (PANAUDOJIMU_SKAICIAUS_RIBA - this.panaudojimuSkaicius));
		
	}
	
	public void gaminkKava() {
		Ekonomine e = new Ekonomine();
		System.out.println(e + " - cia yra Ekonomine pasitikrinimui");
		Espresso es = new Espresso();
		System.out.println(es + " - cia yra Espresso pasitikrinimui");
	}
	
	public String gaminkKava(String kavosRusis, KavosPuodelis p) {
		//Paprasta p = new Paprasta();
		this.cukrausKiekis -= p.getCukrausKiekis();
		this.vandensKiekis -= p.getVandensKiekis();
		this.kavosPupeliuKiekis -= p.getKavosPupeliuKiekis();
		panaudojimuSkaicius++;
		p.setArKavaPagaminta(true);
		return p.getKavosPavadinimas();
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
}
