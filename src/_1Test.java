import java.util.Scanner;

public class _1Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        boolean result= isPalindrome(s,l);
        System.out.println(result);

    }
    public static boolean isPalindrome(String s,int l){
        int i=0;
        int j=l-1;
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
