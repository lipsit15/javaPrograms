import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa49 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Bill[] B = new Bill[n];
        for(int i=0;i<B.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();
            B[i]=new Bill(a,b,c,d,e);
        }
        boolean status = sc.nextBoolean();sc.nextLine();
        String Connection=sc.nextLine();

        Bill[] ans1 = findBillWithMaximumBillAmountBasedOnStatus(B,status);
        if(ans1!=null){
            for(int i=0;i<ans1.length;i++){
                System.out.println(ans1[i].getBillNo()+"#"+ans1[i].getName());
            }
        }
        else{
            System.out.println("There are no bill with the given status");
        }

        int ans2 = getCountWithTypeOfConnection(B,Connection);
        if(ans2!=0){
            System.out.println(ans2);
        }
        else{
            System.out.println("There are no bills with given type of connection");
        }



    }
    public static Bill[] findBillWithMaximumBillAmountBasedOnStatus(Bill[] B,boolean s){
        double max=0;
        if(B.length!=0){
             max = B[0].getBillAmount();
        }

        for(int i=0;i<B.length;i++){
            if(B[i].getBillAmount()>max){
                max=B[i].getBillAmount();
            }
        }
        Bill[] arr = new Bill[0];
        for(int i=0;i<B.length;i++){
            if(B[i].isStatus()==s && B[i].getBillAmount()==max){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=B[i];
            }
        }
        if(arr.length>0){
            for(int i=0;i<B.length-1;i++){
                for(int j=i+1;j<B.length;j++){
                    if(arr[i].getBillNo()>arr[j].getBillNo()){
                        Bill temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            return arr;
        }
        return null;
    }
    public static int getCountWithTypeOfConnection(Bill[] B,String C){
        int count=0;
        for(int i=0;i<B.length;i++){
            if(B[i].getTypeOfConnection().equalsIgnoreCase(C)){
                count++;
            }
        }
        if(count>0){
            return count;
        }
        return 0;
    }


}
class Bill{
    int billNo;
    String name;
    String typeOfConnection;
    double billAmount;
    boolean status;

    public Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status) {
        this.billNo = billNo;
        this.name = name;
        this.typeOfConnection = typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfConnection() {
        return typeOfConnection;
    }

    public void setTypeOfConnection(String typeOfConnection) {
        this.typeOfConnection = typeOfConnection;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
