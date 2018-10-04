package lt.gaidukevicius;

public class PicosProduktai {
	private int padas;
	private int suris;
	private int grybai;
	private int kumpis;
	private int desra;
	private int padazas;
	
	//konstruktorius. Pagrindinis likuciu nustatymo konstruktorius
	public PicosProduktai(int padas, int suris, int grybai, int kumpis, int desra, int padazas){
		this.padas = padas;
		this.suris = suris;
		this.grybai = grybai;
		this.kumpis = kumpis;
		this.desra = desra;
		this.padazas = padazas;
		
	}
	
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
	
	

}
