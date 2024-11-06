import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car[] car = new Car[5];
        for(int i=0;i<car.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            car[i]=new Car(a,b,c);
        }
        int id=sc.nextInt();sc.nextLine();
        Car[] ans=RemoveAndRearrange(car,id);
        if(ans!=null){
            for(int i=0;i<ans.length;i++){
                System.out.println(car[i].getCarId()+" : "+car[i].getCarName());
            }
        }
        else{
            System.out.println("There are no car with given Id");
        }

    }
    public static Car[] RemoveAndRearrange(Car[] car,int id){
        Car[] arr = new Car[0];
        for(int i=0;i<car.length;i++){
            if(car[i].getCarId()!=id){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=car[i];
            }
        }
        if(arr.length>0){
            return arr;
        }
        else{
            return null;
        }

    }
}
class Car{
    int carId;
    String carName;
    String fuelType;

    public Car(int carId, String carName, String fuelType) {
        this.carId = carId;
        this.carName = carName;
        this.fuelType = fuelType;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
