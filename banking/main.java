import java.util.ArrayList;
import java.util.Scanner;
public class Main extends HDFC{

  
    public static void main(String[] args){

        ArrayList<HDFC>list=new ArrayList<HDFC>();
        HDFC obj =new HDFC();
        Scanner sc = new Scanner(System.in);
        boolean flag=false;
        
           
      do{ 
        int h;
        System.out.println("\n 1.login \n 2.create new account");
        h=sc.nextInt(); 
        
        switch(h){
       
                case 1:

                String k;
                int m;
                System.out.println("Enter User name:");
                k=sc.next();
                System.out.print("Enter Security pin:");
                m =sc.nextInt();



                        for(int u=0;u<list.size();u++){
                            int p;
                            // System.out.println("Enter security pin");
                            p=sc.nextInt();
                            list.get(u);
                            if(HDFC.security_pin==p){
                               
                                    
                                
               
                    System.out.println("\n 1.Deposite \n 2.Withdraw money \n 3.check balance \n 4.display account information ");
                    int choice;
                    System.out.println(" Enter your choice:");
                    choice=sc.nextInt();
                    switch(choice){
                        
                       
                        case 1:
                        for(int i=0;i<list.size();i++){
                            int x;
                            System.out.println("Enter security pin");
                            x=sc.nextInt();
                            list.get(i);
                            if(HDFC.security_pin==x){
                        list.get(i).deposite();
                            }
                        } 
        
                        break;
            
                        case 2:

                        
                        for(int i=0;i<list.size();i++){
                            int x;
                            System.out.println("Enter security pin");
                            x=sc.nextInt();
                            list.get(i);
                            if(HDFC.security_pin==x){
                                list.get(i).withdraw_money();
                                    }
                                }
                      
        
                        break;
        
                        case 3:
                        for(int i=0;i<list.size();i++){
                            int x;
                            System.out.println("Enter security pin");
                            x=sc.nextInt();
                            list.get(i);
                            if(HDFC.security_pin==x){
                                list.get(i).check_bal();
                                    }
                                }
                       
        
                        break;
        
                        case 4:
                        for(int i=0;i<list.size();i++){
                            int x;
                            System.out.println("Enter security pin");
                            x=sc.nextInt();
                            list.get(i);
                            if(HDFC.security_pin==x){
                                list.get(i).display();
                                    }
                                }
                       
                       
                    
                            }
       
            }

            else{
                        
                System.out.println("pin not matched!");
                break;
            }
        }

                 break;

                case 2:
                obj.getdata();
                obj.create_account();
                list.add(obj);
        
                
                    System.out.println("\n 1.Deposite \n 2.Withdraw money \n 3.check balance \n 4.display account information ");
                    int choice;
                    System.out.println("Enter your choice:");
                    choice=sc.nextInt();
                    switch(choice){
                        
                       
                        case 1:
                        for(int i=0;i<list.size();i++){
                            int x;
                            System.out.println("Enter security pin");
                            x=sc.nextInt();
                            list.get(i);
                            if(HDFC.security_pin==x){
                        list.get(i).deposite();
                            }
                            // else{
                            
                            // }
                        } 
                        
        
                        break;
            
                        case 2:
                       
                        for(int i=0;i<list.size();i++){
                            int x;
                            System.out.println("Enter security pin");
                            x=sc.nextInt();
                            list.get(i);
                            if(HDFC.security_pin==x){
                                list.get(i).withdraw_money();
                                    }
                                }
                      
        
                        break;
        
                        case 3:
                        for(int i=0;i<list.size();i++){
                            int x;
                            System.out.println("Enter security pin");
                            x=sc.nextInt();
                            list.get(i);
                            if(HDFC.security_pin==x){
                                list.get(i).check_bal();
                                    }
                                }
                       
        
                        break;
        
                        case 4:
                        for(int i=0;i<list.size();i++){
                            int x;
                            System.out.println("Enter security pin");
                            x=sc.nextInt();
                            list.get(i);
                            if(HDFC.security_pin==x){
                                list.get(i).display();
                                    }
                                }
                       
                       
                    
                    }
        
                    System.out.println("\n Do you want to continue");
                    System.out.println("1.yes\n2.No");
                    int n1 =sc.nextInt();
                    if(n1==1){
                        flag=true;
        
                    }
                    else if(n1==2){
                        flag=true;
        
                    }

                    
        
                
                // break;


            }
            System.out.println("\n Do you want to continue");
            System.out.println("1.yes\n2.No\n 3.back to home page.");
            int n1 =sc.nextInt();
            if(n1==1){
                flag=true;

            }
            else if(n1==2){
                flag=false;

            }
            
            

         }while(flag);
        

            
        
            
        
         
       

    }
    
    
}
