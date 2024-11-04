import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriangleTester{
	public static boolean isTriangle(int side1, int side2, int side3){
		return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
	}
	
	public static int countTrianglesA(String filename){
		int triangleCounter = 0;
		try{
			File file = new File(filename);
			Scanner input = new Scanner(file);
			while(input.hasNextInt()){
				if(isTriangle(input.nextInt(), input.nextInt(), input.nextInt())){
					triangleCounter++;
				}
			}
			input.close();
		}
		catch(FileNotFoundException ex){
			System.out.println("File not found");
		}
		return triangleCounter;
	}
	
	public static int countTrianglesB(String filename){
		int triangleCounter = 0;
		try{
			File file = new File(filename);
			Scanner input = new Scanner(file);
			while(input.hasNextLine()){
				String store = "";
				String store1 = "";
				String store2 = "";
				if(input.hasNextLine()){
				store = input.nextLine();
				}
				if(input.hasNextLine()){
				store1 = input.nextLine();
				}
				if(input.hasNextLine()){
				store2 = input.nextLine();
				}
				Scanner inputstore = new Scanner(store);
				Scanner inputstore1 = new Scanner(store1);
				Scanner inputstore2 = new Scanner(store2);
				for(int i = 0; i < 3; i++){
					if(isTriangle(inputstore.nextInt(), inputstore1.nextInt(), inputstore2.nextInt())){
					triangleCounter++;
				}
				}
			}
		}
			catch(FileNotFoundException ex){
				System.out.println("File not found");
			}
			return triangleCounter;
		}

	public static void main(String[] args){
		System.out.println(countTrianglesA("inputTri.txt"));
		System.out.println(countTrianglesB("inputTri.txt"));
	}
}
		