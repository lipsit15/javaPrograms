import java.util.Scanner;

public class wordBeginWithVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int count=0;
        for(int i=0;i< arr.length;i++){
            char d = arr[i].charAt(0);
            if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u'||d=='A'||d=='E'||d=='I'||d=='O'||d=='U'){
                count++;
            }
        }
        System.out.println("output: "+count);
    }
}
