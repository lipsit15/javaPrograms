import java.util.Arrays;
import java.util.Scanner;
public class solutionIpa12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Medicine[] medicines=new Medicine[4];
        for(int i=0;i< medicines.length;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            medicines[i]=new Medicine(a,b,c,d);
        }
        String dI = sc.nextLine();
        int[] ans1 = getPriceByDisease(medicines,dI);
        if(ans1!=null){
            for(int i=0;i<ans1.length;i++){
                System.out.println(ans1[i]);
            }
        }
        else{
            System.out.println("No medicines found");
        }

    }
    public static int[] getPriceByDisease(Medicine[] medicines,String d){
        int[] demo = new int[0];
        for(int i=0;i< medicines.length;i++){
            if(medicines[i].getDisease().equalsIgnoreCase(d)){
                demo= Arrays.copyOf(demo,demo.length+1);
                demo[demo.length-1]=medicines[i].getPrice();
                Arrays.sort(demo);
            }
        }
        if(demo.length>0){
            return demo;
        }
        else{
            return null;
        }

    }
}
class Medicine{
    String medicineName;
    String batch;
    String disease;
    int price;

    public Medicine(String medicineName,String batch,String disease,int price){
        this.medicineName=medicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
