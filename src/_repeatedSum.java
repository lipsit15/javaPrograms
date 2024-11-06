/* Calculate the sum of all digits of a numbers. If the sum is greater than 9 then again sum the digits. The sum is
continuing until the sum becomes one digit.

Input : 195
Output : 6

Explanation: 1+9+5 =15>9, so 1+5=6 */

import java.util.Scanner;

public class _repeatedSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=9){
            System.out.println(n);
        }
        else{
            int sum=Sum(n);
            System.out.println(sum);
        }


    }

    public static int Sum(int n){
        int div=n;
        int sum=0;
        while(div!=0){
            int rem=div%10;
            sum+=rem;
            div/=10;
        }
        if(sum>9){
            return Sum(sum);
        }
        else{
            return sum;
        }
    }
}
