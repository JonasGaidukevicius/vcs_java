package lt.gaidukevicius;

public class Taskas {
	
	private double x;
	private double y;
	private String spalva;
	
	
	public Taskas() {
		System.out.println("Konstruktorius be parametru");
	}
	
	public Taskas(double x, double y) {
		System.out.println("Konstruktorius su x ir y");
		this.x = x;
		this.y = y;
	}
	
	public Taskas(double x, double y, String spalva) {
		System.out.println("Konstruktorius su x, y ir spalva");
		this.x = x;
		this.y = y;
		this.spalva = spalva;
	}
	
	public Taskas(String spalva) {
		System.out.println("Konstruktorius tik su spalva");
		this.spalva = spalva;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x; //raktazodis this reiskia sitas objektas
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}


	public String getSpalva() {
		return spalva;
	}


	public void setSpalva(String spalva) {
		this.spalva = spalva;
	}
	
	public double atstumasIkiKitoTasko(double xPradinis, double yPradinis, double xGalutinis, double yGalutinis) {
		return Math.sqrt(Math.pow((xPradinis - xGalutinis), 2) + Math.pow((yPradinis - yGalutinis), 2));
	}
	
	public int vietaKetvirtyje() {
		if(x > 0 && y > 0) {
			return 1;
		} else if(x < 0 && y > 0) {
			return 2;
		} else if(x < 0 && y < 0) {
			return 3;
		} else if(x > 0 && y < 0) {
			return 4;
		}
		return 0;
	}
	
	public boolean arPriklausoTamPaciamKetvirciui(Taskas tsk, Taskas tskGalutinis) {
		if(tsk.vietaKetvirtyje() == tskGalutinis.vietaKetvirtyje()) {
			return true;
		}
		return false;
	}
}
