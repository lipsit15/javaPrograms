import java.util.Scanner;
import java.util.Arrays;

public class solutionIpa42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] st = new Student[2];
        Faculty[] ft = new Faculty[2];
        for(int i=0;i<st.length;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String f = sc.nextLine();
            int g = sc.nextInt();sc.nextLine();
            double h = sc.nextDouble();sc.nextLine();

            st[i] = new Student(a,b,c,d,e,f,g,h);
        }
        for(int j=0;j<ft.length;j++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String f = sc.nextLine();
            String g = sc.nextLine();
            double h = sc.nextDouble();sc.nextLine();

            ft[j] = new Faculty(a,b,c,d,e,f,g,h);
        }
        Student ans1=findHighestGPAStudent(st);
        if(ans1!=null){
            System.out.println(ans1.getRollNo());
            System.out.println(ans1.getCourse());
            System.out.println(ans1.getGPA());
        }
        else{
            System.out.println("No student is available");
        }
        Faculty ans2 = findHighestPaidFaculty(ft);
        if(ans2!=null){
            System.out.println(ans2.getEmployeeId());
            System.out.println(ans2.getDepartment());
            System.out.println(ans2.getSalary());
        }
        else{
            System.out.println("No faculty is available");
        }


    }
    public static Student findHighestGPAStudent(Student[] st){
        Student h = st[0];
        for(int i=0;i<st.length;i++){
            if(st[i].getGPA()>h.getGPA()){
                h=st[i];
            }
        }
        if(h!=null){
            return h;
        }
        return null;
    }
    public static Faculty findHighestPaidFaculty(Faculty[] ft){
        Faculty h=ft[0];
        for(int i=0;i<ft.length;i++){
            if(ft[i].getSalary()>h.getSalary()){
                h=ft[i];
            }
        }
        if(h!=null){
            return h;
        }
        return null;
    }
}
class Person{
    String firstName;
    String lastName;
    int age;
    char gender;

    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
}

class Student extends Person{
    String rollNo;
    String course;
    int semester;
    double GPA;

    public Student(String firstName, String lastName, int age, char gender, String rollNo, String course, int semester, double GPA) {
        super(firstName, lastName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
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

class Faculty extends Person{
    String employeeId;
    String department;
    String designation;
    double salary;

    public Faculty(String firstName, String lastName, int age, char gender, String employeeId, String department, String designation, double salary) {
        super(firstName, lastName, age, gender);
        this.employeeId = employeeId;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}