import java.util.Scanner;
import java.util.Arrays;

public class solutionIpa43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ram[] r = new Ram[4];
        for(int i=0;i<r.length;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            int f  = sc.nextInt();sc.nextLine();
            double g = sc.nextDouble();sc.nextLine();
            r[i]=new Ram(a,b,c,d,e,f,g);
        }
        String course = sc.nextLine();
        double ans1 = calculateAverageGPA(r);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("Sorry - No students available");
        }
        Ram[] ans2 = getStudentByCourse(r,course);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getName());
                System.out.println(ans2[i].getRollNo());
                System.out.println(ans2[i].getGPA());
            }
        }
        else{
            System.out.println("Sorry - No students are available for the given course ");
        }


    }
    public static double calculateAverageGPA(Ram[] r){
        int sum=0,count=0;
        for(int i=0;i<r.length;i++){
            sum+=r[i].getGPA();
            count++;
        }
        if(count>0){
            double avg = sum/count;
            return avg;
        }
        return 0;
    }
    public static Ram[] getStudentByCourse(Ram[] r,String course){
        Ram[] arr = new Ram[0];
        for(int i=0;i<r.length;i++){
            if(r[i].getCourse().equalsIgnoreCase(course)){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=r[i];

            }
        }
        if(arr.length>0){
            return arr;
        }
        return null;
    }

}
class Ram{
    String name;
    String rollNo;
    int age;
    char gender;
    String course;
    int semester;
    double GPA;

    public Ram( String name, String rollNo, int age, char gender,String course, int semester, double GPA) {
        this.course = course;
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.gender = gender;
        this.semester = semester;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
