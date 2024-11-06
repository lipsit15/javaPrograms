import java.util.Scanner;

public class _4Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int digit = n%10;
            if(digit % 2 != 0){
                count++;
            }
            n=n/10;
        }
        if(count>=3){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }
}
