import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class AdventDay1{
  public static void main(String[] args){
	  System.out.println(blockResult("checker.txt"));
  }
  public static int blockResult(String fileName){
    String store = "";
    int xPos = 0;
    int yPos = 0;
    int tracker = 1; //1 = N, 2 = E, 3 = S, 4 = W
	try{
	File file = new File(fileName);
    Scanner input = new Scanner(file);
    while(input.hasNextLine()){
      String[] noCommas = input.nextLine().split(", ");
	  for(int i = 0; i < noCommas.length; i++){
		  System.out.print(noCommas[i] + " ----- " + tracker + "------" + xPos +", " +yPos + "\n" );
      if(noCommas[i].indexOf("R") > -1){
        if(tracker == 1){
		xPos += Integer.parseInt(noCommas[i].substring(1));
		tracker++;
		} else if(tracker == 3){
        xPos -= Integer.parseInt(noCommas[i].substring(1));
		tracker++;
		} else if(tracker == 2){
        yPos -= Integer.parseInt(noCommas[i].substring(1));
		tracker ++;
		} else if(tracker == 4){
        yPos += Integer.parseInt(noCommas[i].substring(1));
		tracker = 1;
		}
	  }
	  if(noCommas[i].indexOf("L") > -1){
        if(tracker == 1){
        xPos -= Integer.parseInt(noCommas[i].substring(1));
		tracker = 4;
		} else if(tracker == 3){
        xPos += Integer.parseInt(noCommas[i].substring(1));
		tracker--;
		} else if(tracker == 2){
        yPos += Integer.parseInt(noCommas[i].substring(1));
		tracker--;
		} else if(tracker == 4){
        yPos -= Integer.parseInt(noCommas[i].substring(1));
		tracker--;
		}
	  }
	}
	}
	input.close();
	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
	}
	return Math.abs(xPos) + Math.abs(yPos);
  }
}
