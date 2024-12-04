public class ColorDemo{
	public static void main(String[] args){
		System.out.println("test");
		color(100, 90, 200);
		System.out.println("test2");
		color2(100, 90, 200);
		System.out.println("test3");
		System.out.println("" + CLEAR_SCREEN);
		System.out.println("\u001b[0m");
}
public static final String CLEAR_SCREEN =  "\u001b[2J";
public static final String HIDE_CURSOR =  "\u001b[?25l";
public static final String SHOW_CURSOR =  "\u001b[?25h";
public static void color(int r, int g, int b){
	System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";1m");
}

public static void color2(int r, int g, int b){
	System.out.print("\u001b[38;2;"+b+";"+g+";"+r+";1m");
		}
}