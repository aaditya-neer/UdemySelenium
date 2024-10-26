package section_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamOperations {

	public void streamsFilter() {// Filters values fulfilling certain conditions
		List<String> names = new ArrayList<String>();

		names.add("Anima");
		names.add("Anisha");
		names.add("Nishu");
		names.add("Aniket");
		names.add("Abhishek");
		// Print the count of the names starting with 'A'.
		System.out.println(names.stream().filter(s -> s.startsWith("A")).count());
		// Print the names with alphabet count more than 5.
		names.stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));
		// Print only one name that has more than 5 characters.
		names.stream().filter(s -> s.length() > 5).limit(1).forEach(s -> System.out.println(s));
	}

	public void streamsMap() {// Manipulate data in the stream
		List<String> names = Arrays.asList("Anima", "Anisha", "Nishu", "Aniket", "Abhishek");
		// Print names not starting with 'A' in all capital letters.
		names.stream().filter(s -> !s.startsWith("A")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		// Print names not starting with 'A' in all capital letters and sorted
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}

	public void concatStreams() {// concatenate two streams.
		List<String> names1 = Arrays.asList("Anima", "Anisha", "Nishu", "Aniket", "Abhishek");
		List<String> names2 = Arrays.asList("Khusboo", "Gudia", "Nisha", "Sunny", "Kisan");

		Stream<String> newStream = Stream.concat(names1.stream(), names2.stream());
		newStream.sorted().forEach(s -> System.out.println(s));
	}

	public void anyMatchStreams() {
		List<String> names = Arrays.asList("Anima", "Anisha", "Nishu", "Aniket", "Abhishek");

		boolean flag = names.stream().anyMatch(s -> s.equalsIgnoreCase("Aniket"));
		Assert.assertTrue(flag);
	}

	public void collectStreams() {
		List<String> ls = Stream.of("Anima", "Anisha", "Nishu", "Aniket", "Abhishek").sorted().map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(ls.get(0));
	}

}
