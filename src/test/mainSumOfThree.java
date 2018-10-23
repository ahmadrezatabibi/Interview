package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class mainSumOfThree {

	public static void main(String []args){
		int[] array = new int[] {-1,0,1,2,-1,-4};
        System.out.println(threeSum(array));
       
     }
     

	public static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> resultSet = new HashSet<>();
		List<Integer> result = null;
		int l = 0, r = 0;
		Arrays.sort(nums);
		
		for(int i = 0; i<nums.length-2;i++) {
			l = i +1;
			r = nums.length-1;
			while (l<r) {
				if (nums[i] + nums[l] + nums[r] == 0) {
					result = new ArrayList<>();
					result.add(nums[i]);
					result.add(nums[l]);
					result.add(nums[r]);
					resultSet.add(result);
					l++;
					r--;
				} else if (nums[i] + nums[l] + nums[r] < 0 ) {
					l++;
				} else {
					r--;
				}
			}
		}
		List<List<Integer>> resultSetArray = new ArrayList<>();
		resultSetArray.addAll(resultSet);
		return resultSetArray;
	}
     
     

}
