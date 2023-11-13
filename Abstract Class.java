abstract class Animal{
    // instance variables
    protected String name, color;
    double weight;
    // Constructors
    public Animal(){ }
    Animal(String name, String color, double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    Animal(String name, String color){ this(name,color, 0.0); }
    // Concrete methods
    public void eat(){ System.out.println(name + " eats."); }
    // abstract methods
    public abstract void makeSound();
}

class Bird extends Animal{
    public Bird() { name = "Bird"; }
    @Override
    public void makeSound() { System.out.println("Chirp"); }
}
class Tiger extends Animal{
    public Tiger() { name = "Tiger"; }
    @Override
    public void makeSound() { System.out.println("Roar"); }
}


public class Main {
    public static void main(String[] args) {
        Animal b = new Bird();
        Animal t = new Tiger();
        b.eat();
        t.eat();
        b.makeSound();
        t.makeSound();
    }
}