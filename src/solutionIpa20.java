import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Engine[] engines = new Engine[4];
        for(int i=0;i<engines.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            engines[i]=new Engine(a,b,c,d);
        }
        String type = sc.nextLine();
        String brand = sc.nextLine();
        int ans1=findAvgEnginePriceByType(engines,type);
        if(ans1!=0){
            System.out.println(ans1);

        }
        else{
            System.out.println("There are no engine with given type");
        }
        Engine[] ans2 = searchEngineByName(engines,brand);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getEngineId());
            }
        }
        else{
            System.out.println("There are no engine with given name");
        }


    }
    public static int findAvgEnginePriceByType(Engine[] engines,String t){
        int count =0,sum=0;
        for(int i=0;i<engines.length;i++){
            if(engines[i].getEngineType().equalsIgnoreCase(t)){
                sum+=engines[i].getEnginePrice();
                count++;
            }
        }
        if(count>0){
            int avg = sum/count;
            return avg;
        }
        else{
            return 0;

        }

    }
    public static Engine[] searchEngineByName(Engine[] engines,String br){
        Engine[] arr = new Engine[0];
        for(int i=0;i<engines.length;i++){
            if(engines[i].getEngineName().equalsIgnoreCase(br)){
                arr =Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=engines[i];
            }
        }
        Engine temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].getEngineId()>arr[j].getEngineId()){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
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
class Engine{
    int engineId;
    String engineName;
    String engineType;
    double enginePrice;

    public Engine(int engineId, String engineName, String engineType, double enginePrice) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.engineType = engineType;
        this.enginePrice = enginePrice;
    }

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getEnginePrice() {
        return enginePrice;
    }

    public void setEnginePrice(double enginePrice) {
        this.enginePrice = enginePrice;
    }
}
