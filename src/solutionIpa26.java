import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player2[] player2 = new Player2[4];
        for(int i=0;i<player2.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();
            player2[i]=new Player2(a,b,c,d,e);
        }
        int target = sc.nextInt();sc.nextLine();
        double[] ans1 = findAverageRuns(player2,target);
       if(ans1!=null){
           for(int i=0;i<ans1.length;i++){
               if(ans1[i]>=80 && ans1[i]<=100)
               {
                   System.out.println("Grade A");
               }
               else if(ans1[i]>=50 && ans1[i]<=79)
               {
                   System.out.println("Grade B");
               }
               else
               {
                   System.out.println("Grade C");
               }

           }
       }

    }
    public static double[] findAverageRuns(Player2[] player2,int t ){
        double arr[] = new double[0];
        for(int i=0;i<player2.length;i++){
            if(player2[i].getMatchesPlayed()>=t){
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=(player2[i].getRunsScored()/player2[i].getMatchesPlayed());

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
class Player2{
    int id;
    String name;
    int iccRank;
    int matchesPlayed;
    int runsScored;

    public Player2(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
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

    public int getIccRank() {
        return iccRank;
    }

    public void setIccRank(int iccRank) {
        this.iccRank = iccRank;
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
