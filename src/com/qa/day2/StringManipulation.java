package com.qa.day2;

public class StringManipulation {
	
	static String a = "yesterday it was raining";
	static String b = "today it is sunny";
	
	public static void stringConcat() {
		String weather = b.toUpperCase() + " " + a.toUpperCase();
		System.out.println(weather);
		System.out.println(weather.length());
		System.out.println(weather.substring(0, 12) + weather.substring(35, 42));
		
	}
	
	//Method 1 - When given a String, count and return how many words there are in that String.
	public static int stringLength(String x) {
		 int count = x.length();
		 System.out.println(count);
		 return count;
	}


	

}


/*


Exercises

Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”

Concatenate both values, capitalise both strings and print out the result.
The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING

Solution
Now use the substring method to print out: `TODAY IT IS RAINING`
Solution
For this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only allowed to use the length(), substring(), and equals() methods. Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of the exercise:

Method 1 - When given a String, count and return how many words there are in that String.
Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. A boolean value should be returned to indicate whether or not the second String has been found in the message.

*/