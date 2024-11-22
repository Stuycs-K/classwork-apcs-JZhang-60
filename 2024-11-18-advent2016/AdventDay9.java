import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class AdventDay9 {
    public static void main(String[] args) {
        System.out.println(registerChecker("checker9.txt"));
    }
    public static int registerChecker(String fileName) {
        ArrayList<String> wholeStore = new ArrayList<>();
        int a = 0;
		int b = 0;
		int c = 1;
		int d = 0;
		int counter = 0;
        try{
            Scanner input = new Scanner(new File(fileName));
            while(input.hasNextLine()){
                wholeStore.add(input.nextLine());
            }
            input.close();
            while(counter < wholeStore.size()){
                String store = wholeStore.get(counter);
                if(store.indexOf("cpy") > -1){
                    String xVal = store.substring(store.indexOf(" ") + 1, store.lastIndexOf(" "));
                    String target = store.substring(store.lastIndexOf(" ") + 1);
                    int value = getValue(xVal, a, b, c, d);
                    if(target.equals("a")){
						a = value;
					}
                    if(target.equals("b")){
						b = value;
					}
                    if(target.equals("c")){
						c = value;
					}
                    if(target.equals("d")){
						d = value;
					}
                    counter++;
					}else if (store.indexOf("inc") > -1){
                    String target = store.substring(store.lastIndexOf(" ") + 1);
                    if(target.equals("a")){
						a++;
					}
                    if(target.equals("b")){
						b++;
					}
                    if(target.equals("c")){
						c++;
					}
                    if(target.equals("d")){
						d++;
					}
                    counter++;
					}else if (store.indexOf("dec") > -1){
                    String target = store.substring(store.lastIndexOf(" ") + 1);
                    if(target.equals("a")){
						a--;
					}
					if(target.equals("b")){
						b--;
					}
                    if (target.equals("c")){
						c--;
					}
                    if (target.equals("d")){
						d--;
					}
                    counter++;
					}else if (store.indexOf("jnz") > -1) {
						String xVal = store.substring(store.indexOf(" ") + 1, store.lastIndexOf(" "));
						int check = getValue(xVal, a, b, c, d);
						if(check != 0){
							int skip = Integer.parseInt(store.substring(store.lastIndexOf(" ") + 1));
							counter += skip;
							}else{
                        counter++;
                    }
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        return a;
    }

    private static int getValue(String str, int a, int b, int c, int d) {
        if (str.equals("a")){
			return a;
		}
        if (str.equals("b")){
			return b;
		}
        if (str.equals("c")){
			return c;
		}
        if (str.equals("d")){
			return d;
		}
        return Integer.parseInt(str);
    }
}
