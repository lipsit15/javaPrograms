import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Institution[] I=new Institution[4];
        for(int i=0;i<I.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            I[i]=new Institution(a,b,c,d,e);
        }
        String location=sc.nextLine();
        String InstitutionName=sc.nextLine();
        int ans1 = FindNumClearanceByLoc(I,location);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("There is no cleared students in this particular Location");
        }
        Institution[] ans2 = UpdateInstitutionGrade(I,InstitutionName);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                double rating = (ans2[i].getNoOfStudentsPlaced()*100)/ans2[i].getNoOfStudentsCleared();
                if(rating>=80){
                    System.out.println(ans2[i].getInstitutionName()+"::A");
                }
                else{
                    System.out.println(ans2[i].getInstitutionName()+"::B");
                }
            }
        }
        else{
            System.out.println("No institute is available with specified Name");
        }


    }
    public static int FindNumClearanceByLoc(Institution[] I,String l){
        int sum =0;
        for(int i=0;i<I.length;i++){
            if(I[i].getLocation().equalsIgnoreCase(l)){
                sum+=I[i].getNoOfStudentsCleared();
            }
        }
        if(sum>0){
            return sum;
        }
        else{
            return 0;

        }

    }
    public static Institution[] UpdateInstitutionGrade(Institution[] I,String n) {
        Institution[] arr = new Institution[0];
        for (int i = 0; i < I.length; i++) {
            if (I[i].getInstitutionName().equalsIgnoreCase(n)) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = I[i];
            }
        }
        if (arr.length > 0) {
            return arr;
        } else {
            return null;
        }
    }



}
class Institution{
    int institutionId;
    String institutionName;
    int noOfStudentsPlaced;
    int noOfStudentsCleared;
    String location;
//    String grade;

    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
//        this.grade = grade;
    }

    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public String getGrade() {
//        return grade;
//    }
//
//    public void setGrade(String grade) {
//        this.grade = grade;
//    }
}
