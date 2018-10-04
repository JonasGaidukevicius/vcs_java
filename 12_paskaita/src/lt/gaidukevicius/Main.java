package lt.gaidukevicius;

public class Main {

	public static void main(String[] args) {
		
		KavosAparatas ka = new KavosAparatas();
		ka.papildytiVandeniu(500.0);
		ka.papildytiPupelemis(200.0);
		ka.papildytiCukrumi(150.05); 
		//Paprasta, Ekonomine, Espresso
		ka.gamintiKava("Paprasta");
		ka.gamintiKava("Ekonomine");
		//ka.atliktiPlovima();
		ka.arPasiruosesVeikti();
		ka.produktuLikutis();
		ka.aparatoBusena();
		KavosAparatas kk = new KavosAparatas(1);
	}

}
