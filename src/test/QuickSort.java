package test;

import java.util.Arrays;

public class QuickSort {

	public static void main(String []args){
        
        int[] array = new int[] {-2,1,-1,3,1,2,5};
        quickSort(array);
        Arrays.stream(array).forEach(a->System.out.print(a + ", "));
        
     }
	
	static void quickSort(int A[]) {
		quickSort(A, 0, A.length-1);
	}
     
	static void  quickSort(int A[], int si, int ei) 
    { 
        int pi; 
  
        /* Partitioning index */
        if (si < ei) { 
            pi = partition(A, si, ei); 
            quickSort(A, si, pi - 1); 
            quickSort(A, pi + 1, ei); 
        } 
    } 
	
	static int partition(int A[], int si, int ei) 
    { 
        int x = A[ei]; 
        int i = (si - 1); 
        int j; 
  
        for (j = si; j <= ei - 1; j++) { 
            if (A[j] <= x) { 
                i++; 
                int temp = A[i]; 
                A[i] = A[j]; 
                A[j] = temp; 
            } 
        } 
        int temp = A[i + 1]; 
        A[i + 1] = A[ei]; 
        A[ei] = temp; 
        return (i + 1); 
    } 
  
     

}
