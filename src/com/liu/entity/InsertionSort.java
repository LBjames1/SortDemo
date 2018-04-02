package com.liu.entity;
public class InsertionSort {
	public void insertionsort(int[] arr){
		 for (int i = 1; i < arr.length; i++) {  
	         int temp = arr[i];  
	         int j = i - 1;  
	         for (; j >= 0 && arr[j] > temp; j--) {  
	             //将大于temp的值整体后移一个单位  
	             arr[j + 1] = arr[j];  
	         }  
	         arr[j + 1] = temp;  
	     }  
		 for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+",");
		 }
	}
}
