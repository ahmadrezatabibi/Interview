package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidPalindrome {

	public static void main(String []args){
		String S = "cacs"; 
				
        System.out.println(validPalindrome(S));
       
     }
     

	 public static boolean validPalindrome(String str) {
		 char[] charArray = str.toCharArray();
		 
		 int i = 0;
		 int j = charArray.length-1;
		 
		 while (i < j) {
			 while (i<charArray.length && !Character.isLetter(charArray[i])) {
				 i++;
			 }
			 while (j>0 && !Character.isLetter(charArray[j])) {
				 j--;
			 }
			 if (i<charArray.length && j>0 && charArray[i] != charArray[j]) {
				 return false;
			 }
			 i++;
			 j--;
		 }
		 return true;
	 }
     
     

}
