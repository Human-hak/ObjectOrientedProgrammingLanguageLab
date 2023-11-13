package First;
import java.util.Scanner;

class InvalidParameterException extends Exception{

    @Override
    public String toString()
    {
        return "InvalidParameterException";
    }
}

public class MyProgram {

    public static int myFunction(int a, int b) throws InvalidParameterException
    {
        if(a<0 || b<0)
        {
            throw new InvalidParameterException();
        }
        return  a+b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        try{
            int result = myFunction(a,b);
        }catch (InvalidParameterException ex)
        {
            System.out.println(ex);
        }

    }
}
