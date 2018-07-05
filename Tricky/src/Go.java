
public class Go {
public static void main(String[] args) {
	new Come().Go(1,"hello","hi");
	new Come().Go(2,"hello","hi");}
	
}
class Come{
	public void Go(int x,String... y){
		System.out.println(y[y.length-x]);
}
}//comment added by karthi
//comment added by venkat
