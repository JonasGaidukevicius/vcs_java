package lt.gaidukevicius;

import java.util.Scanner;

public class Bankomatas {

	private int pinigai;
	private int isimama;
	private int operacijosTipas;
	private int bandymuSkaicius;
	public static final String PINAS = "testas";
	Scanner input = new Scanner(System.in); // ar gerai cia padaryta? Kad nereiketu kiekviename metode vel to paties
											// rasyti. Kodel nesako, kad jis neuzdarytas?

	// set ir get
	public int getPinigai() {
		return pinigai;
	}

	public void setPinigai(int pinigai) {
		this.pinigai = pinigai;
	}

	public int getIsimama() {
		return isimama;
	}

	public void setIsimama(int isimama) {
		this.isimama = isimama;
	}

	public int getOperacijosTipas() {
		return operacijosTipas;
	}

	public void setOperacijosTipas(int operacijosTipas) {
		this.operacijosTipas = operacijosTipas;
	}

	public int getBandymuSkaicius() {
		return bandymuSkaicius;
	}

	public void setBandymuSkaicius(int bandymuSkaicius) {
		this.bandymuSkaicius = bandymuSkaicius;
	}

	// konstruktorius
	Bankomatas(int pinigai, int bandymuSkaicius, int operacijosTipas) {
		this.pinigai = pinigai;
		this.bandymuSkaicius = bandymuSkaicius;
		this.operacijosTipas = operacijosTipas;
	}

	//tikrinu ar ivestas teisingas pin
	public boolean tikrinuPin() {
		int bandymas = 1;
		System.out.println("Iveskite savo pin koda:");
		while (bandymas <= 3) {
			String ivestasPin = input.nextLine();
			if (ivestasPin.equals(PINAS)) {
				return true;
			} else {
				if (bandymas < 3) {
					System.out.println("Ivestas slaptazodis neteisingas. Bandykite dar karta.");
				} else {
					System.out.println("3 kartus suvestas neteisingas pin. Saskaita uzblokuota.");
				}
				bandymas++;
			}
		}
		return false;
	}

	//isgryninu pinigus
	public void isgryninu() {
		int suma;
		System.out.println("Kiek pinigu norite isigryninti?");
		suma = input.nextInt();
		if (suma <= this.pinigai) {
			//this.pinigai -= suma;
			// reikia reiksmes nustatineti per set metoda
			this.setPinigai(this.pinigai - suma);
			System.out.println("Jus isigryninote " + suma + " pinigu. Bankomate liko " + this.pinigai + " pinigu.");
			if(this.pinigai < 10) {
				System.out.println("Operacija baigta. Aciu.");
			}
		} else {
			System.out.println("Bankomate nera tiek pinigu");
		}
	}

}
