package com.liu.entity;
public class ChoseSort {
	public void chosesort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.printf("%d,",arr[i]);
		}
	}
}
