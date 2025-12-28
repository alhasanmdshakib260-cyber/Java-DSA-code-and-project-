package company.com;
abstract class Animal{
    abstract void sound ();

}
class Cat extends  Animal{
    void sound(){
        System.out.println("Mew Mew");

    }
}
 class Dog extends Animal{
    void sound(){
        System.out.println("Ghew Ghew");

    }

 }

public class Abstract {
    public static void main(String[] args){
        Cat cat=new Cat();
        cat.sound();
        Dog dog=new Dog();
        dog.sound();

    }
}
