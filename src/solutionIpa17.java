import java.util.Scanner;
import java.time.Month;
import java.util.Arrays;
public class solutionIpa17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Lipsit[] lipsits=new Lipsit[4];
        for(int i=0;i<lipsits.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.next().charAt(0);
            String e = sc.nextLine();
            lipsits[i]=new Lipsit(a,b,c,d,e);
        }
        char grade = sc.next().charAt(0);
        int month = sc.nextInt();sc.nextLine();
        Lipsit[] ans1 = findStudentByGradeAndMonth(lipsits,grade,month);
        if(ans1!=null){
            for(int i=0;i<ans1.length;i++){
                System.out.println(ans1[i].getName());
                System.out.println(ans1[i].getSubject());
            }
            System.out.println(ans1.length);
        }
        else{
            System.out.println("No student found");
        }




    }
    public static Lipsit[] findStudentByGradeAndMonth(Lipsit[] lipsits,char g,int m){
        Lipsit[] arr = new Lipsit[0];


        for(int i=0;i<lipsits.length;i++){
            String[] month = lipsits[i].getDate().split(" ");

            if(lipsits[i].getGrade()==g && Integer.parseInt(month[1])==m){
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=lipsits[i];


            }
        }
        Lipsit temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].getRollNo()>arr[j].getRollNo()){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

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
class Lipsit {
    int rollNo;
    String name;
    String subject;
    char grade;
    String date;

    public Lipsit(int rollNo, String name, String subject, char grade, String date) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
