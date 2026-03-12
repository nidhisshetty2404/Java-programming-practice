package Module7;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){// take int only if ur returning
        int n = arr.length;
        for(int i = 1; i<n; i++){ // no of iterations(n-1)
            for(int j = 0; j<n-i; j++){ // second last element
                if(arr[j] > arr[j+1]){
                    // swap arr[j] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,8,5,4,6,7,2};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


