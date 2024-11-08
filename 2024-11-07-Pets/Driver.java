// Overriding the getName() method inherited the getName() of the Superclass, allowing us to modify the method accordingly to what we want our subclass to behave.
public class Driver{
  public static void main(String[] args){
    Animal cat = new Animal("meow", 2, "sigma");
    cat.speak();
    Bird hawk = new Bird("hawk 2", 2, "uh", 72.5, "red");
    hawk.speak();
  }
}
