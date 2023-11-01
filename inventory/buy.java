import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
import java.util.*;

public class buy extends books {

    
    private  books list= new books();
    books obj =new books();

    ArrayList<books> B=new ArrayList<>();
    
    

    Scanner sc =new Scanner(System.in);
    boolean flag;
    int price=0;
   
public void addItem(){

    
   do{ 
    System.out.println("Select book to add in bucket list:");
    System.out.println(" 1.Alchemist\n 2.killing mocking bird \n 3.The girl in room 105 \n 4.five friends\n 5.Thousands spendid sons\n 6.veronika decides to die");

    int n, quantity;;
    n =sc.nextInt();
    int stock=100;
    int stock1=100;
    int stockG=50;
    int stockF=60;
    int stockT=109;
    int stockV=17;
    switch(n){
        case 1:
        System.out.println("-----------------------------------------------"); 
        System.out.println("enter number of quantity:");
        quantity=sc.nextInt();
        price =price+350*(quantity);
        stock=stock-quantity;
        System.out.println("\nTotal stock remaining: "+stock);
        System.out.println("Total price = "+price);
        obj.additems("Alchemist");

        break;

        case 2:
        System.out.println("-----------------------------------------------"); 
        System.out.println("enter number of quantity:");
        
        
        
        quantity=sc.nextInt();
        price =price+400*(quantity);
        stock1=stock1-quantity;
        System.out.println("\nTotal stock remaining of killing moking bird: "+stock);
        System.out.println(" Total price = "+price);
        obj.additems(" killing mocking bird");
        break;

        case 3:
        System.out.println("-----------------------------------------------"); 
        System.out.println("Enter number of quantity:");
        quantity=sc.nextInt();
        price =price+350*(quantity);
        stockG=stock-quantity;
        System.out.println("\nTotal stock remaining: "+stock);
        System.out.println(" Total price = "+price);
        obj.additems("The girl in room 105");

        break;

        case 4:
        System.out.println("-----------------------------------------------"); 
        System.out.println("Enter number of quantity:");
        quantity=sc.nextInt();
        price =price+350*(quantity);
        stockF=stock-quantity;
        System.out.println("\nTotal stock remaining: "+stock);
        System.out.println("Total price = "+price);
        obj.additems(" Five friends");
        break;

        case 5:
        System.out.println("-----------------------------------------------"); 
        System.out.println("Enter number of quantity:");
        quantity=sc.nextInt();
        price =price+350*(quantity);
        stockT=stock-quantity;
        System.out.println("\nTotal stock remaining: "+stock);
        System.out.println("Total price = "+price);
        obj.additems("Thousands spendid sons ");
        break;

        case 6:
        System.out.println("-----------------------------------------------"); 
        System.out.println("Enter number of quantity:");
        quantity=sc.nextInt();
        price =price+350*(quantity);
        stockV=stock-quantity;
        System.out.println("-----------------------------------------------"); 
        System.out.println("\nTotal stock remaining: "+stock);
        System.out.println("Total price = "+price);
        obj.additems("Veronika decides to dei ");
        


    }
    System.out.println("\n Do you want to continue shopping");
            System.out.println(" 1.yes \n 2.No,continue to payment.");
            int n1 =sc.nextInt();
            if(n1==1){
                flag=true;

            }
            else if(n1==2){
                flag=false;

            }
}while(flag);

}
public void remove(){

    System.out.println("----------------------------------------------------------------------");
    System.out.println( " Enter item number");
    int k=sc.nextInt();
    sc.nextLine();
    list.remove_1(k-1);
 }

 public void purchasing(){

    int Total_price =price;
    System.out.println(" Total price: "+price);
    System.out.println("\n 1.Online 2.After delivery");
    System.out.println(" Select an payment method:");
    int e;
    e=sc.nextInt();
    switch(e){
        case 1:
        int n,n1;
        System.out.println(" select:");
        System.out.println("\n 1.bank  2.UPI");   //recept
        n1=sc.nextInt();
        System.out.println("confirm order: ");
        System.out.print(" 1.yes   2.No");
        n=sc.nextInt();
        if(n==1){
            System.out.println("--------------------------------------------------------");
            bucketlist();
            System.out.println("payment method: Bank");
            System.out.println("Total price: "+price);
            System.out.println("Amount remaining: 00");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\nyyyy/MM/dd \nHH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            System.out.println("\nOrder confirm ");
            System.out.println("---------------------------------------------------------");
        }
        else{

            System.out.println("\n Transection cancelled.\n better shop next time!");
            break;
        }

        break;
        case 2:
        System.out.println("confirm dilery");
        System.out.println("\n 1.yes \n 2.No");
        n=sc.nextInt();
        if(n==1){
            System.out.println("---------------------------------------------------------");
            bucketlist();
            System.out.println("\nTotal price: "+price);
            System.out.println("Amount remaining:" +price);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\nyyyy/MM/dd \nHH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            System.out.println("\nOrder confirm ");
            System.out.println("---------------------------------------------------------");

        }
        else{

            System.out.println("better shop next time!");
            break;
        }

        break;
    }

 }


// public void login(){
              
    // String f;
    // int r;
//     System.out.println("Enter username");
//     f=sc.next();; 
           
//     System.out.println("Enter password");
//     r=sc.nextInt(); 

//     // if(password==r && User_name==f){

//     //     obj.display();
//     // }
// }


public void admin(){
    
    System.out.println("Enter username");
    User_name=sc.next();
    System.out.println("Enter password");
    password=sc.nextInt();
   if(User_name=="qwerty" && password==1234){

    System.out.println("1.All product list \n2.remove \n3.modify 4.profitlose");
    System.out.println("Enter choice");
    int q;
    q=sc.nextInt();
    switch(q){
        case 1:
        bucketlist();
    
        case 2:
        remove();

        case 3:
        System.out.println("Enter username:");
        User_name=sc.next();
        modifiylist(q, User_name);
       
        case 4:

    }
   }
}

    
}
