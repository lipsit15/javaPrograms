import java.util.Scanner;

public class countUpperCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int count  = 0;
        for(int i=0;i<s.length();i++){
//            if(Character.isUpperCase(s.charAt(i))){
//                count++;
//            }
            if(s.charAt(i)>=65 && s.charAt(i)<=92){
                count++;
            }
        }
        if(count==0){
            System.out.println("No uppercase");
        }
        else{
            System.out.println("The upperCase count is: "+count);
        }
    }
}
