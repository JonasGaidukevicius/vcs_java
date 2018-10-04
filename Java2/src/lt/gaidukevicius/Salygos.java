package lt.gaidukevicius;

public class Salygos {

	public static void main(String[] args) {
		int i = 55;
		
		//galima uzrasyti viena eilute, jeigu tik viena komanda reikia ivykdyti, jeigu salyga yra TRUE
		if(i == 0) System.out.println("i == 0");
		
		//o galima su bloku parasyti
		if(i > 0) {
			System.out.println("i > 0");
		}
		
		//su operatoriumi IR
		if(i > 0 && i <50) {
			System.out.println("i yra tarp 0 ir 50");
		} else {
			System.out.println("Kita");
		}
		
		//switch
		switch(i) {
		case (0):{
			System.out.println("i yra 0");
			break;
		}
		case (55):{
			System.out.println("i yra 55");
			break;
		}
		default:
			break;
		}
	}

}
