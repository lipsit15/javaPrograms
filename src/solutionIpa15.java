import java.util.Arrays;
import java.util.Scanner;
public class solutionIpa15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Phone[] phones = new Phone[4];
        for(int i=0;i<phones.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d  = sc.nextInt();sc.nextLine();
            phones[i]=new Phone(a,b,c,d);
        }
        String pBrand = sc.nextLine();
        String pOs = sc.nextLine();
        int ans1 = findPriceForGivenBrand(phones,pBrand);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("The given brand is not available");
        }
        Phone[] ans2 = getPhoneIdBasedOnOs(phones,pOs);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getPhoneId());
            }
        }
        else{
            System.out.println("No phones are available with specified os and price range");
        }

    }
    public static int findPriceForGivenBrand(Phone[] phones,String pB){
        int sum = 0;
        for(int i=0;i<phones.length;i++){
            if(phones[i].getBrand().equalsIgnoreCase(pB)){
                sum+=phones[i].getPrice();
            }
        }
        if(sum>0){
            return sum;
        }
        else{
            return 0;
        }

    }
    public static Phone[] getPhoneIdBasedOnOs(Phone[] phones,String pO){
        Phone[] arr = new Phone[0];
        for(int i=0;i<phones.length;i++){
            if(phones[i].getOs().equalsIgnoreCase(pO) && phones[i].getPrice()>=50000){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=phones[i];

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
class Phone{
    int phoneId;
    String os;
    String brand;
    int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
