package gr.aueb.cf.ch15.abstract_classes;

public class Cat extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("Cat is eating meat");
    }

    @Override
    public void speak() {
        System.out.println("Meow!");

    }
}
