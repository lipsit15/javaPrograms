import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Associate[] associates=new Associate[5];
        for(int i=0;i<associates.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            associates[i]=new Associate(a,b,c,d);
        }
        String searchTechnology=sc.nextLine();
        Associate[] ans1 = associatesForGivenTechnology(associates,searchTechnology);
        if(ans1!=null){
            for(int i=0;i<ans1.length;i++){
                System.out.println(ans1[i].getId());
            }

        }

    }
    public static Associate[] associatesForGivenTechnology(Associate[] associates,String s ){
        Associate[] arr = new Associate[0];
        for(int i=0;i<associates.length;i++){
            if(associates[i].getTechnology().equalsIgnoreCase(s) && associates[i].getExperienceInYears()%5==0){
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=associates[i];
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
class Associate{
    int id;
    String name;
    String technology;
    int experienceInYears;

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
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

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}
