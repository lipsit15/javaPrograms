import java.util.Arrays;
import java.util.Scanner;
public class solutionIpa32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] t = new TravelAgencies[4];
        for(int i=0;i<t.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();
            t[i]=new TravelAgencies(a,b,c,d,e);
        }
        int regNo=sc.nextInt();sc.nextLine();
        String packageType=sc.nextLine();
        int ans1 = findAgencyWithHighestPackagePrice(t);
        if(ans1!=0){
            System.out.println(ans1);
        }
        TravelAgencies[] ans2 = agencyDetailsForGivenIdAndType(t,regNo,packageType);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getAgencyName()+":"+ans2[i].getPrice());
            }
        }


    }
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] t){
        int max = 0;
        for(int i=0;i<t.length;i++){
            if(t[i].getPrice()>max){
                max=t[i].getPrice();
            }

        }
        if(max>0){
            return max;
        }
        else{
            return 0;


        }

    }
    public static TravelAgencies[] agencyDetailsForGivenIdAndType(TravelAgencies[] t,int r,String p){
        TravelAgencies[] arr = new TravelAgencies[0];
        for(int i=0;i<t.length;i++){
            if(t[i].isFlightFacility()==true && t[i].getRegNo()==r && t[i].getPackageType().equalsIgnoreCase(p)){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=t[i];
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
class TravelAgencies{
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}

