import java.util.Scanner;

public class _2Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        int count = 0;
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();sc.nextLine();
        }
        int limit1 = sc.nextInt();sc.nextLine();
        int limit2 = sc.nextInt();
        for(int num : arr){
            if(num>limit1 && num<limit2){
                sum+=num;
                count++;
            }

        }
        int avg = (count>0)?(int)sum/count:0;
        System.out.println(avg);

    }
}
