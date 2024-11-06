import java.util.Arrays;
import java.util.Scanner;
public class solutionIpa10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[4];
        for(int i=0;i< employees.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();
            employees[i]=new Employee(a,b,c,d,e);
        }
        String department = sc.nextLine();
        int ans1=findCountOfEmployeesUsingCompTransport(employees,department);
        if(ans1!=0){
            System.out.println(ans1);

        }
        else{
            System.out.println("No such Employees");
        }
        Employee[] ans2 = findEmployeeWithSecondHighestRating(employees);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                if(ans2[i].getRating()>ans2[i+1].getRating()){
                    System.out.println(ans2[i+1].getEmployeeId());
                    System.out.println(ans2[i+1].getName());
                }
            }
        }

    }
    public static int findCountOfEmployeesUsingCompTransport(Employee[] employees,String dept){
        int count = 0;
        for(int i=0;i<employees.length;i++){
            if(employees[i].getBranch().equalsIgnoreCase(dept)&&employees[i].isCompanyTransport()==true){
                count++;
            }
        }
        if(count>0){
            return count;
        }
        else{
            return 0;

        }

    }
    public static Employee[] findEmployeeWithSecondHighestRating(Employee[] employees){
        Employee[] demo= new Employee[0];
        Employee temp;
        for(int i=0;i<employees.length;i++){
            if(employees[i].isCompanyTransport()==false){
                demo= Arrays.copyOf(demo,demo.length+1);
                demo[demo.length-1]=employees[i];
            }
        }
        for(int i=0;i< demo.length;i++){
            for(int j=i;j< demo.length;j++){
                if(demo[i].getRating()<demo[j].getRating()){
                    temp=demo[i];
                    demo[i]=demo[j];
                    demo[j]=temp;
                }
            }

        }
        if(demo.length>0){
            return demo;
        }
        else{
            return null;
        }


    }

}
class Employee{
    int employeeId;
    String name;
    String branch;
    double rating;
    boolean companyTransport;

    public Employee(int employeeId, String name, String branch, double rating, boolean companyTransport) {
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isCompanyTransport() {
        return companyTransport;
    }

    public void setCompanyTransport(boolean companyTransport) {
        this.companyTransport = companyTransport;
    }
}
