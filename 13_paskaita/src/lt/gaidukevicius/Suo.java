package lt.gaidukevicius;

public class Suo extends Zinduolis{
	
	public Suo() {
		super();
	}
	
	@Override
	public void valgyti() {
		System.out.println("Sunys valgo");
		//super.valgyti();//pakvieciu tevines klases metoda
		System.out.println("Rusis yra " + super.getRusis());
	
	}
}
