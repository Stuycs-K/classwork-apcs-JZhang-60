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
    for(int i = 0; i < original.length; i++){
      original.add(original.indexOf(""), "Empty");
    }
    return original;
  }
  public static void main(String[] args){
    System.out.println(createRandomArray(30));
    System.out.println(replaceEmpty(createRandomArray(300000)));
  }
}
