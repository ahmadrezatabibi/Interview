package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class reverseStringOnlyLetters {

	public static void main(String []args){
		String S = "a-bC-dEf-ghIj"; 
				
        System.out.println(reverseOnlyLetters(S));
       
     }
     

	 public static String reverseOnlyLetters(String S) {
	        char[] charArray = S.toCharArray();
	        
	        int i = 0;
	        int j = S.length() -1 ;
	        
	        while (i<=j) {
	            if (Character.isLetter(charArray[i]) && Character.isLetter(charArray[j])) {
	                char temp = charArray[i];
	                charArray[i] = charArray[j];
	                charArray[j] = temp;
	                i++;
	                j--;
	            } else if (!Character.isLetter(charArray[i])) {
	                i++;
	            } else if (!Character.isLetter(charArray[j])) {
	                j--;
	            }
	        }
	        return new String(charArray);
	    }
     
     

}
