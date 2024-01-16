package hello;

import org.joda.time.LocalTime;

public class myapp {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("This is a JAVA app , TIME" + currentTime);
    GreetHello greeter = new GreetHello();
    System.out.println(greeter.sayHello());
  }
}