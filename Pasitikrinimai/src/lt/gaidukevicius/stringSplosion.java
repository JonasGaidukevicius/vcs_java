package lt.gaidukevicius;

public class stringSplosion {

	public static void main(String[] args) {
		System.out.println(stringSplosion("Code"));

	}

	public static String stringSplosion(String str) {
		  String result = "";
		  if(str.length() == 1){
		    return str;
		  } else{
		    for(int i = 1; i <= str.length(); i++){
		      result += str.substring(0, i);
		    }
		  }
		  return result;
		}
}
