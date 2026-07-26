class pattern {
  public static void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        int exponent = 1 << (i - j + 1);
        int value = (int) Math.pow(j, exponent);
        System.out.print(value + " ");

      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printPattern(4);
  }
}
