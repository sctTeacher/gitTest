package com.shan.sort;

import java.util.Arrays;

/**
 * �鲢����
 * 
 * @author sc
 *
 */
public class GuibignSort {
	public static void main(String[] args) {
		/*
		 * int [] a={1,3,5,6}; int []b={2,3,8,10}; int[] arr=marge(a,b);
		 * System.out.println(Arrays.toString(arr));
		 */
		GuibignSort sorter = new GuibignSort();
		int[] arr = { 1, 3, 2, 4, 5 };
		sorter.mergeSort(arr);

		System.out.println(Arrays.toString(arr));
	}

	// L �����һ������ M�м����� R�������һ������{1,3,2,4,5}
	public void merge(int[] arr, int L, int M, int R) {
		// ��������м�ֳ�������
		int[] left = new int[M - L];
		int[] right = new int[R - M + 1];
		// ����������
		for (int i = L; i < M; i++) {
			left[i - L] = arr[i];
		}
		// ����ұ�����
		for (int i = M; i <= R; i++) {
			right[i - M] = arr[i];
		}
		/// ���������� ����ת��һ����������
		int Li = 0;
		int Ri = 0;
		int Arri = L;

		while (Li < left.length && Ri < right.length) {
			if (left[Li] < right[Ri]) {
				arr[Arri++] = left[Li++];
			} else {
				arr[Arri++] = right[Ri++];
			}
		}

		while (Li < left.length) {
			arr[Arri++] = left[Li++];
		}

		while (Ri < right.length) {
			arr[Arri++] = right[Ri++];
		}
	}

	private void mergeSort(int arr[], int L, int R) {
		if (L == R) { // {1,3,2,4,5}
			return;
		} else {
			int M = (L + R) / 2;
			// ���������� ����ת��һ����������
			mergeSort(arr, L, M);
			// ���ұ�������еݹ�
			mergeSort(arr, M + 1, R);
			merge(arr, L, M + 1, R);
		}
	}

	public void mergeSort(int arr[]) {
		mergeSort(arr, 0, arr.length - 1);
	}

	// ���������� ����ת��һ���������� {1,3,5,6} {2,3,8,10} {1,2,b3,a3,5,6,}
	private static int[] marge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int ai = 0;
		int bi = 0;
		int ci = 0;
		// {1,3,5,6} {2,3,8,10} {1,2,b3,a3,5,6,}
		while (ai < a.length && bi < b.length) {
			if (a[ai] < b[bi]) {
				c[ci++] = a[ai++];
			} else {
				c[ci++] = b[bi++];
			}
		}
		while (ai < a.length) {
			c[ci++] = a[ai++];
		}

		while (bi < b.length) {
			c[ci++] = b[bi++];
		}

		return c;
	}
}
