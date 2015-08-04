/*
* 2015/4/20 ��Զ����ʵ�ù�����
*/
package com.wyhello.util;

import java.util.Random;


/*
* @author Cohen.Lee
* @since 1.5
* @version 1.0
*
*/
public class ArrayUtils{

	/**
	* �������������(���ظ�)������ΪarrayLen����Χ��arrayScope��
	* @param arrayLen ��������ĳ���
	* @param arrayScope ���������ݵķ�Χ
	* @return int[]����
	*/
	public static int[] productArray(int arrayLen, int arrayScope){
		int[] i = new int[arrayLen];
		for (int j = 0; j < arrayLen ;j++ ){
			i[j] = (int)(Math.random() * arrayScope);
		}
		return i;
	}
	
		
	/**
	* �������������(���ظ�)������ΪarrayLen����Χ��arrayScope��
	* @param arrayLen ��������ĳ���
	* @param arrayScope ���������ݵķ�Χ
	* @param sign trueΪ��Чȥ�� falseΪ��Чȥ��
	* @param int[]����
	*/
	public static int[] productArray(int arrayLen, int arrayScope, boolean sign) throws ArrayUtilsException{
		if (arrayLen > arrayScope){
			throw new ArrayUtilsException("������������ĳ��Ȳ��ܴ����������������ݵķ�Χ");
		}
		Random rand = new Random();
		int i[] = null;
		//int count = 0;
		if (sign){
			int base[] = new int[arrayScope];   //0
			for (int j = 0; j < base.length ;j++ ){ //��ʼ������
				base[j] = j + 1;
				//count++;
			}
			for (int j = 0; j < arrayLen ;j++ ){
				//count++;
				int rIndex = rand.nextInt(arrayScope - j) + j;
				int tmp = base[j];
				base[j] = base[rIndex];
				base[rIndex] = tmp; 
			}
			//count += arrayLen;
			i = copyArray(base,arrayLen);
		}else{
			i = new int[arrayLen];
			for (int j = 0;j < arrayLen ; ){
				//count++;
				int tmp = rand.nextInt(arrayScope) + 1;
				boolean isRepeat = false;
				for (int k = 0 ; k < j ; k++ ){
					//count++;
					if (tmp == i[k]){
						isRepeat = true;
						break;
					}
				}
				if (isRepeat){
					continue;
				}
				//�ж��ظ�������
				i[j] = tmp;     //�����ɵ�������ŵ�������j��λ����
				j++;            //������һ��
			}
		}
		//System.out.println("ȥ���ظ�����:" + count);
		return i;
	}

	/**
	* ð������
	*
	*/
	public static void bubbleSort(int[] array) throws ArrayUtilsException{
		if (array == null){
			throw new ArrayUtilsException("��Ҫ���������Ϊnull���������������");
		}
		//int count = 0;
		for (int i = 0;i < array.length ;i++){
			for (int j = 0;j < array.length - i - 1 ;j++ ){
				if (array[j] > array[j + 1]){
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					//count++;
				}
			}
		}
		//System.out.println("ð�ݽ�������" + count);
	}
		
	/**
	* ѡ������
	* 
	*/
	public static void choiceSort(int[] array) throws ArrayUtilsException{
		if (array == null){
			throw new ArrayUtilsException("��Ҫ���������Ϊnull���������������");
		}
		//int count = 0;
		for (int i = 0;i < array.length ; i++){
			int index = i;
			for (int j = i + 1;j < array.length ; j++ ){
				if (array[index] > array[j]){
					index = j;
				}
			}
			if (index != i){
				int tmp = array[i];
				array[i] = array[index];
				array[index] = tmp;
				//count++;
			}
		}
		//System.out.println("ѡ�񽻻�����" + count);
	}
	
	public static void printArray(int i[]){
		if (i == null){
			System.out.println("��Ǹ��Ҫ��ӡ������Ϊnull");
			return;	
		}
		int index = 0;
		for (int j : i ){
			System.out.println(j + " "); 	
		}
		System.out.println();
	}
		
	/**
	* ����Ŀ���
	*/
	public static int[] copyArray(int[] origl){
		if (origl == null){		//Ŀ������
			return null;
		}
		int newArray[] = new int[origl.length];
		for (int i = 0; i < newArray.length ;i++ ){
			newArray[i] = origl[i];
		}
		return newArray;
	}

	/**
	* ����Ŀ���
	*/
	public static int[] copyArray(int[] origl, int len){
		if (origl == null && len < origl.length){
			return null;
		}
		int[] newArray = new int[len];
		for (int i = 0;i < newArray.length;i++ ){
			newArray[i] = origl[i];
		}
		return newArray;
	}

	/**
	* ���Բ���
	*/
	public static int findline(int targetArray[], int target){
		int index = -1;
		for (int i = 0 ;i < targetArray.length ;i++ ){
			if (targetArray[i] == target){
				index = i;
				break;
			}
		}
		return index;
	}
	public static int binaryFind(int targetArray[], int target){
		int left = 0;
		int right = targetArray.length - 1;
		int middle = 0;
		int count = 0;

		while(left <= right){
			count++;
			middle = (left + right)/2;
			if (target > targetArray[middle]){	//�����
				left = middle + 1;
			}else if (target < targetArray[middle]){
				right = middle - 1;
			}else{
				System.out.println("������" + count + "��");
				return middle;
			}
		}
		return -1;
	}
	public static int binaryFind2(int i[],int t,int low,int high){
		//�߽�����
		//�ݹ��ǰ����
		//�ݹ鷵�ض�
		if (low > high){
			return -1;
		}else{
			int middle = (low + high) / 2;
			if (i[middle] == t){
				return middle;
			}else{
				if(i[middle] > t){
					return binaryFind2(i,t,low,middle - 1);
				}else{
					return binaryFind2(i,t,middle + 1,high);
				}
			}
		}
	}

}