package lt.vcs.andrius.playground;

public class Kamuolys {
	
	
	
	{
		System.out.println("Objekto inicializavimo pradzia");
	}
	
	{
		System.out.println("Inicializavimas 2");
	}
	
	private Kamuolys(int svoris, String spalva, double skersmuo) {
		System.out.println("Pagrindinis konstruktorius");
		if(svoris > this.svoris) {
			this.svoris = svoris;
		}
		this.spalva = spalva;
		this.skersmuo = skersmuo;
		test();
	}

	public Kamuolys(int svoris) {
		this(svoris, "Juoda2", 1.26);
	}
	
	static {
		System.out.println("Klases inicializavimo pradzia");
	}
	
	
	public Kamuolys() {
		this(99);
	}
	
	public void test() {
		System.out.println("test metodas");
	}
	
	
	protected int svoris = 99;
	private String spalva;
	private double skersmuo;
	
	{
		System.out.println(svoris);
		System.out.println(spalva);
		System.out.println(skersmuo);
	}
	
	
	
}
