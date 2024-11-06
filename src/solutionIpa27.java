import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class solutionIpa27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sim2[] sim2 = new Sim2[4];
        for(int i=0;i<sim2.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            String e = sc.nextLine();
            sim2[i]=new Sim2(a,b,c,d,e);
        }
        String search_circle = sc.nextLine();
        double search_rate = sc.nextDouble();sc.nextLine();
        Sim2[] ans1 = matchAndSort(sim2,search_circle,search_rate);
        if(ans1!=null){
            for(int i=0;i<ans1.length;i++){
                System.out.println(ans1[i].getId());
            }
        }

    }
    public static Sim2[] matchAndSort(Sim2[] sim2,String C,double R){
        Sim2[] arr = new Sim2[0];
        for(int i=0;i<sim2.length;i++){
            if(sim2[i].getCircle().equalsIgnoreCase(C) && sim2[i].getRatePerSecond()<R){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=sim2[i];


            }
        }
        if(arr.length>0){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i].getBalance()<arr[j].getBalance()){
                        Sim2 temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            return arr;
        }

        return null;
    }
}
class Sim2{
    int id;
    String company;
    int balance;
    double ratePerSecond;
    String circle;

    public Sim2(int id, String company,int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}
