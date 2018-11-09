//Iterative Solution

import java.io.*;
import java.util.*;
class Test { 
	static int factorial(int n) { 
		int res = 1, i; 
		for (i=2; i<=n; i++) 
			res *= i; 
		return res; 
	} 

	public static void main(String[] args) { 
		int num = 5; 
		System.out.println("Factorial of "+ num + " is " + factorial(5)); 
	} 
} 



// Recursive Solution

import java.io.*;
import java.util.*;
class Test { 
	static int factorial(int n){ 
		if (n == 0) 
		return 1; 
		return n*factorial(n-1); 
	} 

	public static void main(String[] args) { 
		int num = 5; 
		System.out.println("Factorial of "+ num + " is " + factorial(5)); 
	} 
} 


// Using Ternary Operator

import java.io.*;
import java.util.*;
class Factorial { 
int factorial(int n) { 
	return (n == 1 || n == 0) ? 1 : n * factorial(n - 1); 
} 

public static void main(String args[])	 { 
	Factorial obj = new Factorial(); 
	int num = 5; 
	System.out.println("Factorial of " + num + 
					" is " + obj.factorial(num)); 
} 
} 


// Time complexity of all solutions is O(n).

