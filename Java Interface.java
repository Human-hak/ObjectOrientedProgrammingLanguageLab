interface Flyable{
    String media = "Sky";
    void fly();
    boolean needFuel();
}
class Bird implements Flyable{
    @Override
    public void fly(){ System.out.printf("Bird can fly in the %s\n", Flyable.media);}
    @Override
    public boolean needFuel() { return false; }
}
class Airplane implements Flyable{
    @Override
    public void fly(){ System.out.printf("Plane can fly in the %s\n", Flyable.media);}
    @Override
    public boolean needFuel() { return true; }
}
public class Main {
    public static void main(String[] args) {
        Bird b = new Bird();
        Airplane a = new Airplane ();
        a.fly();
        b.fly();
    }
}
