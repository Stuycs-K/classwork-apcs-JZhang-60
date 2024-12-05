public class Driver{
	public static void main(String[] args){
		System.out.print(Text.CLEAR_SCREEN);
		int[] threeInt = new int[3];
		int w = 80;
		int h = 30;
		int centerY = h/2;
		int centerX = w/2;
		int r = h/4;
		int binFlip = 0;
		fillArr(threeInt);
		// border
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
		// int placements
		for(int i = 0; i < 3; i++){
			Text.go(2, (3 +(74/2)*i));
			colorPicker(threeInt[i]);
			System.out.print(threeInt[i]);
		}
		// horizontal
		Text.color(Text.WHITE,Text.background(Text.BLUE),Text.BRIGHT);
		for(int i = 2; i <= w-1; i++){
			Text.go(3, i);
			System.out.print("-");
	}
	// oval
	Text.color(Text.WHITE,Text.background(Text.MAGENTA),Text.BRIGHT);
	for(int i = 1; i <= h-10; i++){
		for(int j = 1; j <=w-10;j++){
			if(Math.pow(j-centerX, 2) + Math.pow(i-centerY, 4) <= Math.pow(r, 3)){
				Text.go(i, j);
				binFlip = (int) (Math.random()*2);
				if(binFlip == 0){
				Text.color(Text.MAGENTA,Text.background(Text.MAGENTA),Text.BRIGHT);
				System.out.print("0");
				}
				Text.color(Text.WHITE,Text.background(Text.MAGENTA),Text.BRIGHT);
				if(binFlip == 1){
				System.out.print("1");
				}
			}
		}
	}
	Text.go(31,0);
	System.out.println(Text.RESET);
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
	