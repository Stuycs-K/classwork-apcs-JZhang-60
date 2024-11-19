import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class AdventDay4{
  public static void main(String[] args){
    System.out.println(securityChecker("checker4.txt"));
  }
  public static int securityChecker(String fileName){
  try{
    Scanner input = new Scanner(new File(fileName));
    while(input.hasNextLine()){
      String[] store = input.nextLine().split("-");
      System.out.println(store[5]);

    }
  }
catch(FileNotFoundException e){
  System.out.println("file not found");
}
return 0;
}
}
