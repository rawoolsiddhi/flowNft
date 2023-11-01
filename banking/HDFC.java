//import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;
// import java.util.function.IntConsumer;
import java.lang.Math;


public class HDFC extends person {

    String branch;
    protected String IFSC;
    protected double amount;
    protected static int security_pin;
    protected int a;
    protected double money;
    protected double Account_Num;
    protected static String user_name;

    

    Scanner sc=new Scanner(System.in);
    
public void create_account(){                                     // savings and current
    System.out.println("_------------------------------------------------------------");
    System.out.println("\n Select your branch: \n 1.Hinjewadi \n 2.Kothrud \n 3.Nigdi \n");  

    int n;
    n=sc.nextInt();

    switch(n){
        case 1:
        System.out.println(" branch = Hinjewadi");
        System.out.println( " IFSC code = HDFC0000794");

        break;

        case 2:
        System.out.println(" branch = Kothrud");
        System.out.println(" IFSC code = HDFC0000149 ");

        break;

        case 3:
        System.out.println(" branch  = Nigdi");
        System.out.println(" IFSC code = HDFC0000185");

        break;

        default:
        System.out.println(" No such bank exits!");


      
    }

     Account_Num =(long)(Math.random()*100000000);
     System.out.println(" Account number:- " + Account_Num+987);



     System.out.println("Enter username");
     user_name=sc.next();

     System.out.println("set four digit security pin");
     a=security_pin=sc.nextInt();

     // for(int i=1;i<1000;i++){
// }
System.out.println("---------------------------------------------------------------");
System.out.println("\ndeposite for first time. ");
System.out.println("Enter security pin");
  security_pin=sc.nextInt();
 if(security_pin==a){ 

System.out.println("Enter amount to deposite");
amount=sc.nextDouble();
System.out.println("Total balance: " + amount);
 }
 else{
    System.out.println("wrong pin");
  }

  person joe = new person();

ArrayList<person> people = new ArrayList<person>();
people.add(joe);



}





   
double c;
//  boolean flag;

public void deposite(){

    // System.out.println("Enter security pin");
    // security_pin=sc.nextInt();
    // if(security_pin==a){ 

        System.out.println("Enter amount to be deposite: ");
        c=sc.nextDouble();
        amount=amount+c;
        System.out.println("amount deposite sucessfully!");
        System.out.println("total balance:" + amount);
    
    // }
    // else  {
    //     System.out.println("wronge pin");
    

    // }

}


double balanced;
public void withdraw_money(){
    
   
    // System.out.println("Enter your security pin: ");
    
    // if(security_pin==a){  
                               
      System.out.println("Enter amount to withdraw: ");
      money=sc.nextDouble();
            if(amount>=money){ 

               balanced=amount-money;
               System.out.println("amount withdraw sucessfully!");
               System.out.println("remaining balance:"+ balanced);
           }
           else{
              
            System.out.println("Insufficient balance");
           }
    // }
    // else{
    //     System.out.println("pin not matched");
    // }
}

public void check_bal(){

    // System.out.println("Enter your security pin:");
    // if(security_pin==a){
       System.out.println("balance ="+ amount); 
    // }
    // else{

    //     System.out.println("pin not matched");
    // }
    
}

public void display_info(){
    // if(security_pin==a){
       
        System.out.println("balance ="+ amount); 
    //  }
    //  else{
 
    //      System.out.println("pin not matched");
    //  }
}





}

