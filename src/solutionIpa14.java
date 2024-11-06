import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[4];
        for(int i=0;i<movies.length;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            movies[i]=new Movie(a,b,c,d);
        }
        String searchGenre = sc.nextLine();
        Movie[] ans1 = getMovieByGenre(movies,searchGenre);
        if(ans1!=null){
            for(int i=0;i<ans1.length;i++){
                if(ans1[i].getBudget()>80000000){
                    System.out.println("High Budget Movie");
                }
                else{
                    System.out.println("Low Budget Movie");
                }
            }
        }

    }
    public static Movie[] getMovieByGenre(Movie[] movies,String g){
        Movie[] arr = new Movie[0];
        for(int i=0;i<movies.length;i++){
            if(movies[i].getGenre().equalsIgnoreCase(g)){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=movies[i];
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
class Movie{
    String movieName;
    String company;
    String genre;
    int budget;

    public Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
