package com.example.streamapienhancement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIEnhancementsExample {
	public static void main(String[] args) {
		// Example 1: takeWhile() and dropWhile() methods
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<Integer> result1 = numbers.stream().takeWhile(n -> n < 4).collect(Collectors.toList()); // [1, 2, 3]

		List<Integer> result2 = numbers.stream().dropWhile(n -> n < 4).collect(Collectors.toList()); // [4, 5, 6]

		System.out.println("Result 1: " + result1);
		System.out.println("Result 2: " + result2);

		// Example 2: ofNullable() method
		String str = null;

		Stream<String> stream1 = Stream.ofNullable(str); // empty stream

		str = "hello";

		Stream<String> stream2 = Stream.ofNullable(str); // stream containing "hello"

		stream1.forEach(System.out::println); // nothing printed
		stream2.forEach(System.out::println); // prints "hello"

		// Example 3: iterate() method with a Predicate parameter
		Stream.iterate(1, n -> n < 10, n -> n * 2).forEach(System.out::println); // 1 2 4 8

		// Example 4: using takeWhile() and dropWhile() on an ordered stream
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<Integer> result = numbers2.stream().sorted(Comparator.reverseOrder()).takeWhile(n -> n > 3)
				.collect(Collectors.toList()); // [6, 5, 4]

		System.out.println("Result: " + result);
	}
}
