import java.util.Scanner;

// * Input: pop
// * Output: Palindrome
// *
// * Input: Papa
// * Output: None
public class checkPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(palindrome(s)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


    }
    public static boolean palindrome(String s){
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
