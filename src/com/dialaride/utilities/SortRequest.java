package com.dialaride.utilities;

public class SortRequest {
    Request r ;
    int i,j;
   public void sort(Request arr[]){
     r=new Request();
    for(i=0;i<arr.length;i++) {
        for (j = i+1; j < arr.length; j++) {
            if (arr[i].getEndTime() > arr[j].getEndTime()) {
                r = arr[i];
                arr[i] = arr[j];
                arr[j] = r;
            }

        }
    }
    for(i=0;i<arr.length;i++){
        System.out.println(" "+arr[i]);
    }
    }
}
