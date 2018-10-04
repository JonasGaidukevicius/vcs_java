package lt.gaidukevicius;

public class Puodelis {
	
	private int maksimaliPuodelioTalpa;
	
	public int getMaksimaliPuodelioTalpa() {
		return maksimaliPuodelioTalpa;
	}

	public void setMaksimaliPuodelioTalpa(int maksimaliPuodelioTalpa) {
		this.maksimaliPuodelioTalpa = maksimaliPuodelioTalpa;
	}

	public void rodykInformacija() {
		System.out.println("Maksimali puodelio talpa yra " + this.getMaksimaliPuodelioTalpa());
	}
}
