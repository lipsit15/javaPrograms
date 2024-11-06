import java.util.Scanner;

public class countVCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int v = 0;
        int d = 0;
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'){
                    v++;
                }
                else{
                    c++;
                }

            }
            else if(Character.isDigit(ch)){
                d++;
            }
        }
        System.out.println("Consonants: "+c);
        System.out.println("Vowels: "+v);
        System.out.println("Digits: "+d);
    }
}
