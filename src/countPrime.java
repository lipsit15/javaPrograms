import java.util.Scanner;

public class countPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count =0;
        while(n>0){
            int digits = n%10;
            if(isPrime(digits)){
                count++;
            }
            n=n/10;
        }
        System.out.println("Number of digits: "+count);
    }
    public static boolean isPrime(int digits){
        if(digits==2||digits==3||digits==5||digits==7){
            return true ;
        }
        else{
            return  false;
        }
    }

}
