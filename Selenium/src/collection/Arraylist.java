package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(5);
		l.add("A");
		l.add("null");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"P");
		l.add("S");
		System.out.println(l);
		
		
	}

}
