
class main {
public static void main() {
	System.out.println("hello");
}
}
class ObjCheck{
	public static void main(String[] args) {
		execute(null);
	}
	public static void execute(main obj) {
		obj.main();
	}
}
