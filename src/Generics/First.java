package Generics;

import java.util.ArrayList;

public class First {
	public static void main(String[] args) {
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		Test<Integer> ref1 = new Test<Integer>();
		Test<String> ref2 = new Test<String>();
		
		ref1.msg(12);
		ref2.msg("Usman");
		
		
		

	}

}
