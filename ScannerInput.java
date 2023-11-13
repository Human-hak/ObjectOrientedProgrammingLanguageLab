import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        System.out.println("I : " + i);
        float f = input.nextFloat();
        System.out.println("F : " + f);
        double d = input.nextDouble();
        System.out.println("D : " + d);

        String string1 = input.nextLine();
        string1 = input.nextLine();
        System.out.println("String 1: " + string1);

        input.close();
        }

}