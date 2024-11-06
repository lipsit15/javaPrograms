import java.util.Arrays;
import java.util.Scanner;

public class solutionIpademo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player6[] p = new Player6[4];
        for(int i=0;i<p.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();
            p[i]=new Player6(a,b,c,d,e);
        }
        String state=sc.nextLine();
        String matchType=sc.nextLine();

        int ans1=findPlayerWithLowestRuns(p,state);
        if(ans1!=0){
            System.out.println(ans1);

        }
        else{
            System.out.println("No such Player");
        }
        Player6[] ans2 = findPlayerByMatchType(p,matchType);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getPlayerId());
            }
        }
        else{
            System.out.println("No player with given match type");
        }

    }
    public static int findPlayerWithLowestRuns(Player6[] p,String s){
        int min = p[0].getRuns();
        for(int i=0;i<p.length;i++){

            if(p[i].getPlayerType().equalsIgnoreCase(s)){
                if(p[i].getRuns()<min){
                    min=p[i].getRuns();
                }
            }

        }

        return min;

    }
    public static Player6[] findPlayerByMatchType(Player6[] p,String m){
        Player6[] arr=new Player6[0];
        for(int i=0;i<p.length;i++){
            if(p[i].getMatchType().equalsIgnoreCase(m)){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=p[i];
            }
        }
        if(arr.length>0){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i].getPlayerId()<arr[j].getPlayerId()){
                        Player6 temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            return arr;
        }
        return null;
    }
}
class Player6{
    int playerId;
    String playerName;
    int runs;
    String playerType;
    String matchType;

    public Player6(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}

