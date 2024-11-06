import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vegetable[] v=new Vegetable[4];
        for(int i=0;i<v.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            v[i]=new Vegetable(a,b,c,d);
        }
        int Rating = sc.nextInt();
        Vegetable ans= findMinimumPriceByRating(v,Rating);
        if(ans!=null){

                System.out.println(ans.getVegetableId());


        }
        else{
            System.out.println("No such Vegetables");
        }


    }
    public static Vegetable findMinimumPriceByRating(Vegetable[] v,int R){
        int[] arr=new int[0];
        for(int i=0;i<v.length;i++){
            if(v[i].getRating()>R){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=v[i].getPrice();
                Arrays.sort(arr);

            }
        }
        if(arr.length>0){
            for(int i=0;i<v.length;i++){
                if(v[i].getPrice()==arr[0]){
                    return v[i];
                }
            }
        }

        return null;
    }

}
class Vegetable{
    int vegetableId;
    String vegetableName;
    int price;
    int rating;

    public Vegetable(int vegetableId, String vegetableName, int price, int rating) {
        this.vegetableId = vegetableId;
        this.vegetableName = vegetableName;
        this.price = price;
        this.rating = rating;
    }

    public int getVegetableId() {
        return vegetableId;
    }

    public void setVegetableId(int vegetableId) {
        this.vegetableId = vegetableId;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
