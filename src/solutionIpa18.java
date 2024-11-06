import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Antenna[] antennas = new Antenna[4];
        for(int i=0;i<antennas.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            antennas[i]=new Antenna(a,b,c,d);
        }
        String named = sc.nextLine();
        double vswr = sc.nextDouble();sc.nextLine();
        int ans1 = searchAntennaByName(antennas,named);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("There is no antenna with given parameter");
        }
        Antenna[] ans2 = sortAntennaByVSWR(antennas,vswr);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getProjectLead());

            }

        }
        else{
            System.out.println("No Antenna Found");
        }



    }
    public static int searchAntennaByName(Antenna[] antennas,String n){
        for(int i=0;i<antennas.length;i++){
            if(antennas[i].getAntennaName().equalsIgnoreCase(n)){
                return antennas[i].getAntennaId();
            }
        }
        return 0;
    }
    public static Antenna[] sortAntennaByVSWR(Antenna[] antennas,double v){
        Antenna[] arr = new Antenna[0];
        for(int i=0;i<antennas.length;i++){
            if(antennas[i].getAntennaVSWR()<v){
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=antennas[i];
            }
        }
        Antenna temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].getAntennaVSWR()>arr[j].getAntennaVSWR()){
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
class Antenna{
    int antennaId;
    String antennaName;
    String projectLead;
    double antennaVSWR;

    public Antenna(int antennaId, String antennaName, String projectLead, double antennaVSWR) {
        this.antennaId = antennaId;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    public int getAntennaId() {
        return antennaId;
    }

    public void setAntennaId(int antennaId) {
        this.antennaId = antennaId;
    }

    public String getAntennaName() {
        return antennaName;
    }

    public void setAntennaName(String antennaName) {
        this.antennaName = antennaName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    public double getAntennaVSWR() {
        return antennaVSWR;
    }

    public void setAntennaVSWR(double antennaVSWR) {
        this.antennaVSWR = antennaVSWR;
    }
}
