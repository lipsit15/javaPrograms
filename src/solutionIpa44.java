import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle[] r = new Rectangle[2];
        for(int i=0;i<r.length;i++){
            double a = sc.nextDouble();sc.nextLine();
            double b = sc.nextDouble();sc.nextLine();
            r[i]=new Rectangle(a,b);
        }
        double[] area = calculateArea(r);
        double[] per = calculatePerimeter(r);
        if(area!=null && per!=null){
            for(int i=0;i<2;i++){
                System.out.println(area[i]);
                System.out.println(per[i]);
            }
        }
        else{
            System.out.println("No data found");
        }



    }
    public static double[] calculateArea(Rectangle[] r){
        double[] arr=new double[0];
        double area =0;
        for(int i=0;i<r.length;i++){
            area=r[i].getLength()*r[i].getBreadth();
            arr=Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1]=area;
        }
        if(arr.length>0){
            return arr;
        }
        return null;
    }
    public static double[] calculatePerimeter(Rectangle[] r){
        double perimeter =0;
        double[] arr = new double[0];
        for(int i=0;i<r.length;i++){
            perimeter=2*(r[i].getLength()+r[i].getBreadth());
            arr = Arrays.copyOf(arr,arr.length+1);
            arr[arr.length-1]=perimeter;
        }
        if(arr.length>0){
            return arr;
        }

        return null;
    }

}
class Rectangle{
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
