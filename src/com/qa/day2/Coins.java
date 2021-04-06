package com.qa.day2;

public class Coins {

	public static void change(double cost, double amount) {

		int n10 = 0;
		int n5 = 0;
		int c20 = 0;
		int c2 = 0;

		double payback = amount - cost;
		System.out.println("Change expected: £" + payback);

		while (payback >= 10) {
			payback -= 10; // payback = payback - 10;
			n10++;
		}
		System.out.println(n10 + ": £10 note");

		while (payback >= 5) {
			payback -= 5;
			n5++;
		}
		System.out.println(n5 + ": £5 note");

		while (payback >= 0.2) {
			payback -= 0.2;
			c20++;
		}
		System.out.println(c20 + ": 20p's");

		// Rounding errors because JAVA rounds down
		while (payback >= 0.019) {
			payback -= 0.019; // use 0.019 instead of 0.02 to overcome
			c2++;
		}
		System.out.println(c2 + ": 2p's");
	}

}

	




//Coins
//Given a cost and an amount, work out the change given in specific coinage.
//For example; the cost is £4.58 and the customer pays with a £20 note so as change they receive:
//1 £10 note
//1 £5 note
//2 20p's
//1 2p