import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Headsets[] h = new Headsets[4];
        for(int i=0;i<h.length;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            boolean d = sc.nextBoolean();sc.nextLine();
            h[i]= new Headsets(a,b,c,d);
        }
        String brand = sc.nextLine();
        int ans1=findTotalPriceForGivenBrand(h,brand);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("No Headsets available with the given brand");
        }
        int ans2=findAvailableHeadSetWithSecondMinPrice(h);
        if(ans2!=0){
            for(int i=0;i<h.length;i++){
                if(h[i].getPrice()==ans2){
                    System.out.println(h[i].getHeadSetName());
                    System.out.println(h[i].getPrice());
                }
            }
        }
        else{
            System.out.println("No Headsets available");
        }


    }
    public static int findTotalPriceForGivenBrand(Headsets[] h,String brand){
        int sum=0;
        for(int i=0;i<h.length;i++){
            if(h[i].getBrand().equalsIgnoreCase(brand)){
                sum+=h[i].getPrice();
            }
        }
        if(sum>0){
            return sum;
        }
        else{
            return 0;
        }

    }
    public static int findAvailableHeadSetWithSecondMinPrice(Headsets[] h){
        int[] price = new int[h.length];
        for(int i=0;i<h.length;i++){
            price[i]=h[i].getPrice();

        }
        Arrays.sort(price);
        int secMin=price[1];
        return secMin;

    }

}
class Headsets{
    String headSetName;
    String brand;
    int price;
    boolean available;

    public Headsets(String headSetName, String brand, int price, boolean available) {
        this.headSetName = headSetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public String getHeadSetName() {
        return headSetName;
    }

    public void setHeadSetName(String headSetName) {
        this.headSetName = headSetName;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
