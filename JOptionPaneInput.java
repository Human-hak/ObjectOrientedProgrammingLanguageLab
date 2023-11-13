import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter Integer input:");
        int i = Integer.parseInt(input);
        System.out.println("I: "+ i);
    }
}