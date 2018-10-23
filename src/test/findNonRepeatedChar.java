package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findNonRepeatedChar {

	public static void main(String []args){
        
        //ArrayList<Integer> array = new ArrayList<>();//(ArrayList<Integer>) Arrays.asList(1967513926, 1540383426, -1303455736, -521595368);
        //Integer[] arr = { 336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421 };
		Integer[] arr = { 336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421};
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(arr));
        ArrayList<Integer> result = maxset(array);
        System.out.println(result);
     }
     
	public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
		int mid = (int) Math.ceil((double)A.size()/2);
        A = performOps(A);
        if(mid > A.size())
        	mid = (int) Math.ceil((double)A.size()/2);
        if (A == null || A.size() == 0)
            return null;
        ArrayList<Integer> first = new ArrayList<>();
        first.addAll(A.subList(0, mid));
        ArrayList<Integer> second = new ArrayList<>();
        second.addAll(A.subList(mid, A.size()));
        BigInteger firstSum = calcArraySum(first);
        BigInteger secondSum = calcArraySum(second);
        if (firstSum.compareTo(secondSum) == 0) {
            if(first.size() > second.size()) {
                return first;
            } 
            return second;    
        } else if (firstSum.compareTo(secondSum) > 0){
            return first;
        } else {
            return second;
        }
        
    }
    
    public static ArrayList<Integer> performOps(ArrayList<Integer> arr) {
         ArrayList<Integer> result = new ArrayList<>();
         for (Integer integer : arr) {
             if (integer > 0) {
                 result.add(integer);
             }
         }
        return result;
     }
     
     public static BigInteger calcArraySum(ArrayList<Integer> arr) {
         BigInteger result = new BigInteger("0");
         for (Integer integer : arr) {
            BigInteger value =  BigInteger.valueOf(integer);
            result = result.add(value);
        }
        return result;
     }
     
     

}
