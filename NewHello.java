package problems;

//Java program to initialize the values from one object to another object.  
public class NewHello{  
  int id;  
  String name;  
  //constructor to initialize integer and string  
  NewHello(int i,String n){  
  id = i;  
  name = n;  
  }  
//constructor to initialize another object  
  NewHello(NewHello s){  
  id = s.id;  
  name =s.name;  
  }  
  void display(){System.out.println(id+" "+name);}  
  public static void main(String args[]){  
  NewHello s1 = new NewHello(1,"Anvita"); 
  NewHello s2 = new NewHello(s1);  
  s1.display();  
  s2.display();  
 }  
}  
