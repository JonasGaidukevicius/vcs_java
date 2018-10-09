package lt.gaidukevicius;

public class Pica {
	private String picosPavadinimas;
	private int padas;
	private int suris;
	private int grybai;
	private int kumpis;
	private int padazas;
	
	
	public Pica (String pavadinimas, int padas, int suris, int grybai, int kumpis, int padazas) {
		this.picosPavadinimas = pavadinimas;
		this.padas = padas;
		this.suris = suris;
		this.grybai = grybai;
		this.kumpis = kumpis;
		this.padazas = padazas;
	}
	
	//seteriai ir geteriai
	public String getPicosPavadinimas() {
		return picosPavadinimas;
	}

	public void setPicosPavadinimas(String picosPavadinimas) {
		this.picosPavadinimas = picosPavadinimas;
	}

	public int getPadas() {
		return padas;
	}

	public void setPadas(int padas) {
		this.padas = padas;
	}

	public int getSuris() {
		return suris;
	}

	public void setSuris(int suris) {
		this.suris = suris;
	}

	public int getGrybai() {
		return grybai;
	}

	public void setGrybai(int grybai) {
		this.grybai = grybai;
	}

	public int getKumpis() {
		return kumpis;
	}

	public void setKumpis(int kumpis) {
		this.kumpis = kumpis;
	}

	public int getPadazas() {
		return padazas;
	}

	public void setPadazas(int padazas) {
		this.padazas = padazas;
	}

	
	public void atspausdinkApieSave() {
		System.out.println("Pica: " + picosPavadinimas);
		//System.out.println("Pica: " + picosPavadinimas + " " + padas + " " + suris + " " + grybai + " " + kumpis + " " + padazas);
		
	}
}
