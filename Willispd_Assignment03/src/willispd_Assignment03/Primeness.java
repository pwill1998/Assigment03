/**
 * Assignment 03
 * 34-IT-2045C: Computer Programming II
 * Spring semester 2018
 * This program will test an BigInteger named "number" for primeness using a loop
 * @author Willispd
 * Due 2/01/2018
 * 
 */
package willispd_Assignment03;

import java.math.BigInteger;

/**
 * 
 * @param number, this is what the the program will be testing
 */
public class Primeness {
	BigInteger two = new BigInteger("2");// creates a new big integer object
	BigInteger three = new BigInteger("3");

	boolean isPrime(BigInteger number) {

		if (number.mod(two) == BigInteger.ZERO && number.compareTo(two) != 0) {//is the same as number%2==BigInteger.zero and number  
			return false;//if the big integer is equal to 2 then it is not prime
		}
		for (BigInteger i = three; i.multiply(i).compareTo(number) < 1; i.add(two)) {//if i=3  i(number) i less than 1, then add 2
			if (number.mod(i) == BigInteger.ZERO) {
				return false;
			}
			}
		return true;
	}
}
