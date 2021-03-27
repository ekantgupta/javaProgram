import java.util.HashMap;

public class NumberOfWordInString {

	public static void main(String[] args) {
		String str = "my my name is is ekant ekant gupta";
		
		System.out.println(countStringWords(str));
	}

	private static HashMap<String, Integer> countStringWords(String str) {
		String[] strLength = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < strLength.length; i++) {
			if(map.containsKey(strLength[i])) {
				int num = map.get(strLength[i]);
				map.put(strLength[i], num + 1);
			}else
				map.put(strLength[i], 1);
		}
		
		return map;
	}

}
