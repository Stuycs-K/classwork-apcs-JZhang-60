// Amy Zhou (azhou60@stuy.edu) & Jeffery Zhang (jzhang60@stuy.edu)

public class ArrayMethods {
  public static void main (String[] args) {
	  int[] arr = new int[] {2, 3, 4, 9};
	  System.out.println("Does arrToString return [2, 3, 4, 9]? " + arrToString(arr).equals("[2, 3, 4, 9]"));
	  int[][] arr2d = new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}};
	  System.out.println("Does arrToString return [[2, 3, 4], [5, 6, 7], [2, 4, 9]]? " + arrToString(arr2d).equals("[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"));
	  arr2d = new int[][] {{2, 7}, {3, 6, 1}, {0, 0, 0, 0}};
	  System.out.println("Is " + arr2DSum(arr2d) + " equal to 19?");
  }
  /**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
  public static String arrToString(int[] ary) {
	  if(ary.length == 0)
	  {
		  return "[]";
	  }
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
      for(int j = 0; j < nums[i].length; j++)
      {
        sum += nums[i][j];
      }
    }
    return sum;
  }
  
  /**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][]nums){
	  int[][] arr = new int[nums[0].length][nums.length];
	  for(int i = 0; i < nums[0].length; i++)
	  {
		  for(int j = 0; j < nums.length; j++)
		  {
			  arr[j][i] = nums[j][i];
		  }
	  }
	  return arr;
  }
}