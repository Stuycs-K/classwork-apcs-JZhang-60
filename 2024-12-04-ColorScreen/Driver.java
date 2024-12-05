public class Driver{
	public static void main(String[] args){
		System.out.print(Text.CLEAR_SCREEN);
		int[] threeInt = new int[3];
		int w = 80;
		int h = 30;
		fillArr(threeInt);
		Text.color(Text.BLUE,Text.background(Text.BLUE));
		for(int i = 1; i <= h; i++){
			for(int j = 1; j <= w; j++){
				if(i == 1 || i == h){
		Text.go(i, j);
		System.out.print("1");
				}else if(i > 1 && i < h){
					Text.go(i, 1);
					System.out.print("1");
					Text.go(i, w);
					System.out.print("1");
				}
				}
			}
		for(int i = 0; i < 3; i++){
			Text.go(2, (3 +(74/2)*i));
			colorPicker(threeInt[i]);
			System.out.print(threeInt[i]);
		}
		Text.color(Text.WHITE,Text.background(Text.BLUE),Text.BRIGHT);
		for(int i = 2; i <= w-1; i++){
			Text.go(3, i);
			System.out.print("-");
	}
	}
	public static int[] fillArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) (Math.random() * 100);
		}
		return arr;
	}
	public static void colorPicker(int num){
		if(num < 25){
			Text.color(Text.RED, Text.BRIGHT);
		} else if(num>75){
			Text.color(Text.GREEN, Text.BRIGHT);
		} else{
			Text.color(Text.WHITE);
		}
	}
}
	