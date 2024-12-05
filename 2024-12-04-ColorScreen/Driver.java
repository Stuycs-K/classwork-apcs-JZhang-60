public class Driver{
	public static void main(String[] args){
		int[] threeInt = new int[3];
		fillArr(threeInt);
		Text.color(Text.BLUE,Text.background(Text.BLUE));
		for(int i = 1; i <= 30; i++){
			for(int j = 1; j <= 80; j++){
				if(i == 1 || i == 30){
		Text.go(i, j);
		System.out.println("1");
				}else if(i > 1 && i < 30){
					Text.go(i, 1);
					System.out.println("1");
					Text.go(i, 80);
					System.out.println("1");
				}
				}
			}
	}
	public static int[] fillArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) (Math.random() * 100);
			System.out.println(arr[i]);
		}
		return arr;
	}
}
	