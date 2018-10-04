package lt.gaidukevicius;

public class TransportoPriemone {
	
	boolean arJuda;
	private int vietuSkaicius;
	private int uzimtuVietuSkaicius;
	
	public boolean arJuda() {
		return false;
	}
	
	public boolean sodinkKeleivi() {
		if(uzimtuVietuSkaicius < vietuSkaicius) {
			uzimtuVietuSkaicius++;
		}
	
	
}
