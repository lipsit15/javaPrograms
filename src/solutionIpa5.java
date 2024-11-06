import java.util.Scanner;

public class solutionIpa5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Motel[] motels=new Motel[4];
        for(int i=0;i< motels.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();sc.nextLine();

            motels[i]=new Motel(a,b,c,d,e,f);

        }
//        sc.nextLine();
        String cabFacility=sc.nextLine();
        int ans = totalNumberOfRoomBooked(motels,cabFacility);
        if(ans!=0){
            System.out.println(ans);
        }
        else{
            System.out.println("No such room booked");
        }


    }
    public static int totalNumberOfRoomBooked(Motel[] motels,String cab){
        int total = 0;
        for(int i=0;i< motels.length;i++){
            if(motels[i].getNoOfRoomsBooked()>5 && motels[i].getCabFacility().equalsIgnoreCase(cab)){
                total=total+motels[i].getNoOfRoomsBooked();
            }
        }
        if(total>0){
            return total;
        }
        else{
            return 0;
        }

    }
}
class Motel{
    int motelId;
    String motelName;
    String dateOfBooking;
    int noOfRoomsBooked;
    String cabFacility;
    double totalBill;

    public Motel(int motelId,String motelName,String dateOfBooking,int noOfRoomsBooked,String cabFacility,double totalBill
                 ){
        this.motelId=motelId;
        this.motelName=motelName;
        this.dateOfBooking=dateOfBooking;
        this.noOfRoomsBooked=noOfRoomsBooked;
        this.cabFacility=cabFacility;
        this.totalBill=totalBill;

    }
    public int getMotelId(){
        return motelId;
    }
    public String getMotelName(){
        return motelName;

    }
    public String getDateOfBooking(){
        return dateOfBooking;
    }
    public int getNoOfRoomsBooked(){
        return noOfRoomsBooked;
    }
    public String getCabFacility(){
        return cabFacility;
    }
    public double getTotalBill(){
        return totalBill;
    }

    public void setMotelId(int motelId) {
        this.motelId = motelId;
    }

    public void setMotelName(String motelName) {
        this.motelName = motelName;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public void setCabFacility(String cabFacility) {
        this.cabFacility = cabFacility;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}

