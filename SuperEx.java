class Animal {

   void sound(){
      
		System.out.println("animal makes a sound");
 	}
}
class Dog extends Animal {
		@Override
		void sound(){
			super.sound();
			System.out.println("dog barks");
   }
}

public class SuperEx {
 public static void main(String args[])
 {
   Dog d=new Dog();
   d.sound();
}
}