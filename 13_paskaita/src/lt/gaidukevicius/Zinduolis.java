package lt.gaidukevicius;



public class Zinduolis {

	private String rusis;
	
	public String getRusis() {
		return rusis;
	}

	public void setRusis(String rusis) {
		this.rusis = rusis;
	}

	public Zinduolis() {
		System.out.println("Cia yra zinduolio konstruktorius");
		this.setRusis("Baltauodegis");
	}
	
	public void valgyti() {
		System.out.println("Zinduoliai valgo");
		
	}
}
