package lt.gaidukevicius;

public class GrybuPicosAparatas extends PicosAparatas {

	GrybuPicosAparatas(){
		this.setPadas(50);
		this.setSuris(50);
		this.setPievagrybiai(50);
		this.setPadazas(50);
		this.setSkaitliukas(0);
		
	}
	
	
	
	
	public boolean arYraProduktu(int dydis) {
		switch (dydis) {
		case 1:
			if(this.getPadas() >= 1 && this.getSuris() >= 4 && this.getPadazas() >= 1) {
				return true;
			} else {
				return false;
			}
			//break;
		case 2:
			if(this.getPadas() >= 2 && this.getSuris() >= 6 && this.getPadazas() >= 2) {
				return true;
			} else {
				return false;
			}
		case 3:
			if(this.getPadas() >= 1 && this.getSuris() >= 4 && this.getPadazas() >= 1) {
				return true;
			} else {
				return false;
			}
		}
		return false; //kazkodel reikalauja is manes RETURN'o
		//cia baigiasi tikrinimo metodas
		
		
	}
}
