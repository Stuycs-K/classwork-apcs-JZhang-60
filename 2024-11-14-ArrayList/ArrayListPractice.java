import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String>result = new ArrayList<String>(size);
    String stored = "";
    for(int i = 0; i < size; i++){
      stored += (int)(Math.random() * 11);
      if (stored.equals("0")){
        stored = "";
      }
      result.add(stored);
      stored = "";
    }
    return result;
  }
  public static void replaceEmpty(ArrayList<String> original){
    for(int i = 0; i < original.size(); i++){
      original.add(original.indexOf(""), "Empty");
    }
  }
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
  ArrayList<String>result = new ArrayList<String>(original.size());
  for(int i = 0; i < original.size(); i++){
	  result.add(original.get(original.size()-1-i));
  }
  return result;
}
  public static void main(String[] args){
	  ArrayList<String> test1 = createRandomArray(30);
    System.out.println(createRandomArray(300000));
	System.out.println(test1);
	System.out.println(makeReversedList(test1));
  }
}
