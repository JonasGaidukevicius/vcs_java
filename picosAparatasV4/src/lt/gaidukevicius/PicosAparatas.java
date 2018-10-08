package lt.gaidukevicius;

public class PicosAparatas {
	
	private String picosAparatoPavadinimas;
	private int padas;
	private int suris;
	private int grybai;
	private int kumpis;
	private int padazas;
	private int skaitliukas = 20;
	
	//Kiekviena karta, kai kuriu objekta PicosAparatas, tai sukuriu toki pati aparata su tokiais paciais lukuciais
	PicosAparatas(String picosAparatoPavadinimas){
		this.picosAparatoPavadinimas = picosAparatoPavadinimas;
		this.padas = 0;
		this.suris = 10;
		this.grybai = 10;
		this.kumpis = 10;
		this.padazas = 10;
		this.skaitliukas = 20;
		
	}
	
	public void atspausdinkApieSave() {
		System.out.println(picosAparatoPavadinimas + " " + padas + " " + suris + " " + grybai + " " + kumpis + " " + padazas + " " + skaitliukas);
		
	}
	
	public void kepuPica(Pica receptas, int dydis) {
		if(this.skaitliukas == 20) {
			if(receptas.getPadas() <= this.padas && receptas.getSuris() <= this.suris && receptas.getGrybai() <= this.grybai &&
					receptas.getKumpis() <= this.kumpis && receptas.getPadazas() <= this.padazas) {
					System.out.println("Iskepiau pica. Skanaus!");
					this.padas -= receptas.getPadas();
					this.suris -= receptas.getSuris();
					this.grybai -= receptas.getGrybai();
					this.kumpis -= receptas.getKumpis();
					this.padazas -= receptas.getPadazas();
					this.skaitliukas++;
					if(skaitliukas == 20) {
						System.out.println("Aparatas iškepe 20 picu. Reikalinga ji isvalyti");
					}
				} else {
					System.out.println("Aparate neuztenka produktu, kad iskepti Jusu norima pica. Pasirinkite kita.");
				}
		}else {
			System.out.println("Sis picos aparatas turi buti isvalytas, kad butu galima su juo kepti.");
		}
	}

}
