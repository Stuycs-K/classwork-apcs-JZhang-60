import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class AdventDay1{
  public static void main(String[] args){
	  System.out.println(blockResult("checker.txt"));
	  System.out.println(blockResultB("checker.txt"));
  }
  public static int blockResult(String fileName){
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
  //Part B
  public static int blockResultB(String fileName){
    int xPos = 0;
    int yPos = 0;
    int tracker = 0; //0 = N, 1 = E, 2 = S, 3 = W
	String visited = "(0,0)";
	try{
	File file = new File(fileName);
    Scanner input = new Scanner(file);
    while(input.hasNext()){
		String store = input.next();
		store = store.replace(",", "");
		int value = Integer.valueOf(store.substring(1));
		if(store.charAt(0) == 'R'){
			tracker = (tracker+1)%4;
		}
		if(store.charAt(0) == 'L'){
			tracker = (tracker-1+4)%4;
		}
		for(int i = 0; i<value;i++){
			if(tracker == 0){
				yPos++;
			}
			if(tracker == 1){
				xPos++;
			}
			if(tracker == 2){
				yPos--;
			}
			if(tracker == 3){
				xPos--;
			}
			String current = "("+xPos+","+yPos+")";
			//System.out.println(current);
			//System.out.println(visited);
		   if(visited.indexOf(current) > -1){
			   return (Math.abs(xPos)+Math.abs(yPos));
		   }else{
		   visited += current;
		   }
	   }
	  //System.out.println(current);
	}
	input.close();
	}
	catch(FileNotFoundException e){
		System.out.println("File not found");
	}
	return Math.abs(xPos) + Math.abs(yPos);
  }
}
