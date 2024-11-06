import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NavalVessel[] navalVessels = new NavalVessel[4];
        for(int i=0;i<navalVessels.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            navalVessels[i]=new NavalVessel(a,b,c,d,e);



        }
        int percentage = sc.nextInt();sc.nextLine();
        String purpose = sc.nextLine();
        int ans1 = findAvgVoyagesByPct(navalVessels,percentage);
        if(ans1!=0){
            System.out.println(ans1);
        }
        NavalVessel[] ans2 = findVesselByGrade(navalVessels,purpose);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                int per = ans2[i].getNoOfVoyagesCompleted()*100/ans2[i].getNoOfVoyagesPlanned();
                if(per==100){
                    System.out.println(ans2[i].getVesselName()+"%Star");
                }
                else if(per<99 && per>80){
                    System.out.println(ans2[i].getVesselName()+"%Leader");
                }
                else if(per<79 && per>55){
                    System.out.println(ans2[i].getVesselName()+"%Inspirer");
                }
                else{
                    System.out.println(ans2[i].getVesselName()+"%Striver");
                }
            }

        }
        else{
            System.out.println("No NavalVessel is available with specified purpose");
        }



    }
    public static int findAvgVoyagesByPct(NavalVessel[] navalVessels,int pt){
        int sum = 0;
        int count=0;
        for(int i=0;i<navalVessels.length;i++){
            if(navalVessels[i].getNoOfVoyagesCompleted()*100/navalVessels[i].getNoOfVoyagesPlanned() >= pt){
                sum+=navalVessels[i].getNoOfVoyagesCompleted();
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
    public static NavalVessel[] findVesselByGrade(NavalVessel[] navalVessels,String p){
        NavalVessel[] arr = new NavalVessel[0];
        for(int i=0;i<navalVessels.length;i++){
            if(navalVessels[i].getPurpose().equalsIgnoreCase(p)){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=navalVessels[i];

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
class NavalVessel{
    int vesselId;
    String vesselName;
    int noOfVoyagesPlanned;
    int noOfVoyagesCompleted;
    String purpose;

    public NavalVessel(int vesselId,String vesselName,int noOfVoyagesPlanned,int noOfVoyagesCompleted,String purpose){
        this.vesselId=vesselId;
        this.vesselName=vesselName;
        this.noOfVoyagesPlanned=noOfVoyagesPlanned;
        this.noOfVoyagesCompleted=noOfVoyagesCompleted;
        this.purpose=purpose;

    }

    public int getVesselId() {
        return vesselId;
    }

    public void setVesselId(int vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}