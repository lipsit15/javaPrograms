import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Fruit[] fruits = new Fruit[4];
        for(int i=0;i<fruits.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            fruits[i]=new Fruit(a,b,c,d);
        }
        int rating= sc.nextInt();sc.nextLine();
        int ans1 = findMaximumPriceByRating(fruits,rating);
        if(ans1!=0){
            System.out.println(ans1);

        }
        else{
            System.out.println("No such Fruit");
        }


    }
    public static int findMaximumPriceByRating(Fruit[] fruits,int r){
        int max =0;
        for(int i=0;i<fruits.length;i++){
            if(fruits[i].getRating()>r){
                if(fruits[i].getPrice()>max){
                    max=fruits[i].getPrice();
                }


            }
        }
        for(int i=0;i<fruits.length;i++){
            if(fruits[i].getPrice()==max){
                return fruits[i].getFruitId();
            }
        }
        return 0;

    }
}
class Fruit{
    int fruitId;
    String fruitName;
    int price;
    int rating;

    public Fruit(int fruitId, String fruitName, int price, int rating) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
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
