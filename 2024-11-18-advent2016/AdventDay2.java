import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class AdventDay2{
  public static void main(String[] args){
	  System.out.println(keypadResult("checker2.txt"));
	  System.out.println(keypadResultB("checker2.txt"));
  }
  public static int keypadResult(String fileName){
	  int finalFinalCode = 0;
	  int keypadNumPos = 5;
	  ArrayList<Integer> finalCode = new ArrayList<Integer>();
	  try{
		  File file = new File(fileName);
		  Scanner input = new Scanner(file);
		  while(input.hasNextLine()){
			  String store = input.nextLine();
			  for(int i = 0; i < store.length(); i++){
			  if(store.charAt(i) == ('U') && keypadNumPos > 3){
				  keypadNumPos -= 3;
			  } else
			  if(store.charAt(i) == ('D') && keypadNumPos < 7){
				  keypadNumPos += 3;
			  } else
			  if(store.charAt(i) == ('L') && keypadNumPos % 3 != 1){
				  keypadNumPos -= 1;
			  } else
			  if(store.charAt(i) == ('R') && keypadNumPos % 3 != 0){
				  keypadNumPos += 1;
			  }
		  }
		  finalCode.add(keypadNumPos);
		  keypadNumPos = 5;
		}
		  input.close();
	  }
	  catch(FileNotFoundException e){
		  System.out.println("File not found");
	  }
	  for(int i = 0; i<finalCode.size();i++){
		  finalFinalCode += finalCode.get(i) * (int) Math.pow(10, finalCode.size()-i-1);
	  }
	  return finalFinalCode;
  }
 //Part B
    public static String keypadResultB(String fileName){
  	  String finalFinalCode = "";
  	  int keypadNumPos = 5; // 10 = A 11 = B 12 = C 15 = D
  	  ArrayList<String> finalCode = new ArrayList<String>();
  	  try{
  		  File file = new File(fileName);
  		  Scanner input = new Scanner(file);
  		  while(input.hasNextLine()){
  			  String store = input.nextLine();
  			  for(int i = 0; i < store.length(); i++){
  			  if(store.charAt(i) == ('U')){
				  if(keypadNumPos == 3 || keypadNumPos == 13){
					  keypadNumPos-=2;
				  }
				  if(keypadNumPos == 6 || keypadNumPos == 7 || keypadNumPos == 8 || keypadNumPos == 10 || keypadNumPos == 11 || keypadNumPos == 12){
					  keypadNumPos-= 4;
				  }
  			  } else
  			  if(store.charAt(i) == ('D')){
  				  if(keypadNumPos ==1 || keypadNumPos == 11){
					  keypadNumPos += 2;
				  }
				  if(keypadNumPos == 2 || keypadNumPos == 3 || keypadNumPos == 4 || keypadNumPos == 6 || keypadNumPos == 7 || keypadNumPos == 8){
					  keypadNumPos+= 4;
				  }
  			  } else
  			  if(store.charAt(i) == ('L')){
  				  if(keypadNumPos != 1 && keypadNumPos != 2 && keypadNumPos != 5 && keypadNumPos != 10 && keypadNumPos != 13){
					  keypadNumPos--;
				  }
  			  } else
  			  if(store.charAt(i) == ('R')){
  				  if(keypadNumPos != 1 && keypadNumPos != 4 && keypadNumPos != 9 && keypadNumPos != 12 && keypadNumPos != 13){
					  keypadNumPos++;
				  }
  			  }
  		  }
		  //System.out.println(keypadNumPos);
		  if(keypadNumPos <= 9){
			  finalCode.add("" + keypadNumPos);
		  }else
		  if(keypadNumPos == 10){
			  finalCode.add("A");
		  }else
		  if(keypadNumPos == 11){
			  finalCode.add("B");
		  }else
		  if(keypadNumPos == 12){
			  finalCode.add("C");
		  }else
		  if(keypadNumPos == 15){
			  finalCode.add("D");
		  }
				  
  		  keypadNumPos = 5;
  		}
  		  input.close();
  	  }
  	  catch(FileNotFoundException e){
  		  System.out.println("File not found");
  	  }
  	  for(int i = 0; i<finalCode.size();i++){
  		  finalFinalCode += finalCode.get(i);
  	  }
  	  return finalFinalCode;
    }
}