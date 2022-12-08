package com.ocpj11.developer.cert.practice.datatypes;
/**
 * 
 * @author prabakarsingaram
 *
 */

/**
1. We can declare any datatype with the var keyword.
2. var can be used in a local variable declaration.
3. var cannot be used in an instance and global variable declaration.
4. var cannot be used as a Generic type.
5. var cannot be used with the generic type.
6. var cannot be used without explicit initialization.
7. var cannot be used with Lambda Expression.
8. var cannot be used for method parameters and return type.
*/
		

public class VarKeyWordExample {
	public static void main(String[] args) {
		// int
		var x = 100;

		// double
		var y = 1.90;

		// char
		var z = 'a';

		// string
		var p = "tanu";

		// boolean
		var q = false;

		// type inference is used in var keyword in which it
		// automatically detects the datatype of a variable
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);
		System.out.println(q);
	}
}
/*
//Java program to demonstrate that
//var can be used to declare a local variable

class Demo2 {
 public static void main(String[] args)
 {

     // local variable
     var x = 100;

     // print x to the console
     System.out.println(x);
 }
}

//Java program to demonstrate that
//var cannot be used to declare
//instance and global variables

class Demo3 {

 // instance variable
 var x = 50;
 public static void main(String[] args)
 {
     System.out.println(x);
 }
}


//Java program to demonstrate that
//var cannot be used as a Generic
//type

import java.util.*;
class Demo4 {
 public static void main(String[] args)
 {
       // Generic list using var
     var<var> al = new ArrayList<>();
         
       // add elements
     al.add(10);
     al.add(20);
     al.add(30);
     
     // print the list
     System.out.println(al);
 }
}

// Java program to demonstrate that
// var cannot be used with Generic type

import java.util.*;
class Demo5 {
	public static void main(String[] args)
	{
		// var used with Generic type
		var<Integer> al = new ArrayList<Integer>();
		
		// add elements
		al.add(10);
		al.add(20);
		al.add(30);
		
		// print the list
		System.out.println(al);
		
		// This is valid since type is decided
		// based on ArrayList<String>
		var list = new ArrayList<String>();
	}
}


// Java program to demonstrate that
// var cannot be used without explicit
// initialization

import java.io.*;

class Demo6 {
	public static void main(String[] args)
	{

		// declaration without
		// initialization
		var variable;
		
		// This is also not valid
		var variable = null;
	}
}


// Java program to demonstrate that
// var cannot be used with Lambda
// Expression

import java.util.*;

interface myInt {
	
	int add(int a, int b);
}
class Demo7 {
	public static void main(String[] args)
	{
		
		// var cannot be used since they
		// require explicit target type
		var obj = (a, b) -> (a + b);

		// calling add method
		System.out.println(obj.add(2, 3));
	}
}


// Java program to explain that
// var cannot be used for a method
// parameters and return type

class Demo8 {

	// method1 using var
	// as a return type
	var method1() { return ("Inside Method1"); }

	// method2 using var for a
	// parameter
	void method2(var a) { System.out.println(a); }

	public static void main(String[] args)
	{

		// create an instance
		Demo1 obj = new Demo1();

		// call method1
		var res = obj.method1();

		// call method2
		obj.method2();
	}
}




*/