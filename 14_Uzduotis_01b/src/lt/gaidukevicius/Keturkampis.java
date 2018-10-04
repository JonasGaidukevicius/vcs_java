package lt.gaidukevicius;

public class Keturkampis {
	private double aTaskasXKoordinate = 0;
	private double aTaskasYKoordinate = 0;
	private double bTaskasXKoordinate = 0;
	private double bTaskasYKoordinate = 0;
	private double cTaskasXKoordinate = 0;
	private double cTaskasYKoordinate = 0;
	private double dTaskasXKoordinate = 0;
	private double dTaskasYKoordinate = 0;
	public double getaTaskasXKoordinate() {
		return aTaskasXKoordinate;
	}
	public void setaTaskasXKoordinate(double aTaskasXKoordinate) {
		this.aTaskasXKoordinate = aTaskasXKoordinate;
	}
	public double getaTaskasYKoordinate() {
		return aTaskasYKoordinate;
	}
	public void setaTaskasYKoordinate(double aTaskasYKoordinate) {
		this.aTaskasYKoordinate = aTaskasYKoordinate;
	}
	public double getbTaskasXKoordinate() {
		return bTaskasXKoordinate;
	}
	public void setbTaskasXKoordinate(double bTaskasXKoordinate) {
		this.bTaskasXKoordinate = bTaskasXKoordinate;
	}
	public double getbTaskasYKoordinate() {
		return bTaskasYKoordinate;
	}
	public void setbTaskasYKoordinate(double bTaskasYKoordinate) {
		this.bTaskasYKoordinate = bTaskasYKoordinate;
	}
	public double getcTaskasXKoordinate() {
		return cTaskasXKoordinate;
	}
	public void setcTaskasXKoordinate(double cTaskasXKoordinate) {
		this.cTaskasXKoordinate = cTaskasXKoordinate;
	}
	public double getcTaskasYKoordinate() {
		return cTaskasYKoordinate;
	}
	public void setcTaskasYKoordinate(double cTaskasYKoordinate) {
		this.cTaskasYKoordinate = cTaskasYKoordinate;
	}
	public double getdTaskasXKoordinate() {
		return dTaskasXKoordinate;
	}
	public void setdTaskasXKoordinate(double dTaskasXKoordinate) {
		this.dTaskasXKoordinate = dTaskasXKoordinate;
	}
	public double getdTaskasYKoordinate() {
		return dTaskasYKoordinate;
	}
	public void setdTaskasYKoordinate(double dTaskasYKoordinate) {
		this.dTaskasYKoordinate = dTaskasYKoordinate;
	}
	
	public boolean arKvadratas(double aTaskasXKoordinate, double aTaskasYKoordinate, double bTaskasXKoordinate,
			double bTaskasYKoordinate, double cTaskasXKoordinate, double cTaskasYKoordinate, double dTaskasXKoordinate,
			double dTaskasYKoordinate) {
		
		double atstumasNuoAikiD = 0;
		double atstumasNuoBikiC = 0;
		
		
		atstumasNuoAikiD = Math.sqrt(Math.pow((dTaskasXKoordinate - aTaskasXKoordinate), 2) + Math.pow((dTaskasYKoordinate - aTaskasYKoordinate), 2)); 
		System.out.println("Atstumas nuo a iki b yra " + atstumasNuoAikiD);
		
		atstumasNuoBikiC = Math.sqrt(Math.pow((cTaskasXKoordinate - bTaskasXKoordinate), 2) + Math.pow((cTaskasYKoordinate - bTaskasYKoordinate), 2)); 
		System.out.println("Atstumas nuo a iki c yra " + atstumasNuoBikiC);
				
		return (atstumasNuoAikiD == atstumasNuoBikiC);
		
	}
	
	
}
