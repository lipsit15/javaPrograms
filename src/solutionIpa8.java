import java.util.Arrays;
import java.util.Scanner;
public class solutionIpa8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Hotel[] hotels= new Hotel[4];
        for(int i=0;i< hotels.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d  = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();sc.nextLine();
            hotels[i]=new Hotel(a,b,c,d,e,f);
        }
        String bookingMonth= sc.nextLine();
        String wFacility=sc.nextLine();
        int ans1=noOfRoomsBookedInGivenMonth(hotels,bookingMonth);
        if(ans1!=0){
            System.out.println(ans1);


        }
        else{
            System.out.println("No rooms booked in given Month");
        }
        int ans2 = searchHotelByWifiOption(hotels,wFacility);
        if(ans2!=0){
            System.out.println(ans2);

        }
        else{
            System.out.println("No such option available");
        }




    }
    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotels,String bM){
        int count  = 0;
        for(int i=0;i< hotels.length;i++){
            if(hotels[i].getDateOfBooking().contains(bM)){
                count = count+hotels[i].getNoOfRoomsBooked();
                return count;
            }
        }
        return 0;
    }
    public static int searchHotelByWifiOption(Hotel[] hotels,String wF){
        int id[]=new int[0];
        for(int i=0;i<hotels.length;i++){
            if(hotels[i].getWifiFacility().equalsIgnoreCase(wF)){
                id = Arrays.copyOf(id,id.length+1);
                id[id.length-1]=hotels[i].getHotelId();
                Arrays.sort(id);

            }
        }
        if(id.length>0){
            return id[id.length-2];
        }else{
            return 0;
        }

    }
}
class Hotel{
    int hotelId;
    String hotelName;
    String dateOfBooking;
    int noOfRoomsBooked;
    String wifiFacility;
    double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}
