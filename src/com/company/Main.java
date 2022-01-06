package com.company;

public class Main {

    public static void main(String[] args) {
        String[]arr1={"a","c","d"};
        String[]arr2={"1","2","3"};
        String[]arr3=mergeArray(arr1,arr2);
        for(String element:arr3) {
            System.out.println(element);
        }
	// write your code here
    }

    public static String[] mergeArray(String[] arr01,String[] arr02){
        int lengthArr03=arr01.length+arr02.length;
        String[] arr03=new String[lengthArr03];
        for(int i=0;i<arr01.length;i++){
            arr03[i]=arr01[i];
        }
        for(int i=arr01.length;i<lengthArr03;i++){
            arr03[i]=arr02[i-arr01.length];
        }
        return arr03;
    }
}
