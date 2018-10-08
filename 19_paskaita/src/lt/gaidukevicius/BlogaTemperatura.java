package lt.gaidukevicius;

public class BlogaTemperatura extends Exception{
	
	public int temperaturosVerte;
	public String ligonioVardas;
	
	public BlogaTemperatura(String ligonioVardas, int temperaturosVerte) {
        super();
        this.temperaturosVerte = temperaturosVerte;
        this.ligonioVardas = ligonioVardas;
    }
	

	

}