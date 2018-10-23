package test;

public class LongestPlandirom {
	
	public static void main(String[] args) {
		System.out.println(longestPalindrom("bbbba"));
	}
	
	public static String longestPalindrom(String str) {
		if(str.isEmpty())
			return new String("");
		int start = 0;
		int end =0;
		for (int i=0; i<str.length(); i++) {
			int len1 = validPalindrom(str, i, i);
			int len2 = validPalindrom(str, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) /2;
				end = i + (len / 2); 
			}
		}
		return str.substring(start, end + 1);
	}
	
	public static int validPalindrom(String str, int i, int j) {
		int left = i;
		int right = j;
		while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
		
		return right - left -1;
	}
	
	

}
