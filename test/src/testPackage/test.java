package testPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		test t = new test();
		t.test01();

	}
	
	static public void test01() {
		int[] arrNum = {5, 11, 8, 2, 6, 4, 7, 1};
		
		for(int i=0; i<arrNum.length; i++) {
			int minIndex = i;
			for(int j=i; j<arrNum.length; j++) {
				if(arrNum[minIndex] >= arrNum[j]) {
					minIndex = j;
				}
			}
			
			int sTemp = arrNum[minIndex];
			
			arrNum[minIndex] = arrNum[i];
			arrNum[i] = sTemp;
		}
		
		for(int i=0; i<arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
	}
	
	

}
