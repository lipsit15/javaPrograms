import java.util.Scanner;

public class countReqWord {
//    count requested word present in the string
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String word = sc.nextLine();

//       text.split(word.-1) splits the string by the word
        int count = text.split(word,-1).length-1;

//        if case-sensitive then use below
//        int count = text.toLowerCase().split(word.LowerCase(),-1)


        System.out.println(count);
    }
}
