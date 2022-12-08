package com.ocpj11.developer.cert.practice.datatypes;

import java.util.ArrayList;
import java.util.Arrays;

public class OperatorDataTypeMaster {


	/*
	 * Q 11 - Answer B - StringBuilder
	 */
	public static void secret(StringBuilder mystery) {
		char ch = mystery.charAt(1);
		System.out.println("ch ::: " + ch);
		mystery = mystery.insert(0, "more");
		System.out.println("mystery ::: " + mystery.toString());
		int num = mystery.length();
		System.out.println("length ::: " + num);
	}

	/*
	 * Q 12 - Answer B
	 */
	public static void stringBuilderAppend() {
		var teams = new StringBuilder("333");
		teams.append(" 806");
		teams.append(" 1601");
		System.out.print(teams);
	}

	// Q 13, Answer A
	public static void notValidDeclaration() {
		// double num1, int num2 = 0;
		int num11, num21;
		int num12, num22 = 0;
		int num13 = 0, num23 = 0;
		System.out.println("testing!!");
	}

	// Q 14, Answer E

	// Q 15, Answer A
	public static void lambdaFunctionTestwithList() {

		var list = new ArrayList<Integer>();
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);

		System.out.println("List size ::: " + list.size());

		var num = 9;
		boolean bool = list.removeIf(x -> {
			int keep = num;
			System.out.println("x : " + x + ", num : " + num + ", keep : " + keep);
			boolean bol1 = (x != keep);
			System.out.println(bol1);
			return bol1;
		});
		System.out.println("list(1) ::: " + list.size());

		list.removeIf(x -> {
			int keep = num;
			System.out.println("x : " + x + ", num : " + num + ", keep : " + keep);
			return x == keep;
		});
		System.out.println("list(2) ::: " + list);

	}

	// Q 16, Answer C
	public static void subStringExample() {
		var happy = " :) - (: ";
		var really = happy.trim();
		System.out.println("really =" + really + "=");
		String name = "Prabakar";
		// System.out.println(name.charAt(0));
		// System.out.println(name.length());
		// System.out.println(name.charAt(name.length()-1));
		System.out.println(name.substring(1, name.length() - 1));
		System.out.println("=" + happy.substring(1, happy.length() - 1) + "=");
	}

	// Q 17, Answer C
	public static void compilerErrorExample() {
		double num1 = 2.718;
		// double num2 = 2._718;Error
		double num3 = 2.7_1_8;
		// double num4 = _2.718;//Error
	}

	// Q 18 , Answer A

	// Q 19 , Answer D
	public static void stringSubString() {
		var builder = "54321";
		builder = builder.substring(4);
		System.out.println("builder ::: "+builder.toString());
		System.out.println(builder.charAt(2));
	}
	
	//Q 20, Answer D
	public static void operatorsExamplae() {
		int init = 11;
        int split = 3;
        int partA = init / split;
        int partB = init % split;
        int result = split * (partB + partA);
        System.out.print(result);
	}
	
	/*
	 * Increment and decrement operators require special care because the order in
	 * which they are attached to their associated variable can make a difference in
	 * how an expression is processed. 
	 * 
	 * If the operator is placed before the operand, referred to as the pre-increment operator (++x) and the pre-decrement(--x) operator,
	 * The operator is applied first and the value returned is the new value of the expression. 
	 * 
	 * Alternatively, if the operator is placed after the operand, referred to as the post-increment(x++) operator and the post-decrement(x--) operator,
	 * then the original value of the expression is returned, with operator applied after the value is returned.
	 * 
	 */	//Q 21, Answer C
	public static void varExample() {
		//var sb = new StringBuilder("radical").insert(sb.length(), "robots");
		//System.out.println(sb);
	}
	
	
	//Q 22, Answer A
	public static void chainedTernaryOperator() {
		int time = 9;
	    int day = 3;
	    
	    //condition1=true condition2=true = 1st expression,    c
	    //condition1=true condition2=false = 2nd expression
	    //condition1=false condition2=true = 3rd expression
	    //condition1=false condition2=false = 3rd expression
	    
	    //             con1           con2       exp1        exp2       exp3
	    var dinner = ++time >= 10 ? day-- <= 3 ? "Takeout" : "Salad" : "Leftovers";
	    
	    System.out.println(dinner);
	    
	    String input = ""; // get input parameter String from somewhere.

	    int value = input == null ? 100 : input.equals("") ? 70 : Integer.parseInt(input);
	    System.out.println(value);
	    
	    int value2 = input == null || input.equals("") ? 700 : Integer.parseInt(input);
	    System.out.println(value2);
	    

	}
	
	
	// Q 23, Answer A 
	public static void stringConcatExample() {
		var teams = new String("694");
		teams.concat(" 1155");
	    teams.concat(" 2265");
	    teams.concat(" 2869");
	    System.out.println(teams);
	}
	
	// Q 24, Answer C
	//bool, Bool are not java keyword, int cannot be null
	public static void wrongDataType() {
		 //bool b = null;
	     //Bool bl = null;
	     //int i = null;
	     Integer in = null;
	     String s = null;
	}
	
	// Q 25, Answer A
	public static void inclusiveOrTesting() {
		int height = 2, length = 3;
	     boolean w = (height> 1) | (--length < 4);
	     System.out.println(w+", "+length);
	     var x = height!=2 ? length++ : height;
	     System.out.println(x);
	     boolean z = height % length == 0;
	     System.out.println(w + "-" + x + "-" + z);
	}
	
	
	//Q 26, Answer A
	public static void stringBuilderSubStringAgain() {
		var sb = new StringBuilder();
		   sb.append("red");
		   sb.deleteCharAt(0);
		   sb.delete(1, 2);
		   System.out.println(sb);
		   
		   StringBuilder sbdr = new StringBuilder("Niagara");
		   String str = sbdr.substring(0, 5);
		   System.out.println(str);
		   
		   StringBuilder str1 = sbdr.delete(1, 5);
		   System.out.println(str1.toString());
		   
		   String nameA = "Niagara";
		   System.out.println(nameA.length());
		   String str2 = nameA.substring(0, 7);
		   System.out.println(str2);
	}
	
	//Q 27, Answer D
	
	
	//Q 28, Answer E
	public static void complexBooleanTesting() {
		 boolean carrot = true;
	     Boolean potato = false;
	     var broccoli = true;
	     carrot = carrot & potato;
	     broccoli = broccoli ? !carrot : potato;
	     potato = !broccoli ^ carrot;
	     System.out.println(carrot + "," + potato + "," +broccoli);		
	}
	
	// Q 29, Answer B
	public static void lambdaListTesting() {
		var babies = Arrays.asList("chick", "cygnet","duckling");
		babies.replaceAll(x -> { var newValue = "baby"; return newValue; });
		System.out.println(babies);
	}
	
	
	//Q 30, Answer D
	public static void substringonStrBuilder() {
		var builder = new StringBuilder("54321");
		System.out.println(builder.substring(2).toString());
		System.out.println(builder.charAt(1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void incrementDecrementOperatorExample() {

		/*
		 * int x = 10; System.out.println(x); System.out.println(++x);
		 * System.out.println(x); System.out.println("=================="); int y = 10;
		 * System.out.println(y); System.out.println(y++); System.out.println(y);
		 * 
		 * 
		 * System.out.println("=========="); int lion = 3; int tiger = ++lion * 5 /
		 * lion--; System.out.println("lion is " + lion); System.out.println("tiger is "
		 * + tiger);
		 */
		
		//System.out.println("1 + 2 = " + 1 + 2);
		//System.out.println("1 + 2 = " + (1 + 2));
		//int z = 1;
		//System.out.println((++z)*(z--)/(z--));
		
		int x = 5;
		int y = 10;
		//System.out.println(6*9%10);
		
		/*
		 * the below line y value is 10 but actually y value decreased by 1 because of
		 * the post-decrement operator, but x value increased by 1 because of pre-increment operator
		 * 
		 * Also post-increment/decrement(left-2-right) operator had higher precedence than 
		 * pre-increment/decrement(right-2-left) operator
		 * 
		 * so the value is y=10 (actual assigned value 9), x=6, so 10x6=60
		 * 
		 * the evaluation goes from left-2-right and numerator to denominator
		 * 
		 * https://introcs.cs.princeton.edu/java/11precedence/
		 */
		
		//int z = ++x * y--;//so y=10 (actual assigned value 9) and x=6, so 10x6=60
		//System.out.println(z);
		//System.out.println(y);//in this line y retrieved the assigned value from the memory store, y=9 because of the post-decrement operator
		
		
		
		//int z = (++x * y--) / y--;//in this line numerator y value is 10 and denominator y value is 9 (actual assigned value 8) and x=6, so 16*10/9=6, left-2-right, so y value decreased in the numerator first than y at the denominator value
		//System.out.println(6*10/9);
		//System.out.println(z);
		//System.out.println(y);//in this line y retrieved the assigned value from the memory store, y=8 because of the using post-decrement operator two times
		
		
		
		//         6     10              11
		//int z = ((++x * y++) + 6) % (1+(y--));
		//System.out.println( ( (6*10) + 6) % (1+11) );
		//System.out.println(z);
		//System.out.println(y);
		
		
		//         6     9                 10
		//int z = ((++x * y++) + 6) % (1 + (y--));
		//System.out.println(((6 * 9) + 6) % (1 + 10));
		//System.out.println(z);
		//System.out.println(y);
		
		
		//                   10            11       10
		//System.out.println( (y++) +", "+ (y--)+", "+y );
		//int a = y--;
		
		//System.out.println(a);
		//System.out.println(y);
		
		

		//System.out.println("1 + 2 = " + 1 + 2);
		//System.out.println("1 + 2 = " + (1 + 2));
		
		//System.out.println(1 + 2 + "abc");
		//System.out.println("abc" + 1 + 2);
		
		//boolean m = false;
		//boolean n = false;
		//boolean o = true;
		//System.out.println(m == n == o);
		
		
		//int one = 1;
		//int two = 2;
		//System.out.println(  ++two );
		
		
		int lion = 3;
		int tiger = ++lion * 5 / lion--;
		System.out.println("lion is " + lion);
		System.out.println("tiger is " + tiger);
		
		
		String q = (++x) +", "+ (++x) +", "+ (x--);
		
		System.out.println(q);
	}
	

}
