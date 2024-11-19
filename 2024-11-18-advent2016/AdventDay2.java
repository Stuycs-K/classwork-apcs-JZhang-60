import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class AdventDay2{
  public static void main(String[] args){
	  System.out.println(keypadResult("checker2.txt"));
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
}