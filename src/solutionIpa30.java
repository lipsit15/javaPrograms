import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Document[] document = new Document[4];
        for(int i=0;i<document.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            document[i]=new Document(a,b,c,d);
        }
        Document[] ans=docsWithOddPages(document);
        if(ans!=null){
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i].getId()+" "+ans[i].getTitle()+" "+ans[i].getFolderName()+" "+ans[i].getPages());

            }
        }



    }
    public static Document[] docsWithOddPages(Document[] document){
        Document[] arr = new Document[0];
        for(int i=0;i<document.length;i++){
            if(document[i].getPages()%2!=0){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=document[i];

            }
        }
        if(arr.length>0){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i].getId()>arr[j].getId()){
                        Document temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            return arr;
        }
        else{
            return null;

        }




    }
}
class Document{
    int id;
    String title;
    String folderName;
    int pages;

    public Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
