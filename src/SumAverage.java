/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    int sum = 0;
    for (int i = lowerBound; i<=upperBound; i++){
      sum += i;
    }
    return sum;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    int sum = 0;
    for (int i: numbers){
      sum += i;
    }
    // TODO fill in code here using for each loop and replace the return statement
    return sum;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    // TODO fill in code here using while loop and replace the return statement
    double sum = 0;
    for (int i = lowerBound; i<=upperBound; i++){
      sum += i;
    }
    if (lowerBound == upperBound){
      return lowerBound;
    }
    else {
      return sum/(upperBound-lowerBound+1);
    }
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    double sum = 0;
    int count = 0;
    for (int i: numbers){
      sum += i;
      count++;
    }
    if (count !=0){
      return sum/count;
    }
    else {
      return 0;
    }
  }
}