import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriangleTester{
	public static boolean isTriangle(int side1, int side2, int side3){
		return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
	}
	
	public static int countTrianglesA(String filename){
		return 0;
	}
}
		