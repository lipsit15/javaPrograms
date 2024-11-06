import java.util.Scanner;

public class nonRepeatingCharacter {

    static void printFreq(String s,int n){
        int freq[]=new int[200];
        char st[] = s.toCharArray() ;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                continue;
            }
            else{
                freq[(int)s.charAt(i)]++;
            }
        }
        for(int i=0;i<n;i++){
            if(freq[(int)s.charAt(i)]==1 && st[i]!=' '){
                System.out.print(st[i]+" ");
            }
        }
    }




    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        System.out.print("Non repeating char: ");
        printFreq(s,n);
    }
}
