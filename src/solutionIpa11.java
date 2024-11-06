import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];
        for(int i=0;i<players.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            players[i]=new Player(a,b,c,d);
        }
        String pSkill=sc.nextLine();
        String pLevel=sc.nextLine();
        int ans1 = findPointsForGivenSkill(players,pSkill);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("The given skill is available");
        }
        int ans2= getPlayerBasedOnLevel(players,pSkill,pLevel);
        if(ans2!=0){
            System.out.println(ans2);
        }
        else{
            System.out.println("No player is available with specified level, skill" +
                    "and eligibility points");
        }


    }
    public static int findPointsForGivenSkill(Player[] players,String pS){
        int sum  = 0;
        for(int i=0;i<players.length;i++){
            if(players[i].getSkill().equalsIgnoreCase(pS)){
                sum+=players[i].getPoints();
            }
        }
        if(sum>0){
            return sum;
        }
        else{
            return 0;

        }

    }
    public static int getPlayerBasedOnLevel(Player[] players,String pS,String pL){
        for(int i=0;i<players.length;i++){
            if(players[i].getSkill().equalsIgnoreCase(pS) && players[i].getLevel().equalsIgnoreCase(pL) &&players[i].getPoints()>=20 ){
                return players[i].getPlayerId();

            }
        }

        return 0;
    }

}
class Player{
    int playerId;
    String skill;
    String level;
    int points;

    public Player(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
