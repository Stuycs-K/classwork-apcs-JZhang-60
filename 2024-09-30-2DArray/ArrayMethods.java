// Amy Zhou (azhou60@stuy.edu) & Jeffery Zhang (jzhang60@stuy.edu)

public class ArrayMethods {
  public static void main (String[] args) {
    int[][] arr = new int[][] {{2, 7}, {3, 6, 1}, {0, 0, 0, 0}};
    System.out.println("Test01: " + arr2DSum(arr));
	
	
  }
  /**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
  public static String arrToString(int[] ary) {
  String result = "[";
  for (int i = 0; i < ary.length; i ++) {
    result += ary[i];
    if (i < ary.length - 1) {
      result += ", ";
    }
  }
  result += "]";
  return result;
}
  //Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
  public static String arrToString(int[][]ary){
	  String result = "[";
	  for (int i = 0; i < ary.length; i++)
	  {
		  result += arrToString(ary[i]);
		  if (i < ary.length - 1)
		  {
			  result += ", ";
		  }
	  }
  return result += "]";
  }

/*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][] nums){
    int sum = 0;
    for(int i = 0; i < nums.length; i++)
    {
      for(int j = 0; i < nums[i].length; j++)
      {
        sum += nums[i][j];
      }
    }
    return sum;
  }
}