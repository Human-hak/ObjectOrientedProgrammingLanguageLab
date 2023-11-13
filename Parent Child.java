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
        System.out.println(this.childVariable);
        System.out.println(super.parentVariable);
        System.out.println(parentVariable);
        parentMethod();
        System.out.println("Child Method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent myparent = new Parent();
        myparent.parentMethod();

        Child mychild = new Child();
        mychild.childMethod();
    }
}