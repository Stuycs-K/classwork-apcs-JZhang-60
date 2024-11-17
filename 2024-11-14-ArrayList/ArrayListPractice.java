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

public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  ArrayList<String> result = new ArrayList<String>();
  int lengthStore = 0;
  lengthStore = Math.max(a.size(), b.size());
  for(int i = 0; i < lengthStore; i++){
	  if(a.size() > i){
		  result.add(a.get(i));
	  }
	  if(b.size() > i){
		  result.add(b.get(i));
	  }
  }
  return result;
}
}
