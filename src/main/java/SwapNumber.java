
public class SwapNumber {

	public static void main(String[] args) {
		int x = 45;
		int y = 90;
		
		System.out.println("Before swap ...");
		System.out.println("X : " + x + "  Y : " + y);
		
		System.out.println("After swap.... ");
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("X : " + x + "  Y : " + y);
		
	}

}
