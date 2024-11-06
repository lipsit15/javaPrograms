import java.util.Arrays;
import java.util.Scanner;
public class solutionIpa31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Music[] music = new Music[4];
        for(int i=0;i<music.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            music[i]=new Music(a,b,c,d);
        }
        int Count = sc.nextInt();sc.nextLine();
        int Value = sc.nextInt();sc.nextLine();
        int ans1=findAvgOfCount(music,Count);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("No playlist found");
        }
        Music[] ans2 = sortTypeByDuration(music,Value);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getType());
            }
        }
        else{
            System.out.println("No playlist found with mentioned attribute");
        }

    }
    public static int findAvgOfCount(Music[] music,int C){
        int sum =0;int counter=0;
        for(int i=0;i<music.length;i++){
            if(music[i].getCount()>C){
                sum+=music[i].getCount();
                counter++;
            }
        }
        if(counter>0){
            int avg = sum/counter;
            return avg;
        }
        else{
            return 0;

        }

    }
    public static Music[] sortTypeByDuration(Music[] music,int V){
        Music[] arr = new Music[0];
        for(int i=0;i<music.length;i++){
            if(music[i].getDuration()>V){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=music[i];
            }
        }
        if(arr.length>0){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i].getDuration()>arr[j].getDuration()){
                        Music temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            return arr;
        }
        else{
            return null;

        }

    }


}
class Music{
    int playListNo;
    String type;
    int count;
    double duration;

    public Music(int playListNo, String type, int count, double duration) {
        this.playListNo = playListNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }

    public int getPlayListNo() {
        return playListNo;
    }

    public void setPlayListNo(int playListNo) {
        this.playListNo = playListNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
