package test;

import java.util.ArrayList;

public class main {

	public static void main(String []args){
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        int value = 0;
        for (int i = 0; i < 3; i++) {
        	ArrayList<Integer> B = new ArrayList<Integer>();
			for (int j = i; j < i+3; j++) {
				
				B.add(value);
				value++;
			}
			
			A.add(B);
		}
        System.out.println(A);
        ArrayList<ArrayList<Integer>> B = performOps(A);
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < B.get(i).size(); j++) {
                System.out.print(B.get(i).get(j) + " ");
            }
        }
     }
     
     static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());
        
            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }
            System.out.println(B);

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }

}
