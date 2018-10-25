package lt.gaidukevicius;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RasymasIFaila {

	
	
	public static void main(String[] args) {
		final short levelDataNew[][] = {
		        {19, 26, 26, 26, 18, 18, 18, 18, 18, 18, 16, 16, 16, 16, 20},
		        {21, 0, 0, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20},
		        {21, 0, 0, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20},
		        {21, 0, 0, 0, 17, 16, 16, 24, 16, 16, 16, 16, 16, 16, 20},
		        {17, 18, 18, 18, 16, 16, 20, 0, 17, 16, 16, 16, 16, 16, 20},
		        {17, 16, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 16, 24, 20},
		        {25, 16, 16, 16, 24, 24, 28, 0, 25, 24, 24, 16, 20, 0, 21},
		        {1, 17, 16, 20, 0, 0, 0, 0, 0, 0, 0, 17, 20, 0, 21},
		        {1, 17, 16, 16, 18, 18, 22, 0, 19, 18, 18, 16, 20, 0, 21},
		        {1, 17, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 20, 0, 21},
		        {1, 17, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 20, 0, 21},
		        {1, 17, 16, 16, 16, 16, 16, 18, 16, 16, 16, 16, 20, 0, 21},
		        {1, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20, 0, 21},
		        {1, 25, 24, 24, 24, 24, 24, 24, 24, 24, 16, 16, 16, 18, 20},
		        {9, 8, 8, 8, 8, 8, 8, 8, 8, 8, 17, 16, 16, 16, 20}
		    };
		
		BufferedWriter writer;
		
		try {
			writer = new BufferedWriter(new FileWriter("level_02.txt", true));
			for(int i = 0; i < 15; i++) {
				for(int j = 0; j < 15; j++) {
					writer.append(Short.toString(levelDataNew[i][j]));
					writer.newLine();
				}
			}
		    writer.close();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
