import java.util.Scanner;

public class lastChar {
    public static void main(String[] args){
//        last char of each word in a sentence
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                System.out.print(s.charAt(i-1));
            }
            else if(i==s.length()-1 && Character.isAlphabetic(s.charAt(i))){
                System.out.print(s.charAt(i));
            }
        }

    }
}
