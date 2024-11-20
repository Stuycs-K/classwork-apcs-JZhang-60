import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
//Part A
public class AdventDay4{
  public static void main(String[] args){
    System.out.println(securityChecker("checker4.txt"));
	System.out.println(securityCheckerB("checker4.txt"));
  }
  public static int securityChecker(String fileName){
	  int sum = 0;
  try{
    Scanner input = new Scanner(new File(fileName));
    while(input.hasNextLine()){
		String store = input.nextLine().replace("-", "");
		String characters = store.substring(0, store.length()-10);
		String ID = store.substring(store.length()-10, store.length()-7);
		String checksum = store.substring(store.length()-6, store.length()-1);
		String charactersRecurred = "";
		//System.out.println(store.substring(store.length()-10, store.length()-7));
		int[] freq = new int[26];
		for(int i = 0; i < characters.length(); i++){
			freq[characters.charAt(i) - 'a']++;
		}
		for(int i = 0; i<5;i++){
			int maxRecurrence = 0;
			char maxChar = ' ';
			for(int j = 0; j <= 25; j++){
				int cIndex = (char) (j+97) - 'a';
				if(freq[cIndex] > maxRecurrence){
					maxRecurrence = freq[cIndex];
					maxChar = (char) (j+97);
				}
			}
			charactersRecurred+=maxChar;
			//System.out.println(charactersRecurred);
			freq[maxChar-'a'] = -1;
  }
  if(charactersRecurred.equals(checksum)){
	  sum+=Integer.valueOf(ID);
  }
	}
	input.close();
  }
catch(FileNotFoundException e){
  System.out.println("file not found");
}
return sum;
}

//Part B
public static String securityCheckerB(String fileName){
	  int sum = 0;
  try{
    Scanner input = new Scanner(new File(fileName));
    while(input.hasNextLine()){
		String store = input.nextLine().replace("-", "");
		String characters = store.substring(0, store.length()-10);
		String ID = store.substring(store.length()-10, store.length()-7);
		String checksum = store.substring(store.length()-6, store.length()-1);
		String deciphered = caesarCipher(characters, Integer.valueOf(ID));
		if(deciphered.indexOf("object") > -1){
			System.out.println(deciphered + ID);
		}
	}
	input.close();
  }
catch(FileNotFoundException e){
  System.out.println("file not found");
}
return "";
}

public static String caesarCipher(String input, int a){
	String caesarResult = "";
	for(int i = 0; i<input.length(); i++){
		char currentChar = input.charAt(i);
		for(int j = 0; j<a;j++){
		if(currentChar == 'z'){
			currentChar = 'a';
		}
		else{
			currentChar++;
		}
	}
	caesarResult+= currentChar + "";
}
return caesarResult;
}
}

