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
	public static void main(String[] args){
		System.out.println(countTrianglesA("inputTri.txt"));
	}
}
		