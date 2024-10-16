public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.pow((Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2)) , 0.5);
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
	Point p4 = new Point(0, 0);
	Point p5 = new Point(-4, 5);
	
	// Constructor test cases
    System.out.println( p3);
	System.out.println( p5);
	
	// Static distance in Demo.java test cases
    System.out.println( distance(p1,p2));
	System.out.println( distance(p4,p5));
	System.out.println( distance(p3,p4));
	
	// Static distance in Point.java test cases
    System.out.println( Point.distance(p1,p2));
	System.out.println( Point.distance(p4,p5));
	System.out.println( Point.distance(p3,p4));
	
	// Non-Static in Point.java test cases
    System.out.println( p1.distanceTo(p2));
	System.out.println( p4.distanceTo(p5));
	System.out.println( p3.distanceTo(p4));
	
	// Equilateral Triangle objects
	Point t = new Point(0, 0);
	Point t1 = new Point(1, 0);
	Point t2 = new Point(0.5, Math.sqrt(3)/2);
	
  }
}
