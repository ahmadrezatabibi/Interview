package test;

public class maxOfContiguesArray {

	public static void main(String []args){
        
        int[] array = new int[] {-2,1};
        System.out.println(maxSubArray(array));
        
     }
     
	public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxEnding = 0;
        
        for (int i=0;i<nums.length;i++) {
            maxEnding += nums[i];
            
            if (max < maxEnding) {
                max = maxEnding;
            } 
            if (maxEnding < 0) {
                maxEnding = 0;
            }
        }
        return max;
    }     
     

}
