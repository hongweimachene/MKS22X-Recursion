public class recursion{
  /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
  public static double sqrt(double n, double tolerance){
    double guess = n / 2;
    return sqrtH(guess, n);
  }

  private static double sqrtH(double guess, double orig, double tolerance){
    if ((!(guess * guess < (1+tolerance) * orig)){
      return sqrt(orig / guess + guess) / 2, orig);
    } else {
      return guess;
    }
  }
  /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
  public static int fib(int n){

  }

  /*As Per classwork*/
  public static ArrayList<Integer> makeAllSums(){

  }

}
