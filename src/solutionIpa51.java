import java.util.Arrays;
import java.util.Scanner;
public class solutionIpa51 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Beach[] B=new Beach[4];
        for(int i=0;i<B.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            B[i]=new Beach(a,b,c,d);

        }
        String name = sc.nextLine();
        int amount=sc.nextInt();sc.nextLine();
        int ans = findLeastRatingWithName(B,name,amount);
        if(ans!=0){
            System.out.println(ans);
        }
        else{
            System.out.println("No beach found");
        }

    }
    public static int findLeastRatingWithName(Beach[] B,String n,int a){
        int min=B[0].getBeachRating();
        for(int i=0;i<B.length;i++){
            if(B[i].getBeachName().equalsIgnoreCase(n) && B[i].getBeachCost()>a){
                if(B[i].getBeachRating()<min){
                    min=B[i].getBeachRating();
                }
            }
        }
        return min;

    }

}
class Beach{
    int beachId;
    String beachName;
    int beachRating;
    int beachCost;

    public Beach(int beachId, String beachName, int beachRating, int beachCost) {
        this.beachId = beachId;
        this.beachName = beachName;
        this.beachRating = beachRating;
        this.beachCost = beachCost;
    }

    public int getBeachId() {
        return beachId;
    }

    public void setBeachId(int beachId) {
        this.beachId = beachId;
    }

    public String getBeachName() {
        return beachName;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }

    public int getBeachRating() {
        return beachRating;
    }

    public void setBeachRating(int beachRating) {
        this.beachRating = beachRating;
    }

    public int getBeachCost() {
        return beachCost;
    }

    public void setBeachCost(int beachCost) {
        this.beachCost = beachCost;
    }
}
