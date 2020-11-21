package testPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Algorithm algorithm = new Algorithm();
		algorithm.test01();

	}
	
	public String test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("height&width : ");
		
		String sData1 = br.readLine();
		
		System.out.println(sData1.substring(0, 1) + "만큼 반복");
		
		String sData2 = "";
		
		String[] viewResult;
		String view = "";
		
		for(int i=0; i<Integer.parseInt(sData1.substring(0, 1)); i++) {
			sData2 = br.readLine();
			view = "";
		//	System.out.println(sData2);
			String[] sData3 = sData2.split("");
			for(int j=0; j<sData3.length; j++) {
				if(j % 2 == 0) {
					
				//	Integer.parseInt(sData3[j])
					
				} else {
					
				
				}
			
				/*
				if(Integer.parseInt(sData3[j]) % 2 == 0) {
					
				}
				*/
			}
		}
		System.out.println("end");
		
		
		
		
		
		return "";
	}

}
