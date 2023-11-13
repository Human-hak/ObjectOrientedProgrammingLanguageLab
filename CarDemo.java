class Point{
    private float x,y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}

class Car{
    private Point position;

    public Car(float x, float y)
    {
        this.position = new Point(x,y);
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void move_forward(float amount)
    {
        position.setX(position.getX() + amount);
        position.setY(position.getY() + amount);
    }
}
public class Main {
    public static void main(String[] args) {
        Car[] allcars = new Car[10];
        for(int i=0;i<10;i++)
        {
            allcars[i] = new Car(i*0.5f, i*0.2f);
        }

        for(Car car: allcars)
        {
            System.out.println("Car " + car.getPosition().getX() + " , " + car.getPosition().getY());
        }

        for(Car car : allcars)
        {
            car.move_forward(0.2f);
        }

        for(Car car: allcars)
        {
            System.out.println("Car " + car.getPosition().getX() + " , " + car.getPosition().getY());
        }
    }
}