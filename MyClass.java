public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=5;
      try{
          int z = x/y;
          System.out.println("Result: " + z);
          int[] array = new int[2];
          array[0] = 30;
      }catch(ArithmeticException ex)
      {
          System.out.println("Divide by Zero. Please give non zero y");
      }
      catch(ArrayIndexOutOfBoundsException ex)
      {
          System.out.println("Array Index is wrong. Please check this");
      }
      finally{
          System.out.println("Finally Block");
      }
    }
}