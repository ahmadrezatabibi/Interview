/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rtabibi
 *
 */
public class phoneNumberToLetterCombination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = letterCombinations("24");
		list.stream().forEach(x->System.out.print(x));

	}
	public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0)   return res;
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        letterCombinations(digits, mapping, res, new StringBuilder(), 0);
        return res;
    }
    
    private static void letterCombinations(String digits, String[] mapping, List<String> res, StringBuilder sb, int i) {
        if (i == digits.length()) {
            res.add(sb.toString());
            return;
        }
        int digit = Character.getNumericValue(digits.charAt(i));
        for (int j = 0; j < mapping[digit].length(); j++) {
            sb.append(mapping[digit].charAt(j));
            letterCombinations(digits, mapping, res, sb, i + 1);
            sb.deleteCharAt(sb.length() - 1);
        }   
    }

}
