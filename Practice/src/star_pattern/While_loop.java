package star_pattern;

public class While_loop {

	public static void main(String[] args) {
		int a = 60199;
		
//		int length = String.valueOf(a).length();
//		System.out.println(length);
		int count = 0;
		while(a!=0) {
			a=a/10;
			count++;
		}
		System.out.println(count);
	}

}
