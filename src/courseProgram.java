import java.util.Scanner;

public class courseProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        COURSE[] arr = new COURSE[4];
        for(int i=0;i< 4;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            int e = sc.nextInt();
            arr[i]=new COURSE(a,b,c,d,e);
        }
        String admin = sc.nextLine();
        int hand = sc.nextInt();


    }
    
}
class COURSE{
    int courseId;
    String courseName;
    String courseAdmin;
    int quiz;
    int handsOn;

    public COURSE(int courseId, String courseName, String courseAdmin, int quiz, int handsOn) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handsOn = handsOn;
    }
//    Getter
    public int getCourseId(){
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getHandsOn() {
        return handsOn;
    }

//    Setters

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public void setHandsOn(int handsOn) {
        this.handsOn = handsOn;
    }
}

