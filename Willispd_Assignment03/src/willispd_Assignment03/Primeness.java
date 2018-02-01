/**
 * Assignment 03
 * 34-IT-2045C: Computer Programming II
 * Spring semester 2018
 * This program will test an integer named "number" for primeness using a loop
 * @author Willispd
 * Due 2/01/2018
 * 
 */
package willispd_Assignment03;

import java.math.BigInteger;

public class Primeness {
	/**
	 * 
	 * @param n will be given a value in the main class
	 */
	Primeness(int n) {

		int integer, m = 0, Check = 0;// i is the tested integer, m is a constant 0.
		m = n / 2;
		if (n == 0 || n == 1) {//if n is equal to either 0 or 1 it is not a prime number
			System.out.println(n + " is not a prime number");
		} else {
			for (integer = 2; integer <= m; integer++) {//integer=2 , m is 1/n so if m is greater than integer add increment by 1
				if (n % integer == 0) {//if n is divisible by 2 then it is not a prime number
					Check = 1;//check 1 is the equivalent to a boolean=false 
					System.out.println(n + " is not a prime number");
					break;
				}
			}
			if (Check == 0) {//if check is equal to 0 then n is a prime number
				System.out.println(n + " is a prime number");
			}
		}
	}
}