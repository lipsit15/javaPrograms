import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa45 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();sc.nextLine();
        double c = sc.nextDouble();sc.nextLine();
        Engineer e = new Engineer(a,b,c);
        double yearlySalary = calculateYearlySalary(e);
        double tax = calculateTaxMethod(e);

        if(yearlySalary != 0 && tax != 0)
        {
            System.out.println("Yearly salary of "+e.getName()+": "+yearlySalary);
            System.out.println("Tax to be paid by "+e.getName()+": "+tax);
        }


    }

    public static double calculateYearlySalary(Engineer e){
        if(e.getSalary()>0){
            return e.getSalary()*12;
        }
        return 0;
    }
    public static double calculateTaxMethod(Engineer e){
        double yearlySalary=calculateYearlySalary(e);
        double tax  =0;
        if(yearlySalary>0){
            if(yearlySalary<=5000){
                tax=yearlySalary*0.10;
            }
            else if (yearlySalary <= 100000 && yearlySalary>50000)
            {
                tax = (50000 * 0.10) + ((yearlySalary - 50000) * 0.20);
            }
            else
            {
                tax = (50000 * 0.10) + (50000 * 0.20) + ((yearlySalary - 100000) * 0.30);
            }
        }
        return tax;
    }
}

class Engineer{
    String name;
    int age;
    double salary;

    public Engineer(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


