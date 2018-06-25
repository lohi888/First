import java.util.Scanner;
public class InputScanner {
public static void main(String[] args) {
	Scanner sc=new Scanner("true false true true");
	while(sc.hasNext()){
		if(sc.hasNextBoolean())
			System.out.println(sc.nextBoolean()+" ");
	}
}
public void Go(int x,String... y){
	System.out.println(y[y.length-x]);
}
}