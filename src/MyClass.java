import java.util.Scanner;
import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerN[] p = new PlayerN[4];
        for (int i = 0; i < p.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();
            p[i] = new PlayerN(a, b, c, d, e);
        }


        String playerType=sc.nextLine();
        String matchType=sc.nextLine();
        int ans1=findLowestRuns(p,playerType);
        if(ans1>0){
            System.out.println(ans1);
        }
        else{
            System.out.println("No such player");
        }
        PlayerN[] ans2 = findSomething(p,matchType);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
               System.out.println(ans2[i].getId());
            }
        }
        else{
            System.out.println("No player with given matchType");
        }


    }

    public static int findLowestRuns(PlayerN[] p,String playerType){
        int min= Integer.MAX_VALUE;
        for(int i=0;i<p.length;i++){
            if(p[i].getType().equalsIgnoreCase(playerType) && p[i].getRuns()<min){
                min=p[i].getRuns();
            }
        }
        return min == Integer.MAX_VALUE?0:min;
    }
    public static PlayerN[] findSomething(PlayerN[] p,String matchType){
        PlayerN[] arr = new PlayerN[0];
        for(int i=0;i<p.length;i++){
            if(p[i].getMatchType().equalsIgnoreCase(matchType)){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=p[i];
            }
        }
        if(arr.length>0){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i].getId()<arr[j].getId()){
                        PlayerN temp=arr[i];
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
    class PlayerN {
        int id;
        String name;
        int runs;
        String type;
        String matchType;

        public PlayerN(int id, String name, int runs, String type, String matchType) {
            this.id = id;
            this.name = name;
            this.runs = runs;
            this.type = type;
            this.matchType = matchType;
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

        public int getRuns() {
            return runs;
        }

        public void setRuns(int runs) {
            this.runs = runs;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getMatchType() {
            return matchType;
        }

        public void setMatchType(String matchType) {
            this.matchType = matchType;
        }
    }
