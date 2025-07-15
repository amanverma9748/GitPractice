class perfectNum {

  static boolean isPerfect(int n) 
  {
    int sum = 0;
    for (int i = 1; i <= n - 1; i++) {
      if (n % i == 0)
      {
        sum = sum + i;
      }
    }
    if (sum == n)
      return true;
    else 
      return false;
  }

  public static void main(String[] args) {

    boolean ex1 = isPerfect(6);

    if (ex1 == true) 
    {
      System.out.println("6 is a perfect Number");
    } 
    else
     System.out.println("6 is a perfect Number");
  }
}
