package Java.ThreadsAndConcurrency;

import java.io.IOException;

public class ThreadDemo {
  public static void main(String[] args) throws IOException {
    Incrementer u = new Incrementer();
    u.start();
    System.out.println("Press enter to get latest value of i");
    for (;;) {
      System.in.read();
      System.out.println("From main "  + u.i);
    }
  }


}
