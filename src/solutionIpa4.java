import java.util.Scanner;
public class solutionIpa4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        College[] college=new College[n];
        for(int i=0;i<college.length;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            String d = sc.nextLine();
            int e = sc.nextInt();
            college[i]=new College(a,b,c,d,e);

        }
        sc.nextLine();
        String address = sc.nextLine();
        College pin = findCollegeWithMaximumPinCode(college);
        if(pin!=null){
            System.out.println("ID : "+pin.getId());
            System.out.println("name : "+pin.getName());
            System.out.println("contactNo : "+pin.getContactNo());
            System.out.println("address : "+pin.getAddress());
            System.out.println("pinCode : "+pin.getPinCode());

        }
        else{
            System.out.println("No college found with mentioned Attribute");
        }
        College add = searchCollegeByAddress(college,address);
        if(add!=null){
            System.out.println("ID : "+add.getId());
            System.out.println("name : "+add.getName());
            System.out.println("contactNo : "+add.getContactNo());
            System.out.println("address : "+add.getAddress());
            System.out.println("pinCode : "+add.getPinCode());
        }
        else{
            System.out.println("No college found with mentioned Attribute");
        }


    }
    public static College findCollegeWithMaximumPinCode(College[] college){
        int max  = 0;
        for(int i=0;i<college.length;i++){
            if(college[i].getPinCode()>max){
                max=college[i].getPinCode();
            }
        }
        for(int i=0;i<college.length;i++){
            if(college[i].getPinCode()==max){
                return college[i];
            }
        }
        return null;
    }
    public static College searchCollegeByAddress(College[] college,String add){
        for(int i=0;i<college.length;i++){
            if(college[i].getAddress().equalsIgnoreCase(add)){
                return college[i];

            }
        }
        return null;
    }

}
class College{
    int id;
    String name;
    int contactNo;
    String address;
    int pinCode;

    public College(int id,String name,int contactNo,String address,int pinCode){
        this.id = id;
        this.name = name;
        this.contactNo=contactNo;
        this.address = address;
        this.pinCode=pinCode;

    }
//    getters and setters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getContactNo(){
        return contactNo;
    }
    public String getAddress(){
        return address;
    }
    public int getPinCode(){
        return pinCode;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setContactNo(int contactNo){
        this.contactNo=contactNo;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setPinCode(int pinCode){
        this.pinCode=pinCode;
    }
}
