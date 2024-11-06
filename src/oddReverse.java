//* Input : 123
// * Output : 321

import java.util.Scanner;

// * Input : 234
// * Output : Can not reverse
public class oddReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Can't be reversed");
        }
        else{
            int rev = 0;
            while(n!=0){
                int rem = n%10;
                rev = rev*10+rem;
                n=n/10;
            }
            System.out.println("Reverse: "+rev);
        }

    }
}
