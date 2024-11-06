
import java.util.Scanner;
//* Find the palindrome words from the sentence and print them and also count
// *
// * Input:
// * ----------------
// * My name is nitin and I can speak malayalam
// *
// * Output:
// * ----------------
// * nitin
// * I
// * malayalam
// * 3
// */
public class palindromeWordsInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[]=s.split(" ");

        int palindromeCount = 0;
        for(String words:arr){
            if(isPalindrome(words)){
                System.out.println(words);
                palindromeCount++;
            }
        }
        if(palindromeCount==0){
            System.out.println("No such palindrome words");
        }
        else{
            System.out.println(palindromeCount);

        }




    }
    public static boolean isPalindrome(String s){
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
