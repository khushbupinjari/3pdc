package star_pattern;

public class xyz {

	public static void main(String[] args) {
		String s = "65321";
		char[] k = s.toCharArray();
		int sum = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			int d = Integer.parseInt(String.valueOf(k[i]));
			sum = sum + d;
		}
		System.out.println(sum);
	}

}
