import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s="prakashrajubhanugirishsureshharshithkarthik";
        System.out.println("enter the neddle:");
        String neddle = input.nextLine();
        for(int i=0;i<s.length()-neddle.length()+1;i++){
            if(s.substring(i,i+neddle.length()).equals(neddle)){
                System.out.println(i);
                System.out.println(s.substring(i,i+neddle.length()));
            }
        }
    }
}
