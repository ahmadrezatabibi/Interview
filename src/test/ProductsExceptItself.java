package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ProductsExceptItself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,2,3,4};
		int[] result = productExceptSelf(array);
		Arrays.stream(result).forEach(x->System.out.print(x + " "));
	}
	
	public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 1;
        for (int i = 0;i<nums.length;i++) {
        	result[i] = sum;
        	sum= sum * nums[i];
        	
        }
        sum = 1;
        for(int j = nums.length-1; j>=0;j--) {
        	result[j] *= sum;
        	sum = sum * nums[j];
        	
        }
        
        return result;
    }

}
