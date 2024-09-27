public class MyArrays{
  public static String arrayToString(int[] ary)
  {
    String start = "[";
    for(int i = 0; i < ary.length; i++)
    {
      start += ary[i];
    }
    return (start + "]");
  }

  public static int[] returnCopy(int[] ary)
  {
    
  }
  public static void main(String[] args)
  {
    int[] arrString = {1, 2, 3};
    System.out.println(arrayToString(arrString));
  }
}
