import java.util.Scanner;
import java.util.Arrays;

public class solutionIpa37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Song[] s = new Song[5];
        for(int i=0;i<s.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            s[i]=new Song(a,b,c,d);
        }
        String value1=sc.nextLine();
        String value2=sc.nextLine();
        int ans1 = findSongDurationForArtist(s,value1);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("There are no songs with given artist");
        }
        Song[] ans2=getSongsInAscendingOrder(s,value2);
            if(ans2!=null){
                for(int i=0;i<ans2.length;i++){
                    System.out.println(ans2[i].getSongId());
                    System.out.println(ans2[i].getTitle());
                }
            }
            else{
                System.out.println("There are no songs with given artist");
            }

    }
    public static int findSongDurationForArtist(Song[] s,String v1){
        int sum =0;
        for(int i=0;i<s.length;i++){
            if(s[i].getArtist().equalsIgnoreCase(v1)){
                sum+=s[i].getDuration();
            }
        }
        if(sum>0){
            return sum;
        }
        else{
            return 0;
        }

    }
    public static Song[] getSongsInAscendingOrder(Song[] s,String v2){
        Song[] arr = new Song[0];
        for(int i=0;i<s.length;i++){
            if(s[i].getArtist().equalsIgnoreCase(v2)){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=s[i];
            }
        }
        if(arr.length>0){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i].getDuration()>arr[j].getDuration()){
                        Song temp=arr[i];
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
class Song{
    int songId;
    String title;
    String artist;
    double duration;

    public Song(int songId, String title, String artist, double duration) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}

