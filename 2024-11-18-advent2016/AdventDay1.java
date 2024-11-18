import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class AdventDay1{
  public static void main{

  }
  public static int blockResult(string fileName){
    File file = new File(filename);
    Scanner input = new Scanner(file);
    String store = "";
    int xPos = 0;
    int yPos = 0;
    int tracker = 1;
    while(input.hasNext()){
      store = input.Next();
      if(store.indexOf("R") > -1){
        if(tracker >= 1 && tracker <= 3){
        xPos += Integer.parseInt(store.substring(1));
      }
    }
  }
}
}
