import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Part A
public class AdventDay6{
  public static void main(String[] args){
    System.out.println(radioChecker("checker6.txt"));
	System.out.println(radioCheckerB("checker6.txt"));
  }
  public static char freqChar(String str){
	  int[] alphabet = new int[26];
	  int maxRecurrence = 0;
	  char maxChar = ' ';
	  for(int i = 0; i < str.length(); i++){
		  int index = str.charAt(i) - 'a';
		  //System.out.println(index);
		  alphabet[index]++;
		  if(alphabet[index] > maxRecurrence){
			  maxRecurrence = alphabet[index];
			  maxChar = str.charAt(i);
		  }
	  }
	  return maxChar;
  }
  
  public static String radioChecker(String fileName){
	  String finalChar = "";
	  String[] columns = new String[8];
	  for(int i = 0; i < columns.length; i++){
		  columns[i] = "";
	  }
  try{
	  Scanner input = new Scanner(new File(fileName));
	  while(input.hasNextLine()){
		  String store = input.nextLine();
		  String indexPlacer = store.substring(0,8);
		  for(int i = 0; i<8;i++){
			  columns[i] += indexPlacer.charAt(i);
		  }
	  }
	  input.close();
  }
	  catch(FileNotFoundException e){
		  System.out.println("file not found");
	  }
	  for(int i = 0; i < columns.length; i++){
			  finalChar += freqChar(columns[i]);
	  }
  return finalChar;
  }
  //Part B
  public static char leastFreqChar(String str){
	  int[] alphabet = new int[26];
	  int leastRecurrence = 10000;
	  char leastChar = ' ';
	  for(int i = 0; i < str.length(); i++){
		  int index = str.charAt(i) - 'a';
		  alphabet[index]++;
	  }
	  for(int i = 0; i < 26; i++){
		  if(alphabet[i] < leastRecurrence){
			  leastRecurrence = alphabet[i];
			  leastChar = (char) (i + 'a');
		  }
	  }
	  return leastChar;
  }
  public static String radioCheckerB(String fileName){
	  String finalChar = "";
	  String[] columns = new String[8];
	  for(int i = 0; i < columns.length; i++){
		  columns[i] = "";
	  }
  try{
	  Scanner input = new Scanner(new File(fileName));
	  while(input.hasNextLine()){
		  String store = input.nextLine();
		  String indexPlacer = store.substring(0,8);
		  for(int i = 0; i<8;i++){
			  columns[i] += indexPlacer.charAt(i);
		  }
	  }
	  input.close();
  }
	  catch(FileNotFoundException e){
		  System.out.println("file not found");
	  }
	  for(int i = 0; i < columns.length; i++){
			  finalChar += leastFreqChar(columns[i]);
	  }
	  return finalChar;
}
}