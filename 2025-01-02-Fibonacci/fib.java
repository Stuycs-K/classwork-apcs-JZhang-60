/*determine what the largest fibonacci number you can calculate in under 10 seconds.
largest fibonacci number under 10 seconds was fibonacci(47) resulting in 1836311903

What is the largest n such that fib(n) fits in an int? (does not overflow)
The largest n that overflows is 48 and the largest n that fits in an int is 47
*/
public class fib{
  public static int fibonacci(int n){
    if(n>1) return fibonacci(n-1)+fibonacci(n-2);
    return n;
  }
  public static void main(String[] args){
    System.out.println(fibonacci(47));
  }
}
