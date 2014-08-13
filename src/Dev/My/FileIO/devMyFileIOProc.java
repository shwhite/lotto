package Dev.My.FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class devMyFileIOProc {
	
	public devMyFileIOProc(){
		
	}
	
	
	/*
	 * ReadFile
	 */
	public int readFile(String strPath){
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(strPath));
			
			String strTemp = "";
			
			while((strTemp = br.readLine())!=null){
				String[] arrTemp = strTemp.split("\\|",-1);
				
				int nSum = 0;
				
				for(int i=0;i<arrTemp.length;i++){
					nSum += Integer.valueOf(arrTemp[i]);
				}
				
				
				
			}
			
			return 100;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
			return -100;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -101;
		}
		
	}

}
