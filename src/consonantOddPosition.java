import java.util.Scanner;

public class consonantOddPosition {
    public static void main(String[] args){
//        consonant in odd position
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((i+1)%2!=0){
                if(isConsonant(ch)){
                    System.out.print(ch+" ");
                }

            }
        }

    }
    public static boolean isConsonant(char ch){
        ch = Character.toLowerCase(ch);
        return  Character.isLetter(ch) && "aeiou".indexOf(ch)==-1;
    }
}
