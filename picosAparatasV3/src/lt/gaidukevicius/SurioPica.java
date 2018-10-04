package lt.gaidukevicius;

public class SurioPica extends Pica {
	
	
	public SurioPica() {
		this.setPadas(1);
		this.setSuris(3);
		this.setGrybai(0);
		this.setKumpis(0);
		this.setDesra(0);
		this.setPadazas(1);
	}
	
	
	
	public SurioPica(int padas, int suris, int grybai, int kumpis, int desra, int padazas){
		this.setPadas(padas);
		this.setSuris(suris);
		this.setGrybai(grybai);
		this.setKumpis(kumpis);
		this.setDesra(desra);
		this.setPadazas(padazas);
	}
}
