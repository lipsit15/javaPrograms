import java.util.Scanner;
import java.util.Arrays;

public class solutionIpa13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AutonomousCar[] autonomousCars = new AutonomousCar[4];
        for(int i=0;i<autonomousCars.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            autonomousCars[i]=new AutonomousCar(a,b,c,d,e);
        }
        String env = sc.nextLine();
        String bra = sc.nextLine();
        int ans1=findTestPassedByEnv(autonomousCars,env);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("There are no test passed in this particular environment");
        }
        AutonomousCar[] ans2 = updateCarGrade(autonomousCars,bra);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                int grade = ans2[i].getNoOfTestPassed()*100/ans2[i].getNoOfTestConducted();
                if(grade>=80){
                    System.out.println(ans2[i].getBrand()+"::A1");
                }
                else{
                    System.out.println(ans2[i].getBrand()+"::B2");
                }
            }
        }

    }
    public static int findTestPassedByEnv(AutonomousCar[] autonomousCars,String e){
        int sum = 0;
        for(int i=0;i<autonomousCars.length;i++){
            if(autonomousCars[i].getEnvironment().equalsIgnoreCase(e)){
                sum+=autonomousCars[i].getNoOfTestPassed();
            }
        }
        if(sum>0){
            return sum;
        }
        else{
            return 0;
        }

    }
    public static AutonomousCar[] updateCarGrade(AutonomousCar[] autonomousCars,String br){
        AutonomousCar[] arr = new AutonomousCar[0];
        for(int i=0;i<autonomousCars.length;i++){
            if(autonomousCars[i].getBrand().equalsIgnoreCase(br)){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=autonomousCars[i];
            }
        }
        if(arr.length>0){
            return arr;
        }

        return null;
    }


}
class AutonomousCar{
    int carId;
    String brand;
    int noOfTestConducted;
    int noOfTestPassed;
    String environment;

    public AutonomousCar(int carId, String brand, int noOfTestConducted, int noOfTestPassed, String environment) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestConducted = noOfTestConducted;
        this.noOfTestPassed = noOfTestPassed;
        this.environment = environment;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoOfTestConducted() {
        return noOfTestConducted;
    }

    public void setNoOfTestConducted(int noOfTestConducted) {
        this.noOfTestConducted = noOfTestConducted;
    }

    public int getNoOfTestPassed() {
        return noOfTestPassed;
    }

    public void setNoOfTestPassed(int noOfTestPassed) {
        this.noOfTestPassed = noOfTestPassed;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}