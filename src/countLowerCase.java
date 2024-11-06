import java.util.Scanner;

public class countLowerCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        int count =0;
        for(int i=0;i<s.length();i++){

            if(Character.isLowerCase(s.charAt(i))){
                count++;

            }
        }
        if(count>0){
            System.out.println(count);
        }
        else{
            System.out.println("No lower case character are present");
        }
    }
}
