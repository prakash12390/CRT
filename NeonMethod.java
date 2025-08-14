import java.util.Scanner;
class N {
     int Neon(int num){
        int rem,sum=0;
        while(num!=0){
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;

    }
}
public class NeonMethod{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N obj = new N();
        int n;
        System.out.print("Enter the number : ");
        n=input.nextInt();
        int sqrt=n*n;
        int res=obj.Neon(sqrt);
        if(res==n){
            System.out.println("YES,"+res+" is neon number");
        }
        else {
            System.out.println("NO,it is not neon number");
        }

    }
}