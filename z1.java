class Zajecia {
  public static void main(String[] args) {
    int firstValue = 10;
    int secondValue = 5;

    System.out.println(String.format("%d + %d = %d", firstValue, secondValue, firstValue + secondValue));
    System.out.println(String.format("%d - %d = %d", firstValue, secondValue, firstValue - secondValue));
    System.out.println(String.format("%d * %d = %d", firstValue, secondValue, firstValue * secondValue));
    System.out.println(String.format("%d / %d = %d", firstValue, secondValue, firstValue / secondValue));

    int[] nums = { 4, 8, 2, 10, 1 };
    int sum = 0;

    for (int num : nums) {
      sum += num;
    }

    System.out.println(String.format("Srednia tablicy: %d", sum / nums.length));

    int oddOrEven = 6;

    if (oddOrEven % 2 == 0) {
      System.out.println(String.format("Liczba %d jest parzysta", oddOrEven));
    } else {
      System.out.println(String.format("Liczba %d jest nie parzysta", oddOrEven));
    }
  }
}
