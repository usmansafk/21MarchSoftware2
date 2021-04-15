package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class First {

	public static void main(String[] args) {

		stream();
		System.out.println();
		chainedStream();

	}

	
	static void stream() {
		int[] numbers1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// metod1 creating a stream from an array
		// Arrays.stream(numbers)

		long C = Arrays.stream(numbers1).count();

		System.out.println("Elements in Array: " + C);

		IntStream stream1 = Arrays.stream(numbers1);

		IntStream stream2 = stream1.map(x -> x * 2);
		IntStream stream3 = stream2.filter(x -> x % 2 == 0);

		stream3.forEach(x -> System.out.print(x + ", "));

	}

	//the same, however chained:
	static void chainedStream() {

		int[] numbers2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		long C = Arrays.stream(numbers2).count();

		System.out.println("Elements in Array: " + C);

		Arrays.stream(numbers2).map(x -> x * 2).filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + ", "));

	}

}
