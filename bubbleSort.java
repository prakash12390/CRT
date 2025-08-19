import java.util.Scanner;

class b{
    int[] bs(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-i;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }}
        } return arr;
    }
}

public class bubbleSort {
    public static void main(String args[]){
        b obj = new b();
        int[] arr ={2,4,1,3,6,8};
        System.out.println("original array : ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("sorted array : ");
        obj.bs(arr);
        for(int j=0;j<arr.length-1;j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
