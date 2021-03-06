import java.util.ArrayList;
public class recursion{
  /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
  public static double sqrt(double n, double tolerance){
    return sqrtH(n, n, tolerance);
  }

  private static double sqrtH(double guess, double orig, double tolerance){
    //base case
    if (orig == 0) return orig;
    //checking if within error tolerance
    if (guess * guess < (1+tolerance) * orig){
      return guess;
    } else {
      //recursive call with the converging value
      return sqrtH((orig / guess + guess) / 2, orig, tolerance);
    }
  }
  /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
  public static int fib(int n){
    //starting recursion from the base cases to get to the nth term
    return fibH(n,0,1);
  }

  //m is Fib(n - 2) and o is Fib(n - 1) for the next term
  private static int fibH(int n, int m, int o){
    //base case
    if (n == 0) {
      return m;
    }
    //base case
    //return o which is Fib(n)
    if (n == 1) {
      return o;
    }
    //to generate next term, swap Fib(n-2) with Fib(n-1) and Fib(n-1) with Fib(n-2) + Fib(n-1), therefore m + o would be Fib(n), do this for n-1 times
    return fibH(n-1, o, m + o);
  }

  /*As Per classwork*/
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> f = new ArrayList<Integer>();
    //helper method modifies the list
    makeAllSumsH(n, f, 0);
    return f;
  }

  private static boolean makeAllSumsH(int n, ArrayList<Integer> f, int sum){
    //base case once the number counts down to 0 you return the sum
    if (n == 0) {
      //to prevent duplicate sums
      //if (!(f.contains(sum))){
        f.add(sum);
      //}
      return true;
    }
    //recursive call when the number is still counting down to 0
    if (n > 0) {
      //used && operator since you want both values, it will short circuit with ||
      return makeAllSumsH(n-1, f, sum+n) && makeAllSumsH(n-1, f, sum);
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(sqrt(10,.00001));
    System.out.println(sqrt(100,.00001));
    System.out.println(sqrt(2,.00001));
    System.out.println(sqrt(49,.00001));
    System.out.println(sqrt(22,.00001));
    System.out.println(sqrt(0, .00001));
    System.out.println(fib(6));
    System.out.println(fib(4));
    System.out.println(fib(0));
    System.out.println(makeAllSums(3));
    System.out.println(makeAllSums(4));
    System.out.println(makeAllSums(5));
  }
}
