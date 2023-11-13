class Parent{
    public void parentMethod()
    {
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    @Override
    public void parentMethod()
    {
        System.out.println("Child's override method");
    }
}

class OtherChild extends Parent{
    @Override
    public void parentMethod()
    {
        System.out.println("Other Child Parent Method");
    }
}

class GrandChild extends Child {
    public void parentMethod()
    {
        System.out.println("Grand Child Parent Method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        OtherChild oc = new OtherChild();
        GrandChild gc = new GrandChild();

        p.parentMethod();
        c.parentMethod();
        oc.parentMethod();
        gc.parentMethod();

        Parent p1;
        p1 = c;
        p1.parentMethod();
        p1 = gc;
        p1.parentMethod();
    }
}