package com.ocpj11.developer.cert.practice.datatypes;


//https://www.geeksforgeeks.org/bitwise-operators-in-java/
public class OperatorsBitwise {
//Java program to illustrate
//bitwise operators

	public static void main(String[] args) {
		// Initial values
		int a = 5; //0101 (In Binary)
		int b = 7; //0111 (In Binary)
		if(a>2 | b<6) {
			System.out.println("ok!");
		}

		// bitwise and
		// 0101 & 0111=0101 = 5
		//if both bits are 1, it gives 1, else it shows 0. 
		System.out.println("a&b = " + (a & b));

		// bitwise or
		// 0101 | 0111=0111 = 7
		//if either of the bits is 1, it gives 1, else it shows 0. 
		System.out.println("a|b = " + (a | b));

		// bitwise xor
		// 0101 ^ 0111=0010 = 2
		//if corresponding bits are different, it gives 1, else it shows 0. 
		System.out.println("a^b = " + (a ^ b));

		// bitwise not
		// ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
		// will give 2's complement (32 bit) of 5 = -6
		System.out.println("~a = " + ~a);

		// can also be combined with
		// assignment operator to provide shorthand
		// assignment
		// a=a&b
		a &= b;
		System.out.println("a= " + a);
	}
}
