package BasicPrograms;

class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}
class Dog extends Animal{
    public void displayInfo(){
        System.out.println("My name is "+name);
    }
}

public class Inheritance {
	public static void main(String[] args){
        Dog puppy=new Dog();
        puppy.name="Lambardor";
        puppy.displayInfo();
        puppy.eat();
    }

}
