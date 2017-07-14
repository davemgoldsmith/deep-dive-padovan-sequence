/**
 * 
 */
package edu.cnm.deepdive.padovan;

import java.math.BigInteger;

/**
 * @author davem
 *
 */
public class PadovanTest {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		padovan(3);

	}
	private static void padovan(int numTerms){
		BigInteger p0 = BigInteger.ZERO;
		BigInteger p1 = BigInteger.ZERO;
		BigInteger p2 = BigInteger.ONE;
	
		
		for (int i = 0; i < numTerms; i++){
			BigInteger next = p0.add(p1);
			System.out.printf("%,d%n", next);
			p0 = p1;
			p1 = p2;
			p2 = next;
			
		}
		
	}

}
