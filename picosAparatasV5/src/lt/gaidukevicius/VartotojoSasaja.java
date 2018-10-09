package lt.gaidukevicius;

import java.util.Scanner;

public class VartotojoSasaja {

	public static void main(String[] args) {
		Servisas servisas = new Servisas();
		Scanner input = new Scanner(System.in);
		boolean programaVeikia = true;
		int programa = 0;
		while (programaVeikia) {
			while (programa < 1 || programa > 3) {
				System.out.println("Ka noretumete daryti?");
				System.out.println("Kepti pica (1) | Vykdyti aptarnavima (2) | Uzbaigti darba (3)");
				programa = input.nextInt();
				if (programa == 1) {
					noriuKeptiPica(servisas);
					programa = 0;
				} else if (programa == 2) {
					noriuAptarnauti(servisas);
					programa = 0;
				} else if (programa == 3) {
					System.out.println("Aciu, kad naudojotes. Lauksime sugriztant.");
					programaVeikia = false;
				} else {
					System.out.println("Neteisingas pasirinkimas");
				}
			}
		}
	}

	// cia eina 1 pagrindinio meniu pasirinkimas
	public static void noriuKeptiPica(Servisas servisas) {
		//Dar nera ispildytas picos aparato pasirinkimas
		int pasirinkimas = picosPasirinkimas(servisas);
		if(pasirinkimas != -1) {
			int dydis = dydzioPasirinkimas();
			servisas.picuAparatai.get(0).kepuPica(servisas.picuReceptai.get(pasirinkimas - 1), dydis);
		}	
	}

	public static int picosPasirinkimas(Servisas servisas) {
		Scanner input = new Scanner(System.in);
		int pasirinkimas = 0;
		if(servisas.picuReceptai.size() == 0) {
			System.out.println("Picu receptu nera. Sukurkite bent viena pries kepant pica");
			return -1;
		}else if(servisas.picuAparatai.size() == 0) {
			System.out.println("Nera picu aparatu. Sukurkite bent viena pries kepant pica");
			return -1;
		}
		
		else {
			while (pasirinkimas < 1 || pasirinkimas > servisas.picuReceptai.size()) {
				servisas.atspausdinkPicuReceptus();
				System.out.println("Kokios picos noretumete (skaicius)? ");
				pasirinkimas = input.nextInt();
				if (pasirinkimas >= 1 && pasirinkimas <= servisas.picuReceptai.size()) {
					return pasirinkimas;
				} else {
					System.out.println("Neteisingas pasirinkimas");
				}
			}
			return pasirinkimas;
		}

		
	}

	public static int dydzioPasirinkimas() {
		Scanner input = new Scanner(System.in);
		int dydis = 0;
		while (dydis < 1 || dydis > 3) {
			System.out.println("Kokio dydzio picos noretumete (1 - 3): ");
			dydis = input.nextInt();
			if (dydis >= 1 && dydis <= 3) {
				return dydis;
			} else {
				System.out.println("Neteisingas pasirinkimas");
			}
		}
		return dydis;
	}

	// Cia eina 2 pagrindinio meniu pasirinkimas
	public static void noriuAptarnauti(Servisas servisas) {
		int servisoTipas = 0;
		Scanner input = new Scanner(System.in);
		while (servisoTipas < 1 || servisoTipas > 4) {
			System.out.println("Koki aptarnavima norite atlikti?");
			System.out.println(
					"Isvalyti picos aparata (1) | Ivesti nauja picos recepta (2) | Sukurti nauja picos aparata (3) | istrinti picos aparata (4)");
			servisoTipas = input.nextInt();
			if (servisoTipas >= 1 && servisoTipas <= 4) {
				break;
			} else {
				System.out.println("Neteisingas pasirinkimas");
			}
		}
		switch (servisoTipas) {
		case 1:
			System.out.println("Isvalyti picos aparata");
			break;
		case 2:
			ivestiNaujaPicosRecepta(servisas);
			break;
		case 3:
			ivestiNaujaPicosAparata(servisas);
			servisas.atspausdinkPicosAparatuSarasa();
			break;
		case 4:
			istrintiPicosAparata(servisas);
			servisas.atspausdinkPicosAparatuSarasa();
			break;
		default:
			System.out.println("Kazkas negerai");
		}
	}

	

	

	public static void ivestiNaujaPicosRecepta(Servisas servisas) {
		// kuriamas picos receptas
		Scanner input = new Scanner(System.in);
		System.out.println("Iveskite picos pavadinima: ");
		String picPav = input.nextLine();
		System.out.println("Iveskite padu kieki: ");
		int pd = input.nextInt();
		System.out.println("Iveskite surio kieki: ");
		int sr = input.nextInt();
		System.out.println("Iveskite grybu kieki: ");
		int gr = input.nextInt();
		System.out.println("Iveskite kumpio kieki: ");
		int km = input.nextInt();
		System.out.println("Iveskite padazo kieki: ");
		int pz = input.nextInt();
		servisas.prideduPicosRecepta(picPav, pd, sr, gr, km, pz);
		servisas.atspausdinkPicuReceptus();
	}
	
	public static void ivestiNaujaPicosAparata(Servisas servisas) {
		Scanner input = new Scanner(System.in);
		System.out.print("Iveskite picos aparato pavadinima: ");
		String picosAparatoPavadinimas = input.nextLine();
		servisas.prideduPicosAparata(picosAparatoPavadinimas);
		
	}
	
	
	public static void istrintiPicosAparata(Servisas servisas) {
		Scanner input = new Scanner(System.in);
		if(servisas.picuAparatai.size() == 0) {
			System.out.println("Nera picu aparatu, kuriuos butu galima istrinti");
		} else {
			servisas.atspausdinkPicosAparatuSarasa();
			System.out.print("Kuri picos aparata norite istrinti? ");
			int choice = input.nextInt();
			servisas.picuAparatai.remove(choice);
		}	
	}

}
