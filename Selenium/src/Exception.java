
public class Exception {

	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		int c=0;
		int p [] = {10,57,43,96,33};
		System.out.println("start");
		try {
			System.out.println("Risky code");
			 c = a/b;  
			 System.out.println(p[6]);
			 
		}
		catch(ArithmeticException e) {
			System.out.println("Alternative code");
			b=10;
			c=a/b;
			
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println("Index ot of Bound");
			System.out.println(p[3]);
		}
		
		System.out.println(c);
		System.out.println(p[3]);
		
	}

}
