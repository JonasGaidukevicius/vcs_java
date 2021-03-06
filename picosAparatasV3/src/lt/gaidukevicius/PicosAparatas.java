package lt.gaidukevicius;

public class PicosAparatas {
	private int padas;
	private int suris;
	private int grybai;
	private int kumpis;
	private int desra;
	private int padazas;
	private int skaitliukas = 0;
	
	//konstruktoriusdefault - visi kintamieji yra lygus 0.
	
	//seteriai ir geteriai
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
	public int getDesra() {
		return desra;
	}
	public void setDesra(int desra) {
		this.desra = desra;
	}
	public int getPadazas() {
		return padazas;
	}
	public void setPadazas(int padazas) {
		this.padazas = padazas;
	}
	
	public int getSkaitliukas() {
		return skaitliukas;
	}
	public void setSkaitliukas(int skaitliukas) {
		this.skaitliukas = skaitliukas;
	}
	public boolean gaminuPica(int picosTipas, int picosDydis, PicosProduktai produktuLikuciai) {
		//CIA DAR TURI PATIKRINTI AR SKAITLIUKAS NERA 20 IR AR NEREIKIA VALYTI AUTOMATO
		
		
		
		//kokie tos picos produktai
		if(picosTipas == 1) {
			SurioPica surioPica = new SurioPica(); 
			this.padas = surioPica.getPadas();
			this.suris = surioPica.getSuris();
			this.grybai = surioPica.getGrybai();
			this.kumpis = surioPica.getKumpis();
			this.desra = surioPica.getDesra();
			this.padazas = surioPica.getPadazas(); 
		} else if( picosTipas == 2) {
			GrybuPica grybuPica = new GrybuPica();
			this.padas = grybuPica.getPadas();
			this.suris = grybuPica.getSuris();
			this.grybai = grybuPica.getGrybai();
			this.kumpis = grybuPica.getKumpis();
			this.desra = grybuPica.getDesra();
			this.padazas = grybuPica.getPadazas(); 
		}
		//patikrinti ar tiek produktu yra
			if(this.padas * picosDydis <= produktuLikuciai.getPadas() && this.suris * picosDydis <= produktuLikuciai.getSuris() &&
					this.grybai * picosDydis <= produktuLikuciai.getGrybai() && this.kumpis * picosDydis <= produktuLikuciai.getKumpis() &&
					this.desra * picosDydis <= produktuLikuciai.getDesra() && this.padazas * picosDydis <= produktuLikuciai.getPadazas()) {
				//gaminu pica
				produktuLikuciai.setPadas(produktuLikuciai.getPadas() - this.padas * picosDydis);
				produktuLikuciai.setSuris(produktuLikuciai.getSuris() - this.suris * picosDydis);
				produktuLikuciai.setGrybai(produktuLikuciai.getGrybai() - this.grybai * picosDydis);
				produktuLikuciai.setKumpis(produktuLikuciai.getKumpis() - this.kumpis * picosDydis);
				produktuLikuciai.setDesra(produktuLikuciai.getDesra() - this.desra * picosDydis);
				produktuLikuciai.setPadazas(produktuLikuciai.getPadazas() - this.padazas * picosDydis);
				
				System.out.println("Jusu pica iskepta. Skanaus");
				this.setSkaitliukas(this.getSkaitliukas()+1); // prasisuka pagamintu picu skaitliukas
			} else {
				System.out.println("Norimai picai pagaminti neuztenka produktu. Pasirinkite kita pica");
				return false;
			}
			if(this.getSkaitliukas() >= 20) {
				System.out.println("Aparatas iskepe 20 picu. Reikalingas valymas");
			}
			return true;
	}
	
	public void valauPicosAparata() {
		this.setSkaitliukas(0);
		System.out.println("Picos aparatas i�valytas");
	}
	
	
}
