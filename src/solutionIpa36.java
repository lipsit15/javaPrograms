import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MobileDetails[] m= new MobileDetails[5];
        for(int i=0;i<m.length;i++){
            int a = sc.nextInt();sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            String c = sc.nextLine();
            boolean d = sc.nextBoolean();sc.nextLine();
            m[i]=new MobileDetails(a,b,c,d);
        }
        String brand = sc.nextLine();
        int ans1 = getTotalPrice(m,brand);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("There are no mobile with given brand");
        }
        MobileDetails[] ans2 = getSecondMin(m);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getBrand()+" : "+ans2[i].getPrice());
            }
        }
        else{
            System.out.println("Prices are same");
        }

    }
    public static int getTotalPrice(MobileDetails[] m,String brand){
        int sum =0;
        for(int i=0;i<m.length;i++){
            if(m[i].getBrand().equalsIgnoreCase(brand)){
                sum+=m[i].getPrice();
            }
        }
        if(sum>0){
            return  sum;
        }
        else{
            return 0;

        }

    }
    public static MobileDetails[] getSecondMin(MobileDetails[] m){
        MobileDetails[] arr = new MobileDetails[0];
        for(int i=0;i<m.length-1;i++){
            for(int j=i+1;j<m.length;j++){
                MobileDetails k=m[i];
                m[i]=m[j];
                m[j]=k;
            }
        }
        for(int i=0;i<m.length;i++){
            if(m[0].getPrice()<m[i].getPrice()){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=m[i];
                break;
            }
        }
        for(int j=0;j<m.length;j++){
            if(arr[0].getPrice()==m[j].getPrice() && arr[0].getMobileId()!=m[j].getMobileId()){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=m[j];
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
class MobileDetails{
    int mobileId;
    int price;
    String brand;
    boolean flagShip;

    public MobileDetails(int mobileId, int price, String brand, boolean flagShip) {
        this.mobileId = mobileId;
        this.price = price;
        this.brand = brand;
        this.flagShip = flagShip;
    }

    public int getMobileId() {
        return mobileId;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isFlagShip() {
        return flagShip;
    }

    public void setFlagShip(boolean flagShip) {
        this.flagShip = flagShip;
    }
}
