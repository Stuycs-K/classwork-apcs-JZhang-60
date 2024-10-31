import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      String text = "This is a sample\nOf how to read\ntext!";
      // creates a Scanner object to read throug the String
      Scanner input = new Scanner(text);
      Scanner sc1 = new Scanner("This is a bunch of words");
      Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");

      //you don't want a for loop here unless you know the size of the data set

      while(input.hasNext()){
        System.out.println(input.next());
      }
      while(sc1.hasNextLine()){
    System.out.println(sc1.next());
    //do something with the next line of the file
}
Double sum = 0.0;
while(sc2.hasNextLine()){
  sum+=sc2.nextDouble();//read all the numbers and add to sum
}
System.out.println(sum);
}
}
