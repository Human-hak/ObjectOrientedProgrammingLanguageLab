class Animal{
    protected String name;
    protected int age;

    public Animal(String name)
    {
        this.name = name;
    }

    public void eat()
    {
        System.out.println("The animal is eating.");
    }

    public void sleep()
    {
        System.out.println("The animal is sleeping.");
    }
}

class Mammal extends Animal{
    private String furColor;

    public Mammal()
    {
        super("Mammal");
    }

    @Override
    public void eat()
    {
        System.out.println("The mammal is eating its favorite food.");
    }
}

class Bird extends Animal{
    private float wingSpan;

    public Bird()
    {
        super("Bird");
    }

    public void sleep(int hours)
    {
        System.out.println("The Bird is sleeping " + hours + " hours.");
    }
}

class Reptile extends Animal{
    private String scaleColor;

    public Reptile()
    {
        super("Reptile");
    }

    public void crawl()
    {
        System.out.println("The reptile is crawling.");
    }
}

public class Main {
    public static void main(String[] args) {
        Mammal human = new Mammal();
        human.eat();
        human.sleep();

        Bird magpie = new Bird();
        magpie.eat();
        magpie.sleep();
        magpie.sleep(6);
        magpie.sleep(8);

        Reptile snake = new Reptile();
        snake.eat();
        snake.sleep();
        snake.crawl();
    }
}