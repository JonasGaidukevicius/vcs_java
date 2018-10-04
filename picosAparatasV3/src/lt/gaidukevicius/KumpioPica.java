package lt.gaidukevicius;

public class KumpioPica extends Pica {
	
	
	public KumpioPica() {
		this.setPadas(1);
		this.setSuris(1);
		this.setGrybai(2);
		this.setKumpis(0);
		this.setDesra(0);
		this.setPadazas(1);
	}
	
	
	
	public KumpioPica(int padas, int suris, int grybai, int kumpis, int desra, int padazas){
		this.setPadas(padas);
		this.setSuris(suris);
		this.setGrybai(grybai);
		this.setKumpis(kumpis);
		this.setDesra(desra);
		this.setPadazas(padazas);
	}
}
