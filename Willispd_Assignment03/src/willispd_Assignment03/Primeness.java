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
	 * @param n
	 */
	Primeness(int n) {

		int i, m = 0, Check = 0;// i is the tested integer, m is a constant 0,
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not a prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime number");
					Check = 1;
					break;
				}
			}
			if (Check == 0) {
				System.out.println(n + " is a prime number");
			}
		}
	}
}
