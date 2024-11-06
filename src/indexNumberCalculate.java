import java.util.Scanner;

public class indexNumberCalculate {
    public static void main(String args[]){

//        Carrot - a
//        index of a

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        int c = 0;

        for(int i=0;i<s.length();i++){
            if(ch==s.charAt(i)){
                System.out.println(i);
                c++;
                break;
            }
        }
        if(c==0){
            System.out.println("NA");
        }




    }
}
