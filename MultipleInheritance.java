class Animal{

}

interface Flyable{
    void fly();
}

interface WithFeather{

}

//Multiple Inheritance with one class and one interface
class Bird1 extends Animal implements Flyable{
    public void fly()
    {
        System.out.println("Bird is flying");
    }
}

//Multiple Inheritance with two interfaces
class Bird2 implements Flyable, WithFeather{
    public void fly()
    {
        System.out.println("Bird is flying");
    }
}

//Multiple Inheritance with one class and two interfaces
class Bird3 extends Animal implements Flyable, WithFeather{
    public void fly()
    {
        System.out.println("Bird is flying");
    }
}

public class Main {
    public static void main(String[] args) {

    }
}