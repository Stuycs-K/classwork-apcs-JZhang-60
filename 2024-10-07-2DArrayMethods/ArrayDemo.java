import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
	//Arrays.toString() vs arrayToString() test cases
	int arr[] = new int[] {3, 2, 90, 4};
	System.out.println("Is toString equal to arrayToString? " + Arrays.toString(arr).equals(arrToString(arr)));
	arr = new int[] {0, 0, 0};
	System.out.println("Is toString equal to arrayToString? " + Arrays.toString(arr).equals(arrToString(arr)));
	arr = new int[] {};
	System.out.println("Is toString equal to arrayToString? " + Arrays.toString(arr).equals(arrToString(arr)));
	int arr2d[][] = new int[][] {{0, 0, 0}, {2, 3, 9}};
	System.out.println("Is toString equal to arrayToString? " + Arrays.toString(arr2d).equals(arrToString(arr2d)));
	arr2d = new int[][] {{}, {}};
	System.out.println("Is toString equal to arrayToString? " + Arrays.toString(arr2d).equals(arrToString(arr2d)) + Arrays.toString(arr2d) + arrToString(arr2d));
	
	//countZeros2D function test cases
	arr2d = new int[][] {{2, 3, 4, 0}, {0, 0, 1}};
	System.out.println("Expected zeros of 3, returned " + countZeros2D(arr2d));
	arr2d = new int[][] {{0}, {0, 0, 0, 0, 0}};
	System.out.println("Expected zeros of 6, returned " + countZeros2D(arr2d));
	arr2d = new int[][] {{0}, {}};
	System.out.println("Expected zeros of 1, returned " + countZeros2D(arr2d));
	arr2d = new int[][] {{}, {}, {}, {}};
	System.out.println("Expected zeros of 0, returned " + countZeros2D(arr2d));
	
	//htmlTable function test cases
	arr2d = new int[][] {{1,2},{3}};
	System.out.println("Expected <table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>\nReturned " + htmlTable(arr2d));
	System.out.println("Equality check: " + "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>".equals(htmlTable(arr2d)));
	arr2d = new int[][] {{}, {}, {}};
	System.out.println("Expected <table><tr></tr><tr></tr><tr></tr></table>\nReturned " + htmlTable(arr2d));
	System.out.println("Equality check: " + "<table><tr></tr><tr></tr><tr></tr></table>".equals(htmlTable(arr2d)));
	arr2d = new int[][] {{0},{}};
	System.out.println("Expected <table><tr><td>0</td></tr><tr></tr></table>\nReturned " + htmlTable(arr2d));
	System.out.println("Equality check: " + "<table><tr><td>0</td></tr><tr></tr></table>".equals(htmlTable(arr2d)));
	arr2d = new int[][] {{-413},{201, -4}};
	System.out.println("Expected <table><tr><td>-413</td></tr><tr><td>201</td><td>-4</td></tr></table>\nReturned " + htmlTable(arr2d));
	System.out.println("Equality check: " + "<table><tr><td>-413</td></tr><tr><td>201</td><td>-4</td></tr></table>".equals(htmlTable(arr2d)));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
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

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
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

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for(int i = 0; i < nums.length; i++)
    {
		if(nums[i].length == 0)
		{
			count = count;;
		}
			for(int j = 0; j < nums[i].length; j++)
			{
				if (nums[i][j] == 0)
				{
					count++;
				}
			}
	}
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
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

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i ++) {
      for (int j = 0; j < vals[i].length; j ++) {
        if (vals[i][j] < 0) {
          if (i == j) {
            vals[i][j] = 1;
          }
          else {
            vals[i][j] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] copyHelper(int[] nums){
  	int[] copy = new int[nums.length];
  	for(int i = 0; i < nums.length; i++)
  	{
  		copy[i] = nums[i];
  	}
  	return copy;
  }

  public static int[][] copy(int[][] nums){
    int[][] copy = new int[nums.length][nums[0].length];
	  for(int i = 0; i < nums.length; i++)
	  {
		  for(int j = 0; j < nums[0].length; j++)
		  {
			  copy[i] = copyHelper(nums[i]);
		  }
	  }
	  return copy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] arr = new int[nums[0].length][nums.length];
	  for(int i = 0; i < nums[0].length; i++)
	  {
		  for(int j = 0; j < nums.length; j++)
		  {
			  arr[i][j] = nums[j][i];
		  }
	  }
	  return arr;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTableHelper(int[] nums){
	  String concatenate = "<tr>";
	  for(int i = 0; i < nums.length; i++)
	  {
		  concatenate = concatenate + "<td>" + nums[i] + "</td>";
	  }
	  return concatenate + "</tr>";
  }
		  
  public static String htmlTable(int[][]nums){
	  String concatenate = "<table>";
	  for(int i = 0; i < nums.length; i++)
	  {
		  concatenate = concatenate + htmlTableHelper(nums[i]);
	  }
	  return concatenate + "</table>";
  }
}
