import java.util.Scanner;

public class PalinDronNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ;");
		String str = scan.nextLine();
		
		palindrone(str);
		scan.close();
	}

	private static void palindrone(String str) {
		String reverse = "";
		
		for (int i = str.length() -1 ; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println("input data is palindrome");
		}else
			System.out.println("input data is not palindrome");
	}

}
