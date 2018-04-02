package com.liu.entity;
public class Test {
	public static void main(String[] args) {
		int[] arr1={2,13,22,4,31,21,1};
	/*	BubbleSort b=new BubbleSort();
		b.bubblesort(arr1);
		ChoseSort c=new ChoseSort();
		c.chosesort(arr1);
		InsertionSort i=new InsertionSort();
		i.insertionsort(arr1);    */
		HillSort h=new HillSort();
		h.hillsort(arr1);
	}
}
