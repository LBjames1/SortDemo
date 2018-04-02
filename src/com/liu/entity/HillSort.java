package com.liu.entity;
public class HillSort {
	public void hillsort(int[] arr){
		int i;  
	    int j;  
	    int temp;  
	    int gap = 1;  
	    int len = arr.length;  
	    while (gap < len / 3) { gap = gap * 3 + 1; }  
	    for (; gap > 0; gap /= 3) {  
	        for (i = gap; i < len; i++) {  
	            temp = arr[i];  
	            for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap) {  
	                arr[j + gap] = arr[j];  
	            }  
	            arr[j + gap] = temp;  
	        }  
	    } 
	    for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
}
