import java.util.Arrays;
import java.util.Scanner;
public class solutionIpa40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car1[] c1=new Car1[4];
        for(int i=0;i<c1.length;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            c1[i]=new Car1(a,b,c,d);
        }
        String make=sc.nextLine();
        String model=sc.nextLine();
        Car1 ans1=findMostExpensiveCar(c1);
        if(ans1!=null){
            System.out.println(ans1.getMake());
            System.out.println(ans1.getModel());
            System.out.println(ans1.getYear());
            System.out.println(ans1.getPrice());
        }
        else{
            System.out.println("No car is available");
        }
        Car1[] ans2=getCarByMakeAndModel(c1,make,model);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getYear());
                System.out.println(ans2[i].getPrice());
            }
        }
        else{
            System.out.println("No car is available");

        }

    }
    public static Car1 findMostExpensiveCar(Car1[] c1){
        double[] arr = new double[0];
        for(int i=0;i<c1.length;i++){
            arr=Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1]=c1[i].getPrice();
            Arrays.sort(arr);
        }
        if(arr.length>0){
            for(int i=0;i<c1.length;i++){
                if(c1[i].getPrice()==arr[arr.length-1]){
                    return c1[i];
                }
            }
        }
        return null;
    }
    public static Car1[] getCarByMakeAndModel(Car1[] c1,String make,String model){
        Car1[] arr = new Car1[0];
        for(int i=0;i<c1.length;i++){
            if(c1[i].getMake().equalsIgnoreCase(make) && c1[i].getModel().equalsIgnoreCase(model)){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=c1[i];

            }
        }
        if(arr.length>0){
            return arr;
        }
        return null;
    }

}
class Car1{
    String make;
    String model;
    int year;
    double price;

    public Car1(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
