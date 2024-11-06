import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Team[] team=new Team[n];
        for(int i=0;i<team.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            team[i]=new Team(a,b,c,d);
        }
        int run = sc.nextInt();sc.nextLine();
        String country=sc.nextLine();
        Team[] ans1 = findPlayer(team,run,country);
        if(ans1!=null){
            for(int i=0;i<ans1.length;i++){
                System.out.println(ans1[i].getId());
                System.out.println(ans1[i].getName());
                System.out.println(ans1[i].getCountry());
                System.out.println(ans1[i].getRun());
            }
        }
        else{
            System.out.println("No team is found from the given country and run");
        }

    }
    public static Team[] findPlayer(Team[] team,int r,String ct){
        Team[] arr = new Team[0];
        for(int i=0;i<team.length;i++){
            if(team[i].getCountry().equalsIgnoreCase(ct) && team[i].getRun()>r){
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=team[i];
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
class Team{
    int Id;
    String Name;
    String Country;
    int Run;

    public Team(int id, String name, String country, int run) {
        Id = id;
        Name = name;
        Country = country;
        Run = run;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getRun() {
        return Run;
    }

    public void setRun(int run) {
        Run = run;
    }
}
