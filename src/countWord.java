import java.util.Scanner;

public class countWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("String : ");
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=" "){
                count++;
            }
        }
        System.out.println("Word count: "+count);
    }
}
