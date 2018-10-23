package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;




public class linkedlistToStack {

	public static void main(String []args){
        
		int[] nums = new int[] {3,2,4};
		int[] result = twoSum(nums, 6);
		for (int i : result) {
			System.out.println(i);
		}
		System.out.println();
        
     }
     
	public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.stream(nums).forEach(list::add);
        for(int i=0;i<nums.length;i++) {
            
            int result = target - list.get(i);
            if (list.contains(result)) {
                return new int[] {i,list.indexOf(result)};
            }
        }
        return null;
    }


	
     
     

}
