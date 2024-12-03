public class ColorDemo{
	public static void main(String[] args){
		int r = 100, b = 100, g = 100;
		for(int i = 0; i < 500; i++){
			if(r <= 256){
				algo(r);
			}
			if(b <= 256){
				b++;
			}
			if(g <= 256){
				algo(g);
			}
		System.out.print("\u001b[38;2;"+r+";"+b+";"+g+";1mChristmas");
		System.out.print("\u001b[38;2;"+b+";"+g+";"+r+";1mEve");
  }
}
 public static int algo(int num){
	  if(num%2 == 0){
		  return num /= 2;
	  }
	  if(num%2 == 1){
		  return num = num*3+1;
	  }
	  return 0;
  }
}