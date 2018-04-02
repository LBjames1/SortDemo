package com.liu.entity;
public class BubbleSort {
	public void bubblesort(int[] arr){
		int i,j;
		for(i=0;i<arr.length;i++) 
		{
			for(j=0;j<arr.length-i-1;j++) 
				if(arr[j]>arr[j+1])  
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
		}
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
}
