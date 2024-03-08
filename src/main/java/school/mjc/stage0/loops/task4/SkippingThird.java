package school.mjc.stage0.loops.task4;

public class SkippingThird {
  public void printUntilButThird(int lastPrinted) {
    int i = 0;
    do {
      if (lastPrinted <= 0) {
        break;
      }
      if (i % 3 != 0) {
        System.out.println(i);
      }
      i++;
    } while (i <= lastPrinted);
  }
}
