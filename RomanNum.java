import java.util.Scanner;

class R{
    int Roman(String n){

        int s=0;
        for(int i=0;i<=n.length()-1;i++) {
            switch (n.charAt(i)) {
                case 'I':
                    s += 1;
                    break;
                case 'V':
                    s += 5;
                    break;
                case 'X':
                    s += 10;
                    break;
                case 'L':
                    s += 50;
                    break;
                case 'C':
                    s += 100;
                    break;
                case 'D':
                    s += 500;
                    break;
                case 'M':
                    s += 1000;
                    break;
                default:
                    return 0;
            }



        }
       return s;
    }

}

public class RomanNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        R obj = new R();
        System.out.print("Enter the number: ");
        long res =obj.Roman(input.nextLine());
        System.out.println("hey,it is "+res);

    }
}
