import java.util.Arrays;
import java.util.Scanner;

public class solutionIpa7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sim[] sim = new Sim[5];
        for(int i=0;i<sim.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            String e = sc.nextLine();
            sim[i]=new Sim(a,b,c,d,e);
        }
        String circle1=sc.nextLine();
        String circle2=sc.nextLine();
        Sim[] arr = transferCustomerCircle(sim,circle1,circle2);
        if(arr!=null){
            for(int i=arr.length-1;i>=0;i--){
                System.out.println(arr[i].getSimId()+" "+arr[i].getCustomerName()+" "+arr[i].getCircle()+" "+arr[i].getRatePerSecond());
            }
        }



    }
    public static Sim[] transferCustomerCircle(Sim[] sim,String c1,String c2){
        Sim[] details = new Sim[0];
        for(int i=0;i< sim.length;i++){
            if(sim[i].getCircle().equalsIgnoreCase(c1)){
                details= Arrays.copyOf(details,details.length+1);
                sim[i].circle=c2;
                details[details.length-1]=sim[i];
            }
        }
        for(int i=0;i< details.length;i++){
            for(int j=i+1;j< details.length;j++){
                if(details[i].getRatePerSecond()>details[j].getRatePerSecond()){
                    Sim temp = details[i];
                    details[i]=details[j];
                    details[j]=temp;

                }
            }


        }
        if(details.length>0){
            return details;
        }
        else{
            return null;
        }

    }

}

class Sim{
    int simId;
    String customerName;
    double balance;
    double ratePerSecond;
    String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public void setSimId(int simId) {
        this.simId = simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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
