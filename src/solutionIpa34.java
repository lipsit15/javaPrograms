import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Player3[] p=new Player3[n];
        for(int i=0;i<p.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();
            p[i]=new Player3(a,b,c,d,e);
        }
        String country=sc.nextLine();
        int run = sc.nextInt();sc.nextLine();
        Player3[] ans1 = findPlayerName(p,country,run);
        if(ans1!=null){
            for(int i=0;i<ans1.length;i++){
                System.out.println(ans1[i].getId()+":"+ans1[i].getName());
            }
        }
        else{
            System.out.println("No player found");
        }

    }
    public static Player3[] findPlayerName(Player3[] p,String cy,int r){
        Player3[] arr=new Player3[0];
        for(int i=0;i<p.length;i++){
            if(p[i].getCountry().equalsIgnoreCase(cy) && p[i].getRunsScored()>r){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=p[i];
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
class Player3{
    int id;
    String name;
    String Country;
    int matchesPlayed;
    int runsScored;

    public Player3(int id, String name, String country, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        Country = country;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}
