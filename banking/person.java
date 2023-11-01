import java.util.ArrayList;
import java .util.Scanner;
public class person {

// private static ArrayList<String>list=new ArrayList<>();

//  public void additems(String item){
//     list.add(item);
//  }

    
    String name;
    int age;
    String gender;
    String DOB;
    protected double phone_no;
    protected String address;
    protected double aadhar_no;
    protected String pan_no;
    private String email;


    Scanner sc=new Scanner(System.in);

 public void getdata(){ 
    
    System.out.println("Enter your name:");
    name=sc.next();

    do{                                                           // exception
         System.out.println("Enter your age:");
         age=sc.nextInt();

                  if(age<18 && age>100){
                       System.out.println("Not eligible!");
                  }
    }while(age<=18 && age>100);
    

   // do{                                                           // exception 
       System.out.println("Enter your gender");              
    gender=sc.next();
   // }while(gender==)
   
   
    //do{
      System.out.println("dd-mm-yyyy");
       DOB=sc.next();
   
    
   //}while();      if char
   


    System.out.println("Enter your address");
    address=sc.next();

    System.out.println("Enter your phone number");
   //  do{
    for(double i=1;i<=10;i++){
     i=(phone_no=sc.nextDouble());
    }                                                          //incomplete
   // }while();

               

   // System.out.println("invalid,should be 10 digit! \n Reenter");
                               

   
    System.out.println("Enter your Aadhar number:");
    aadhar_no=sc.nextDouble();

    System.out.println("Enter your pan_card number");
    pan_no=sc.next();



 }

 public void display(){

   // System.out.println("Details: ");
    System.out.println("Name: "+name );
    System.out.println("Age: "+age);
    System.out.println("Gender: "+gender);
    System.out.println("Date of birth: "+DOB);
    System.out.println("Aadhar no. :"+ aadhar_no);
    System.err.println("Pan card no. :"+pan_no);

 }





}
