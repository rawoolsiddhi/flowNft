// import java .util.Scanner;
import java.util.*;
public class login {

    String name;
    int age;
    String address;
    double phone_num;
    String email;
    protected static String User_name;
    static int password;
    int a,b;

    ArrayList<String>list1=new ArrayList<String>();
   
    Scanner sc=new Scanner(System.in);

    public void getdata(){ 
    
        System.out.println("Enter your name:");
        name=sc.next();


        System.out.println("Enter your age:");
        age=sc.nextInt();


        System.out.println("Enter your phone number");
        phone_num=sc.nextInt();                               // validations


        System.out.println("Enter your email address");
        email=sc.next();

        System.out.println("Enter address ");
        address=sc.next();

        System.out.println("Set four digit password");
        password=sc.nextInt();

        System.out.println("Enter username");
        User_name=sc.next();

    }

    // public void login1(){

    //     System.out.println("Enter username");
    //     User_name=sc.next();

    //     System.out.println("Enter password:");
    //     password=sc.nextInt();  
        
    // }

    


public void display(){


    int n;
    String n1;
    n=sc.nextInt();
    n1=sc.next();

    if(n==password && n1==User_name){
    System.out.println("Name:"+ name);
    System.out.println("Age"+age);
    System.out.println("Phone number:"+phone_num);
    System.out.println("Email:"+email);
    System.out.println("Address:"+address);
    }

}
    

}
