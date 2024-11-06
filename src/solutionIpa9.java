import java.util.Arrays;
import java.util.Scanner;
public class solutionIpa9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[4];
        for(int i=0;i<books.length;i++){
            int a = sc.nextInt();sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble();sc.nextLine();
            books[i]=new Book(a,b,c,d,e);
        }
        String bookTitle=sc.nextLine();
        Book[] ans1 = findBookWithMaximumPrice(books);
        if(ans1!=null){
            for(int i=0;i<ans1.length;i++){
                System.out.println(ans1[i].getId()+" "+ans1[i].getTitle());
            }
        }
        else{
            System.out.println("No book with such attribute");
        }

        Book ans2 = searchBookByTitle(books,bookTitle);
        if(ans2!=null){
            System.out.println(ans2.getId());
            System.out.println(ans2.getPages());
        }


    }
    public static Book[] findBookWithMaximumPrice(Book[] books){
        double maxPrice = 0;
        Book[] details = new Book[0];
        for(int i=0;i<books.length;i++){
            if(books[i].getPrice()>=maxPrice){
                maxPrice=books[i].getPrice();
            }
        }
        for(int i=0;i<books.length;i++){
            if(books[i].getPrice()==maxPrice){
                details= Arrays.copyOf(details,details.length+1);
                details[details.length-1]=books[i];
            }
        }
        if(details.length>0){
            return details;
        }
        else{
            return null;
        }
    }
    public static Book searchBookByTitle(Book[] books,String bT ){
        for(int i=0;i<books.length;i++){
            if(books[i].getTitle().equalsIgnoreCase(bT)){
                return books[i];
            }

        }
        return null;
    }
}
class Book{
    int id;
    int pages;
    String title;
    String author;
    double price;

    public Book(int id,int pages,String title,String author,double price){
        this.id = id;
        this.pages = pages;
        this.title=title;
        this.author=author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
