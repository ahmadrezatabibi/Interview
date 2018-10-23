package test;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {
		System.out.println(romanToInt("IV"));
	}

	 public static int romanToInt(String s) {
	        Map<Character, Integer> romanCharacters = new HashMap<>();
	        romanCharacters.put('I', 1);
	        romanCharacters.put('V', 5);
	        romanCharacters.put('X', 10);
	        romanCharacters.put('L', 50);
	        romanCharacters.put('C', 100);
	        romanCharacters.put('D', 500);
	        romanCharacters.put('M', 1000);
	        int sum = 0;
	        for(int i = 0; i<s.length();i++) {
	            char ch = s.charAt(i);
	            char nextCh = i+1<s.length() ? s.charAt(i+1) : '#';
	            
	            switch (ch) {
	                case 'I':
	                    if (nextCh != '#' && nextCh == 'V' || nextCh == 'X') {
	                        sum = sum + (romanCharacters.get(nextCh) - romanCharacters.get(ch));
	                    	i++;
	                    	continue;
	                    }
	                case 'X':
	                    if (nextCh != '#' && nextCh == 'L' || nextCh == 'C') {
	                        sum = sum + (romanCharacters.get(nextCh) - romanCharacters.get(ch));
	                    	i++;
	                    	continue;
	                    }
	                case 'C':
	                    if (nextCh != '#' && nextCh == 'D' || nextCh == 'M') {
	                    	sum = sum + (romanCharacters.get(nextCh) - romanCharacters.get(ch));
	                    	i++;
	                    	continue;
	                    }
	                default:
	                    if (romanCharacters.containsKey(ch)) {
	                       sum = sum + romanCharacters.get(ch);
	                    }
	            }
	        }
	        
	        return sum;
	    }
}
