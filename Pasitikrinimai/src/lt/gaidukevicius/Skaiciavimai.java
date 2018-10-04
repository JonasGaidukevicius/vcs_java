package lt.gaidukevicius;

public class Skaiciavimai {

	public static void main(String[] args) {
		/*
		int a = 0;
		int b = a % 2;
		System.out.println(b);
		*/
		
		int a = 1;
		int b = 10;
		int c = 51;
		int d = 50;
		
		/*if(a > b & c > d) {
			System.out.println("a daugiau už b ir c daugiau uz d");
		} else {
			System.out.println("kita");
		}*/
		
		/*
		if(a > b ^ c > d ^ b > c) {
			System.out.println("Gerai");
		} else {
			System.out.println("Negerai");
		}*/
		
		String str = "Labas";
		
		System.out.println(str.substring(0,0));
		
		System.out.println(everyNth("Tekstas", 2));
		
		int ss = 11;
		int dd = -2;
		System.out.println((ss % dd));
		
		if((ss > 100) && (dd > 15)) {
			System.out.println();
			
		}
		
	
	
		//for ciklas su 2 kintamaisiais
		for(int i = 0, j = 10; i < 15; i++, j--) {
			System.out.println("i yra " + i + ", o j yra " + j);
		
		}
		
		//for ciklas su išoriniais kintamaisiais
		int h =0;
		for(h = 0; h < 15; h++) {
			System.out.println("h yra " + h);
		}
		System.out.println("po ciklo h yra " + h);
		
		
		System.out.println("----------------------");
		int sk = 2 / 3;
		System.out.println("sk yra " + sk);
		sk = -3 % 4;
		System.out.println("sk yra " + sk);
		
		System.out.println("simboliai " + startOz("ozymandias"));
		
		int k = -1;
		int	ff = k < 0 ? k * -2 : k;
		System.out.println("ff yra " + ff);
		
		
} //main baigiasi cia
	
	
	
	/*public static boolean or35(int n) {
		  if((n > 0) && ((n % 3) | (n % 5))){
		    return true;
		  } else {
		    return false;
		  }
		  
		}*/
	
	
	
	public static String everyNth(String str, int n) {
		  String text = "";
		  if(n >= 1){
		    for (int i = 0; i < str.length();i+=n){
		      text = text + str.substring(i, i+1);
		      
		    }
		    return text;
		  } else{
		    return "";
		  }
		  
		}
		
	
	/*public boolean loneTeen(int a, int b) {
		  if(((a >= 13) && (a <= 19)) && ((b < 13) || (b > 19)) || (b >= 13) && (b <= 19)) && ((a < 13) || (a > 19)))
		    {
		      return true;
		    } else {
		    return false;
		    }
		  }*/
	
	public static String startOz(String str) {
		String newStr = "";
		  if(str.length() > 0){
		    if(str.charAt(0)== 'o') {
		      newStr = newStr + str.charAt(0);
		    }
		  } else if(str.length() > 1)  {
		     if(str.charAt(1) == 'z'){
		      newStr = newStr + str.charAt(1);
		     }
		  }
		 
		 /*
		  if(str.length() >= 2){
		    if(str.charAt(0)== 'o') {
		    newStr = newStr + str.charAt(0);
		    } else{
		      if(str.length() < 2)
		    }
		    if(str.charAt(1) == 'z'){
		      newStr = newStr + str.charAt(1);
		   }
		  }*/
		  
		  return newStr;
		}

}
