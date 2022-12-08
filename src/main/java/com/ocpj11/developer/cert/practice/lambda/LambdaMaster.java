package com.ocpj11.developer.cert.practice.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaMaster {
	public static void main(String[] args) {
		System.out.println("Lambda Tester!!!");
		LambdaMaster.lambdaExpressionTest();//.lambdaConsumerList();
	}

	public static void lambdaLoopTest() {
		// create an ArrayList
		ArrayList<String> languages = new ArrayList<>();

		// add elements to the ArrayList
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");

		// print arraylist
		System.out.print("ArrayList: ");

		// iterate over each element of arraylist
		// using forEach() method
		languages.forEach((e) -> {
			System.out.print(e + ", ");
		});
	}

	public static void lambdaNumbersList() {
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(5);
		numbersList.add(9);
		numbersList.add(8);
		numbersList.add(1);
		numbersList.forEach((n) -> {
			System.out.println(n);
		});
	}

	public static void lambdaConsumerList() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		Consumer<Integer> method = (n) -> {
			System.out.println(n);
		};
		numbers.forEach(method);
	}

	public static void lambdaConcatTest() {
		StringOp s = (left, right) -> left + right + "OK!";
		String op = s.concat("Hello", " World");
		System.out.println(op);
	}

	public static void printFormatted(String str, StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}

	public static void lambdaExpressionTest() {
		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);
	}

}

interface StringOp {
	String concat(String left, String right);
}

interface StringFunction {
	String run(String str);
}
