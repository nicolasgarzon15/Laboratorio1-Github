public class AddFuntion {
  public static int addTwoNumbers(int a, int b) {
    return a + b;
  }

  public static int addNNumbers(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(addTwoNumbers(1, 2));
    System.out.println(addNNumbers(1, 2, 3, 4, 5));
  }
  
}
