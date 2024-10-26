package exercise;

import java.util.Arrays;

import org.testng.annotations.Test;

//Given an array of integers, sort it and print unique values only
public class StreamsUniqueSortedArray {

	@Test
	public void uniqueSortedArray() {
		int[] values = { 2, 14, 3, 7, 202, 4, 2, 2, 3, 9, 7, 6, 14, 21, 3 };
		Arrays.stream(values).boxed().sorted().distinct().forEach(s -> System.out.println(s));

	}
}
