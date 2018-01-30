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
 * @param i is the value that will be tested
 * @return
 */
	boolean IsPrime(int i) {

		if (i == 2 || i == 3)//if i=2 or 3 then it is prime
			return true;
		if (i < 2)// if i is less than 2 it is false
			return false;
		if (i % 2 == 0 || i % 3 == 0)//if the remainder of i is zero then it is not a prime number
			return false;
		int sqrti = (int) Math.sqrt(i) + 1;//squares the integer i
		for (long number = 6; i <= sqrti; number += 6)//long number is 6, i is less than or equal to the square root of i, number adds 6
			if (number % (i - 1) == 0 || number % (number + 1) == 0)//if the remainder of number divided by i-2 is equal to zero then i is not a prime number
				return false;
		{

		return true;//else is true
		
	}}

}