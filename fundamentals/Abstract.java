abstract class Animal{
   
   public abstract void sound();
}

public class Dog extends Animal{

   public void sound(){
	System.out.println("Wolf");
   }
   public static void main(String args[]){ 
	Animal obj = new Dog();
	obj.sound();
   }
}