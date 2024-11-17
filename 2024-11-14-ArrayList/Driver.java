import java.util.ArrayList;
public class Driver{
	public static void main(String[] args){
	  ArrayList<String> test1 = ArrayListPractice.createRandomArray(10);
	  ArrayList<String> test2 = ArrayListPractice.createRandomArray(11);
    System.out.println(ArrayListPractice.createRandomArray(300000));
	System.out.println(test1);
	System.out.println(test2);
	System.out.println(ArrayListPractice.makeReversedList(test1));
	System.out.println(ArrayListPractice.mixLists(test1, test2));
  }
}