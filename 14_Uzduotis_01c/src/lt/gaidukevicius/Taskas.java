package lt.gaidukevicius;

public class Taskas {
	private double xKoordinate = 0;
	private double yKoordinate = 0;
	
	//get ir set
	public double getxKoordinate() {
		return xKoordinate;
	}
	public void setxKoordinate(double xKoordinate) {
		this.xKoordinate = xKoordinate;
	}
	public double getyKoordinate() {
		return yKoordinate;
	}
	public void setyKoordinate(double yKoordinate) {
		this.yKoordinate = yKoordinate;
	}
	// get ir set pasibaigia
	
	
	//Tikrinu ar kvadratas
	public boolean arKvadratas(Taskas aTaskas, Taskas bTaskas, Taskas cTaskas, Taskas dTaskas) {
		double atstumasNuoAikiD = 0;
		double atstumasNuoBikiC = 0;
		
		atstumasNuoAikiD = Math.sqrt(Math.pow((dTaskas.xKoordinate - aTaskas.xKoordinate), 2) + Math.pow((dTaskas.yKoordinate - aTaskas.yKoordinate), 2));
		System.out.println("Atstumas nuo a iki b yra " + atstumasNuoAikiD);
		
		atstumasNuoBikiC = Math.sqrt(Math.pow((cTaskas.xKoordinate - bTaskas.xKoordinate), 2) + Math.pow((cTaskas.yKoordinate - bTaskas.yKoordinate), 2)); 
		System.out.println("Atstumas nuo a iki c yra " + atstumasNuoBikiC);
		
		return (atstumasNuoAikiD == atstumasNuoBikiC);
	}
	public boolean arKerta(Taskas aTaskas, Taskas bTaskas, Taskas cTaskas, Taskas dTaskas, Taskas eTaskas,
			Taskas fTaskas) {
		double susikirtimoTaskasA = 0;
		double susikirtimoTaskasB = 0;
		susikirtimoTaskasA = ((eTaskas.yKoordinate - fTaskas.yKoordinate) * (aTaskas.xKoordinate - eTaskas.xKoordinate) + 
							(fTaskas.xKoordinate - eTaskas.xKoordinate) * (aTaskas.yKoordinate - eTaskas.yKoordinate)) / 
							((fTaskas.xKoordinate - eTaskas.xKoordinate) * (aTaskas.yKoordinate - bTaskas.yKoordinate) -
							(aTaskas.xKoordinate - bTaskas.xKoordinate) * (fTaskas.yKoordinate - eTaskas.yKoordinate));
		susikirtimoTaskasB = ((aTaskas.yKoordinate - bTaskas.yKoordinate) * (aTaskas.xKoordinate - eTaskas.xKoordinate) +
							(bTaskas.xKoordinate - aTaskas.xKoordinate) * (aTaskas.yKoordinate - eTaskas.yKoordinate)) /
							((fTaskas.xKoordinate - eTaskas.xKoordinate) * (aTaskas.yKoordinate - bTaskas.yKoordinate) -
							(aTaskas.xKoordinate - bTaskas.xKoordinate) * (fTaskas.yKoordinate - eTaskas.yKoordinate));
		System.out.println("Pirmas taskas yra " + susikirtimoTaskasA + " o antras - " + susikirtimoTaskasB);
		
		
		return true;
		
	}
	
	
}
