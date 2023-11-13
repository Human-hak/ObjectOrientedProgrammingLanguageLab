class Parent{
    public int parentVariable = 18;
    public void parentMethod()
    {
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    public int childVariable = 12;
    public void childMethod()
    {
        parentMethod();
        System.out.println("Child Method");
    }

    @Override
    public void parentMethod()
    {
        System.out.println("Override Method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent myparent = new Parent();
        //myparent.parentMethod();

        Child mychild = new Child();
        //mychild.childMethod();
        mychild.parentMethod();
    }
}