package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainOutputArray {

	public static void main(String []args){
        
        ArrayList<Integer> array = new ArrayList<>();//(ArrayList<Integer>) Arrays.asList(1967513926, 1540383426, -1303455736, -521595368);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        Integer[] arr = { 14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35 };
        List<Integer> arrayList = Arrays.asList(arr);
        ArrayList<Integer> result = rotateArray(arrayList, 56);
        System.out.println(result);
     }
     
	public static ArrayList<Integer> rotateArray(List<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        int devide = B % A.size();
        ret.addAll(A.subList(devide, A.size()));
        for (int i = 0; i < devide; i++) {
            ret.add(A.get(i));
        }
        return ret;
    }
     
     

}
