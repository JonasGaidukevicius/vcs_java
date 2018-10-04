package lt.gaidukevicius;

public class KitiPavyzdziai {

	public static void main(String[] args) {
		String hello = "Hello World!";
		String specialChars = "\r \n \t \" \' \\";
		String empty = " ";
		char [] charArray = {'a', 'b', 'c'};
		String string = new String (charArray);
		char [] charsFromString = string.toCharArray();
		String zeros = "\u0000 \u0000";
		
		System.out.print("Pradžia : " + specialChars);
		System.out.print("Pirmas tekstas");
		System.out.print("\r");
		System.out.print("Antras");
	}

}
