import java.util.Scanner;
import java.util.Arrays;
public class solutionIpa24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Inventory[] inventory=new Inventory[4];
        for(int i=0;i<inventory.length;i++){
            String a = sc.nextLine();
            int b = sc.nextInt();sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            inventory[i]=new Inventory(a,b,c,d);
        }
        int limit = sc.nextInt();sc.nextLine();
        Inventory[] ans1=Replenish(inventory,limit);
        if(ans1!=null){
            for(int  i=0;i<ans1.length;i++){
                if(ans1[i].getThreshold()>75){
                    System.out.println(ans1[i].getInventoryId()+" Critical Filling");
                }
                else if(ans1[i].getThreshold()<75 && ans1[i].getThreshold()>50){
                    System.out.println(ans1[i].getInventoryId()+" Moderate Filling");
                }
                else{
                    System.out.println(ans1[i].getInventoryId()+" Non-Critical Filling");
                }
            }
        }

    }
    public static Inventory[] Replenish(Inventory[] inventory,int l){
        Inventory[] arr = new Inventory[0];
        for(int i=0;i<inventory.length;i++){
            if(l>=inventory[i].getThreshold()){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=inventory[i];
            }
        }
        if(arr.length>0){
            return arr;
        }
        else{
            return null;

        }

    }
}
class Inventory{
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}
