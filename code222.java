public class code222 {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        
        BankAccount myAcc=new BankAccount();
        myAcc.username=("shradhakhapra");
        myAcc.password("acdhggfj");
        


    } 
    
}

class BankAccount{
public String username;
private String password;
public void setPassword(String pwd){
    password=pwd;
}
}

//     String getcolor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;

//     }
//     void setcolor(String newcolor){
//         this.color;
//     }

//     int getTip(){
//         return this.tip;
//     }

//     void setcolor(String newcolor){
//         this.color=newcolor;
//     }

//     void setTip(int tip){
//         this.tip=tip;
//     }
// }



