import java.util.Arrays;
import java.util.Scanner;
public class solutionIpa46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player5[] p=new Player5[4];
        for(int i=0;i<p.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            p[i]=new Player5(a,b,c,d);
        }
        String Side = sc.nextLine();
        Player5[] ans = searchPlayerForMatch(p,Side);
        if(ans!=null){
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i].getId());
            }
        }



    }
    public static Player5[] searchPlayerForMatch(Player5[] p,String S){
        Player5[] arr = new Player5[0];
        for(int i=0;i<p.length;i++){
            if(p[i].getSide().equalsIgnoreCase(S)){
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=p[i];
            }
        }
        if(arr.length>0){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i].getId()>arr[j].getId()){
                        Player5 temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            return arr;
        }
        return null;
    }
}
class Player5{
    int id;
    String country;
    String side;
    double price;

    public Player5(int id, String country, String side, double price) {
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
