package com.shan.sort;

import java.util.Arrays;

import org.junit.Test;
/**
 * ��������
 * @author sc
 *
 */
public class InsertSort {
	
@Test
public void test1(){
		int [] a={4,2,3};
		int[] sort = sort(a);
		System.out.println(Arrays.toString(sort));
	}
	
public static int[] sort(int [] arr){// 2 4  3
		for(int i=1;i<arr.length;i++){
			//Ҫ���뵽ֵ
			int insertVal=arr[i];
			//ǰһ������
			int index=i-1;
			//�Ƚ�Ҫ�����ֵ�Ƿ�С��ǰһ��  �ǵĻ� ǰһ������
			while(index>=0&&insertVal<arr[index]){
				arr[index+1]=arr[index];
				index--;
			}
			//����Ҫ�����ֵ
			arr[index+1]=insertVal;
		}        
	return arr;
}
	
	
	
	
}
