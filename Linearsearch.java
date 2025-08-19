import java.util.Scanner;

class Linear {
      int action(int val,int arr[]) {
         for (int i = 0; i<arr.length; i++) {
             if (arr[i] == val) {
                 return i+1;
             }
         }
         return -1;
     }
 }
public class Linearsearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Linear obj = new Linear();
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("enter the element want to search : ");
        int val = input.nextInt();
        int res = obj.action(val, arr);
        if (res == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println("element present at " + res + " position");
        }
    }
}