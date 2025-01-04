/*determine what the largest fibonacci number you can calculate in under 10 seconds.
largest fibonacci number under 10 seconds was fibonacci(46) resulting in 1836311903

What is the largest n such that fib(n) fits in an int? (does not overflow)
The lowest n that overflows is 47 and the largest n that fits in an int is 46
*/
public class fib{
  public static int fibonacci(int n){
    if(n>1) return fibonacci(n-1)+fibonacci(n-2);
    return n;
  }
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if(remainingLetters>0){
      for(int i = 0; i<alphabet.length();i++){
        makeWords(remainingLetters - 1, result+alphabet.charAt(i), alphabet);
      }
    }else{
		System.out.println(result);
		return;
    }
  }
  public static void main(String[] args){
    String res = "";
    makeWords(3, res, "abc");
  }
}
