package lt.gaidukevicius;

public class KavosPuodelis extends Puodelis {
	
	private double cukrausKiekis;
	private double kavosPupeliuKiekis;
	private double vandensKiekis;
	
	private String kavosPavadinimas;
	private boolean arKavaPagaminta;
	
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

	public String getKavosPavadinimas() {
		return kavosPavadinimas;
	}

	public void setKavosPavadinimas(String kavosPavadinimas) {
		this.kavosPavadinimas = kavosPavadinimas;
	}

	public boolean isArKavaPagaminta() {
		return arKavaPagaminta;
	}

	public void setArKavaPagaminta(boolean arKavaPagaminta) {
		this.arKavaPagaminta = arKavaPagaminta;
	}

	public String toString() {
		return null;
	}
	
}
