package Java.ThreadsAndConcurrency;

public class Incrementer extends Thread{
  public volatile int i = 10;
  @Override
  public void run() {
    for (;;) {
      i++;
      System.out.println(i);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
