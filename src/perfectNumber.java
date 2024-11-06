import java.util.Scanner;

//perfect Number
//i/p-6
//o/p-yes ,6 divisors re 1,2,3 ,1+2+3=6
public class perfectNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPerfect(n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }



    }
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}
