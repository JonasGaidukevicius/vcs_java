package lt.gaidukevicius;

public class Kamuolys {
	
	static{
		System.out.println("Klases inicializavimo pradzia");
	}
	
	
	{
		System.out.println("Objekto inicializavimo pradzia");
	}
	protected int svoris = 99;
	private String spalva;
	private double skersmuo;
	
	{
		System.out.println(svoris);
		System.out.println(spalva);
		System.out.println(skersmuo);
	}
	
	//konstruktorius
	public Kamuolys(int svoris) {
		this(svoris, "Juoda");
		System.out.println("1 parametru konstruktorius");
		
	}
	
	public Kamuolys(int svoris, String spalva) {
		this(svoris, spalva, 1.26);
		System.out.println("2 parametru konstruktorius");
	}

	public Kamuolys() {
		this(99);
		System.out.println("0 parametru konstruktorius");
		
	}
	
	public Kamuolys(int svoris, String spalva, double skersmuo) {
		super();
		this.svoris = svoris;
		this.spalva = spalva;
		this.skersmuo = skersmuo;
		System.out.println("3 parametru konstruktorius");
	}
	
	public void test() {
		
	}
	
}
