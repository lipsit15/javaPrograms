import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NewsPaper[] n = new NewsPaper[4];
        for(int i=0;i<n.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            n[i]=new NewsPaper(a,b,c,d);
        }
        int type = sc.nextInt();sc.nextLine();
        String exam=sc.nextLine();
        int ans1 = findTotalPriceByPublicationYear(n,type);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("No Newspaper found with the mentioned attribute");
        }
        NewsPaper[] ans2=searchNewspaperByName(n,exam);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println("regNo-"+ans2[i].getRegNo());
                System.out.println("name-"+ans2[i].getName());
                System.out.println("publication-"+ans2[i].getPublicationYear());
                System.out.println("price-"+ans2[i].getPrice());
            }
        }

        else{
            System.out.println("No Newspaper found with the given name");
        }
    }
    public static int findTotalPriceByPublicationYear(NewsPaper[] n,int t){
        int sum =0;
        for(int i=0;i<n.length;i++){
            if(n[i].getPublicationYear()==t){
                sum+=n[i].getPrice();
            }
        }
        if(sum>0){
            return sum;
        }
        else{
            return 0;

        }

    }
    public static NewsPaper[] searchNewspaperByName(NewsPaper[] n,String e){
        NewsPaper[] arr = new NewsPaper[0];
        for(int i=0;i<n.length;i++){
            if(n[i].getName().equalsIgnoreCase(e)){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=n[i];
            }
        }
        if(arr.length>0){
            return arr;
        }
        else{
            return null;

        }

    }




}
class NewsPaper{
    int regNo;
    String name;
    int publicationYear;
    int price;

    public NewsPaper(int regNo, String name, int publicationYear, int price) {
        this.regNo = regNo;
        this.name = name;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

