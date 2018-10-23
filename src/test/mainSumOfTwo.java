package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainSumOfTwo {

	public static void main(String []args){
        
        ArrayList<Integer> array = new ArrayList<>();//(ArrayList<Integer>) Arrays.asList(1967513926, 1540383426, -1303455736, -521595368);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        //Integer[] arr = { 14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35 };
        Integer[] arr = { 5, 10, 2, 1 };
        List<Integer> arrayList = Arrays.asList(arr);
        ArrayList<Integer> result = performOps(arrayList);
        System.out.println(result);
     }
     

	static ArrayList<Integer> performOps(List<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
                B.set(i, A.get(i));
                B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
	}
     
     

}
