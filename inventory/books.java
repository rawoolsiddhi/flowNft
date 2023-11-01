import java.util.ArrayList;

public class books extends login {


 private static ArrayList<String>list=new ArrayList<>(); 
//  ArrayList<login

 public void additems(String item){
    list.add(item);
 }

 public void bucketlist(){
   
    System.out.println(" Total number of product:"+list.size());

    for(int i=0;i<list.size();i++){

        System.out.println((i+1+list.get(i)));
    }
}

public void modifiylist(int position,String newitem){

    list.set(position,newitem);
    System.out.println("List"+(position +1)+"has been modify");

}
public void remove_1(int position){
    String titem =list.get(position);
    list.remove(position);

}




    
}
