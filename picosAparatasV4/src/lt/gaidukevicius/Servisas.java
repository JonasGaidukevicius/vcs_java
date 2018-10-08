package lt.gaidukevicius;

import java.util.ArrayList;
import java.util.List;

public class Servisas {
	List<Pica> picuReceptai = new ArrayList<>();
	List<PicosAparatas> picuAparatai = new ArrayList<>();

	//konstruktorius
	//kol kas nieko nera
	
	public void prideduPicosAparata(String pavadinimas) {
		picuAparatai.add(new PicosAparatas(pavadinimas));
	}
	
	public void atspausdinkPicosAparatuSarasa() {
		for(int i = 0; i < picuAparatai.size(); i++) {
			picuAparatai.get(i).atspausdinkApieSave();
		}
		
	}
	
	public void prideduPicosRecepta(String pavadinimas, int padas, int suris, int grybai, int kumpis, int padazas) {
		picuReceptai.add(new Pica(pavadinimas, padas, suris, grybai, kumpis, padazas));
	}
	
	public void atspausdinkPicuReceptus() {
		for(int i = 0; i < picuReceptai.size(); i++) {
			picuReceptai.get(i).atspausdinkApieSave();
		}
	}
	
}

