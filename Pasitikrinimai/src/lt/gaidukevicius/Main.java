package lt.gaidukevicius;

public class Main {

	public static void main(String[] args) {
		//System.out.println(stringMatch("xxcaazz", "xxbaaz"));
		
		              
             System.out.println(0 & 48);
		
		
	}
	
	public static int stringMatch(String a, String b) {
		  int count = 0;
		  int trumpesnisIlgis = 0;
		  if(a.length() <= b.length()){
		    trumpesnisIlgis = a.length();
		  } else{
		    trumpesnisIlgis = b.length();
		  }
		  if(a.length() >= 2 && b.length() >= 2){
		    for(int i = 0; i < trumpesnisIlgis - 1; i++){
		      if(a.substring(i, i+2).equals(b.substring(i, i+2))){
		        count++;
		      } 
		    }
		  }
		  return count;
		}

}
