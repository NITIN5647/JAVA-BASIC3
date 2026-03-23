public class code111 {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        // BankAccount  myAcc=new BankAccount();
        // myAcc.username="shradhakapra";
        // myAcc.Password("abcdefghi");
        
    }

    
}
// class BankAccount{
//     public String username;
//     private String Password;
//     public void setpassword(String pwd){
//         password=pwd;
//     } 
// }
class pen{
    String color;
    int tip;
    String getcolor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        color=newcolor;
    }
    void setTip(int newTip){
        tip=newTip;

    }
}
// class Student{
//     String name;
//     int age;
//     float percentage;
//     void calcpercentage(int phy,int chem, int math){
//         percentage=(phy+chem+math)/3;
//     }

// }
