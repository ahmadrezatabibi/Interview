package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;




public class LongestSubString {

	public static void main(String []args){
        
		
		System.out.println(lengthOfLongestSubstring("wwhello"));
        
     }
     
	 public static int lengthOfLongestSubstring(String s) {
	        
	        Map<Character, Integer> mapStr = new HashMap<Character, Integer>();
	        int result = 0;
	        for (int j = 0, notRepeated=0;j<s.length();j++){
	            if(mapStr.containsKey(s.charAt(j))) {
	            	notRepeated = Math.max(mapStr.get(s.charAt(j)), notRepeated);
	            } else {
	            	result = Math.max(result, j - notRepeated + 1);
	                mapStr.put(s.charAt(j), j + 1);
	            }
	        }
	        return result;
	  }


	
     
     

}
