package lt.gaidukevicius;

public class StringX {

	public static void main(String[] args) {
		System.out.println(stringX("xxHxix"));

	}
	
	
	public static String stringX(String str) {
		  String newStr = "";
		  for(int i = 0; i < str.length(); i++){
		    if(i==0){
		      newStr += str.charAt(i);
		    } else if (i == str.length()-1){
		      newStr += str.charAt(i);
		    } else {
		      if(str.charAt(i) == 'x'){
		        continue;
		      } else{
		        newStr += str.charAt(i);
		      }
		  }
		}
		return newStr;
		}


}
