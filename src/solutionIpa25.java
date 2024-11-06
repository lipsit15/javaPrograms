import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cinema[] cinema=new Cinema[4];
        for(int i=0;i<cinema.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            cinema[i]=new Cinema(a,b,c,d);
        }
        String director=sc.nextLine();
        int rating=sc.nextInt();sc.nextLine();
        int budget=sc.nextInt();sc.nextLine();
        int ans1 = findAvgBudgetByDirector(cinema,director);
        if(ans1!=0){
            System.out.println(ans1);
        }
        else{
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        Cinema[] ans2 = getMovieByBudget(cinema,rating,budget);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getMovieId());
            }
        }

    }
    public static int findAvgBudgetByDirector(Cinema[] cinema,String dr){
        int sum=0,count=0;
        for(int i=0;i<cinema.length;i++){
            if(cinema[i].getDirector().equalsIgnoreCase(dr)){
                sum+=cinema[i].getBudget();
                count++;

            }
        }
        if(count>0){

            int avg = sum/count;
            return avg;
        }
        else{
            return 0;

        }

    }
    public static Cinema[] getMovieByBudget(Cinema[] cinema,int r,int bt){
        Cinema[] arr = new Cinema[0];
        for(int i=0;i<cinema.length;i++){
            if(cinema[i].getRating()==r && cinema[i].getBudget()==bt&& cinema[i].getBudget()%cinema[i].getRating()==0 ){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=cinema[i];
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
class Cinema{
    int movieId;
    String director;
    int rating;
    int budget;

    public Cinema(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
