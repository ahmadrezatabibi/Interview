package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main2 {

	public static void main(String []args){
        
        System.out.println(firstUniqChar("leetcode"));
     }
     
	
	public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            } 
        }
        
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (map.get(ch) > 1) {
                return i;
            }
        }
        return -1;
    }

}
