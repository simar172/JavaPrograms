package datastr;

public class keypad {

	static String keypad(String arr[], String str) {

		String out = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				out = out + "0";
			} else {
				int pos = str.charAt(i) - 'A';
				out = out + arr[pos];
			}
		}
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7",
				"77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };

		String input = "GEEKSFORGEEKS";

		System.out.println(keypad(str, input));
	}

}
