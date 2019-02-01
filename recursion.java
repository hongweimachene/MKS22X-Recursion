public class recursion{
  /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
  public static double sqrt(double n, double tolerance){
    if (n == 0) return n;
    return sqrtH(n, n, tolerance);
  }

  private static double sqrtH(double guess, double orig, double tolerance){
    if (guess * guess < (1+tolerance) * orig){
      return guess;
    } else {
      return sqrtH((orig / guess + guess) / 2, orig, tolerance);
    }
  }
  /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
  public static int fib(int n){
    return fibH(n, n);
  }

  private static int fibH(int n, int m){
    if (m > 0) {
      return fibH(n-1,n-2);
    } else {
      return n + m;
    }
  }

  // /*As Per classwork*/
  // public static ArrayList<Integer> makeAllSums(){
  //
  // }
  public static void main(String[] args) {
    System.out.println(sqrt(10,.00001));
    System.out.println(sqrt(100,.00001));
    System.out.println(sqrt(2,.00001));
    System.out.println(sqrt(49,.00001));
    System.out.println(sqrt(22,.00001));
    System.out.println(sqrt(0, .00001));
  }
}
