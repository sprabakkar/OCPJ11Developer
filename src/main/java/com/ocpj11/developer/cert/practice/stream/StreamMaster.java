package com.ocpj11.developer.cert.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMaster {

	public static void main(String[] args) {
		StreamMaster.streamTesting();
	}

	public static void streamTesting() {
		List<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);

		// using map function
		List<Integer> updatedNumbers = numbers.stream().map((i) -> i * 2).collect(Collectors.toList());

		System.out.println(updatedNumbers);
	}

}
