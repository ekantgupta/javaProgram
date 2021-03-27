
public class ReverseString {

	public static void main(String[] args) {
		String str = "tnake si siht";
		
		System.out.println(reverseString(str));
	}

	private static String reverseString(String str) {
		
		String reverse = "";
		for(int i=str.length(); i > 0 ; i--) {
			reverse += str.charAt(i -1);
		}
		
		
		return reverse;
	}

}
