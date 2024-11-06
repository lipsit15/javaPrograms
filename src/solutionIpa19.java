import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Flower[] flowers = new Flower[4];
        for(int i=0;i<flowers.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();
            flowers[i]=new Flower(a,b,c,d,e);
        }
        String type = sc.nextLine();
        int ans1  = findMinPriceByType(flowers,type);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("There is no flower with given type");
        }



    }
    public static int findMinPriceByType(Flower[] flowers,String t){
        Flower[] arr = new Flower[0];
        for(int i=0;i<flowers.length;i++){
            if(flowers[i].getType().equalsIgnoreCase(t) && flowers[i].getRating()>3){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=flowers[i];
            }
        }

        if(arr.length>0){
            Flower minPrice = arr[0];
            for(int j =1;j<arr.length;j++){
                if(minPrice.getPrice()>arr[j].getPrice()){
                    minPrice = arr[j];
                }

            }
            return minPrice.getFlowerId();
        }
return 0;
    }
}
class Flower{
    int flowerId;
    String flowerName;
    int price;
    int rating;
    String type;

    public Flower(int flowerId, String flowerName, int price, int rating, String type) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

