import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

class BankAccount1{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount1(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}

public class solutionIpa41{
    public static double withdraw(BankAccount1[] bank, int accNo){
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        for(BankAccount1 b : bank){
            if(b.getAccountNumber() == accNo){
                if(amount > b.getBalance()){
                    return -1;
                }
                else {
                    double balance = b.getBalance() - amount;
                    b.setBalance(balance);
                    return balance;
                }
            }
        }
        return -2;
    }
    public static double deposite(BankAccount1[] bank, int accNo){
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        for(BankAccount1 b : bank){
            if(b.getAccountNumber() == accNo){
                double balance = b.getBalance() + amount;
                b.setBalance(balance);
                return balance;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount1[] bank = new BankAccount1[3];
        for(int i=0 ; i<bank.length ; i++){
            int accountNo = sc.nextInt();
            sc.nextLine();
            String accountHN = sc.nextLine();
            double balance = sc.nextDouble();
            bank[i] = new BankAccount1(accountNo, accountHN, balance);
        }
        int acc1 = sc.nextInt();sc.nextLine();
        double ans1 = withdraw(bank, acc1);
        int acc2 = sc.nextInt();sc.nextLine();
        double ans2 = deposite(bank, acc2);
        if(ans1 >= 0){
            System.out.println(ans1);
        } else if(ans1 == -1){
            System.out.println("Sorry - Insufficient balance");
        } else if(ans1 == -2){
            System.out.println("Sorry - Account not found");
        }

        if(ans2 >= 0){
            System.out.println(ans2);
        } else{
            System.out.println("Sorry - Account not found");
        }
    }
}

