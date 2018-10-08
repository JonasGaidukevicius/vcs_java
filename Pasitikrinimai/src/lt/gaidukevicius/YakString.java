package lt.gaidukevicius;

public class YakString {

	public static void main(String[] args) {
		System.out.println(stringYak("HiyakHi"));

	}

	public static String stringYak(String str) {
		String newString = "";
		if (str.length() >= 3) {
			for (int i = 0; i < str.length(); i++) {
				if (str.length() - i >= 3) {
					if ("yak".equals(str.substring(i, i + 3))) {
						i += 2;
					} else {
						newString += str.charAt(i);
					}
				} else {
					newString += str.charAt(i);

				}

			}
		}
		return newString;
	}
}