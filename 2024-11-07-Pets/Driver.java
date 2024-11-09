/*
Overriding the getName() method inherited the getName() of the Superclass, allowing us to modify the method accordingly to what we want our subclass to behave.
*/
/*
The Bird b2 initialization didn't work because Bird is-a Animal but it doesn't mean it has-a Animal, meaning it can not assign the Animal type.
*/
public class Driver{
  public static void main(String[] args){
    Animal cat = new Animal("meow", 2, "sigma");
    cat.speak();
    Bird hawk = new Bird("hawk 2", 2, "uh", 72.5, "red");
    hawk.speak();
	Animal a1 = new Animal("purrr", 5, "bluey");
	Bird b1 = new Bird("quack", 5, "ducky", 200, "yellow");
	Animal a2 = new Bird("crowscare", 9, "cawww", 30, "black"); 
	a1.speak();
	b1.speak();
	a2.speak();
  }
}
