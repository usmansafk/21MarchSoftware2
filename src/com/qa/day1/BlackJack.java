package com.qa.day1;

public class BlackJack {
	
	public int blackjacklol(int a, int b) {
		if(a>21) a = 0;
		if(b>21) b = 0;
		
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}

}


//Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21.
//If they both go over 21 then return 0.