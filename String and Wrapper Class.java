public class Main {
    public static void main(String[] args) {
        //String Class
        String string1 = new String("Hello World");
        String string2 = new String("hello World");
        String string3 = string1;
        System.out.println(string1.length());
        System.out.println(string1.toLowerCase());
        System.out.println(string1.toUpperCase());

        if(string1.equalsIgnoreCase(string2))
        {
            System.out.println("Same");
        }
        else{
            System.out.println("Different");
        }

        //Integer Wrapper Class
        Integer myint = new Integer(34);
        System.out.println(myint);
        System.out.println(myint.toString());
    }
}