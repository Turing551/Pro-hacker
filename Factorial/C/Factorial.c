// Iterative Solution

#include<stdio.h> 
unsigned int factorial(unsigned int n) { 
	int res = 1, i; 
	for (i=2; i<=n; i++) 
		res *= i; 
	return res; 
} 
int main() { 
	int num = 5; 
	printf("Factorial of %d is %d", num, factorial(num)); 
	return 0; 
} 


// Recursive Solution

#include<stdio.h> 
unsigned int factorial(unsigned int n) { 
	if (n == 0) 
	return 1; 
	return n*factorial(n-1); 
} 
int main() { 
	int num = 5; 
	printf("Factorial of %d is %d", num, factorial(num)); 
	return 0; 
} 

// Using Ternary operator

#include<iostream> 
int factorial(int n) {  
	return (n==1 || n==0) ? 1: n * factorial(n - 1); 
} 

int main() { 
	int num = 5; 
	printf ("Factorial of %d is %d", num, factorial(num)); 
	return 0; 
} 

 
