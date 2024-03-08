package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
  public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
    if (numberToSkip > lastInRow) {
      System.out.println("number to skip is bigger then the last");
    } else if (lastInRow < 0) {
      System.out.println("last number in row is negative");
    } else {
      System.out.println("skipped sum is " + (int) (1 + numberToSkip) * numberToSkip / 2);
      System.out.println("counted sum is " + (int) (numberToSkip + lastInRow + 1) * (lastInRow - numberToSkip) / 2);
    }
  }
}
