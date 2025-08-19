import java.util.Scanner;
class bs {
      int  binarySearch(int start,int end,int arr[],int val){
        int mid = (start+end)/2;
        if(val==arr[mid]){
            return mid+1;
        }
        if(val>arr[mid]){
            return binarySearch(mid+1,end,arr,val);
        }
        if(val<arr[mid]){
            return binarySearch(start,mid-1,arr,val);
        }
        return -1;
    }

}
public class binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        bs obj = new bs();
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("enter the element want to search : ");
        int val = input.nextInt();
        int res = obj.binarySearch(0,n,arr,val);
        if (res == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println("element present at " + res + " position");
        }
    }
}