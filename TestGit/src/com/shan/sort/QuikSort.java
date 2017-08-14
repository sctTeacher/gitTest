package com.shan.sort;

import java.util.Arrays;

public class QuikSort {
	
	public static void main(String[] args) {
		int arr[]={4,1,5,2,55,55,0,-1,6,1,2,1,8,};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		Arrays a=null;
	}
	//{1,4,5,2}     
	public static void sort(int arr[], int L, int R) {
		int i = L;// ���������
		int j = R;// ���ұ�����
		int x = arr[(L + R) / 2];// �����м����
		while (i <= j) {
			// ���С���м��� i++
			while (arr[i] < x) {
				i++;
			}
			// �ұ��������м���j--
			while (arr[j] > x) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			// ��ߵݹ�
			if (L < j) {
				sort(arr, L, j);
			}
			// �ұߵݹ�
			if (i < R) {
				sort(arr, i, R);
			}
		}
	}

	public static void sort1(int [] arr ,int L,int R){
		
		int i=L;
		int j=R;
		int x=arr[(L+R)/2];
		
		while(i<=j){
			while(arr[i]<x){
				i++;
			}
			while(arr[j]>x){
				j--;
			}
			
			if(i<=j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			
			if(L<j){
				sort1(arr, L, j);
			}
			if(i<R){
				sort1(arr, i, R);
			}
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
