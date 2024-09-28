public class MyArrays{
  public static String arrayToString(int[] ary)
  {
	  if(ary.length == 0)
	  {
		  return "[]";
	  }
    String start = "[";
    for(int i = 0; i < ary.length; i++)
    {
		if(i < ary.length - 1)
		{
			start += (ary[i] + ", ");
		}
    }
    return (start + ary[ary.length - 1] + "]");
  }

  public static int[] returnCopy(int[] ary)
  {
    int[] ary2 = new int[ary.length];
    for(int i = 0; i < ary.length; i++)
    {
      ary2[i] = ary[i];
    }
    return ary2;
  }
  
  public static int[] concatArray(int[]ary1,int[]ary2)
  {
	  int[] ary3 = new int[ary1.length + ary2.length];
	  int arycounter = 0;
	  for(int i = 0; i < (ary1.length + ary2.length); i++)
	  {
		  if(i < ary1.length)
		  {
			  ary3[i] = ary1[arycounter];
			  arycounter++;
		  }
		  if(i >= ary1.length)
		  {
			  ary3[i] = ary2[arycounter - ary1.length];
			  arycounter++;
		  }
	  }
	  return ary3;
  }
	  
	  
  public static void main(String[] args)
  {
    int[] arrString = {1, 2, 3};
    System.out.println(arrayToString(arrString));
	
	int[] arrString2 = {};
    System.out.println(arrayToString(arrString2));
	
    int[] arrString3 = {-1, -100, -29};
    System.out.println(arrayToString(arrString3));

    int[] copy = {4, 5, 2};
    System.out.println("Are the arrays the same? " + (returnCopy(copy) == copy));
	System.out.println("Are the values of the arrays equal? " + arrayToString(returnCopy(copy)).equals(arrayToString(copy)));
	
	int[] copy2 = {};
    System.out.println("Are the arrays the same? " + (returnCopy(copy2) == copy2));
	System.out.println("Are the values of the arrays equal? " + arrayToString(returnCopy(copy2)).equals(arrayToString(copy2)));
	
	int[] concat1 = {2, 1, 9, 0};
	int[] concat2 = {40, 1, 3, 4, 8, 2};
	int[] concatResult = {2, 1, 9, 0, 40, 1, 3, 4, 8, 2};
	System.out.println(arrayToString(concatArray(concat1, concat2)).equals(arrayToString(concatResult)));
	
	int[] concat3 = {};
	int[] concat4 = {};
	int[] concatResult1 = {};
	System.out.println(arrayToString(concatArray(concat3, concat4)).equals(arrayToString(concatResult1)));
  }
}
