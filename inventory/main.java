import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.Scanner;
public class main{
     public static void main(String[] args){


        ArrayList<String>com_list=new ArrayList<String>();
        ArrayList<buy> B=new ArrayList<>();

        Scanner sc =new Scanner(System.in);
        buy obj =new buy();
        boolean flag=false;
        
        do{
        System.out.println("\n 1.login \n 2.create \n 3.admin longin");
        int q;
        q=sc.nextInt();
        switch(q){
            case 1:
                obj.display();
                for(int i=0;i<com_list.size();i++){
                    int x;
                    com_list.get(i);
                    
                }
                // System.out.println("Enter password");
                // int n;
                // n=sc.nextInt();
                //     for(int i=0;i<B.size();i++){
                //         if(n==password[1]){
                //        B.get(i);
                //         }
                       
                       
                    // } 
             break;

             case 2:                                            //create
             
            obj.getdata();
            for(int i=0;i<com_list.size();i++){
                int x;
                com_list.get(i);
                
            }
            
            for(int i=0;i<B.size();i++){
                int x;
                    B.add(obj);
                
            }
            B.add(obj);
             System.out.println("---------------------------------------------------------------");
             obj.addItem();
             System.out.println("---------------------------------------------------------------");
             System.out.println(" 1.remove item from list. \n 2.continue ");
             int w;
             w =sc.nextInt();
        
             if(w==1){
             
             obj.bucketlist();
             System.out.println(" 1.remove");
             System.out.println("Enter which to remove:");
             obj.remove();
             
             
             }
             
             else if(w==2){
                obj.bucketlist();
                obj.purchasing();
                System.out.println();

                

             }
             
             
             case 3:

             obj.admin();
             break;


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

