package com.mbean.app;

import java.util.Timer;
import java.util.TimerTask;

public class SampleProvider implements SampleProviderMBean {
  private String message = "Initial Message";
  private int counter = 0;
  private Timer timer;

  public SampleProvider() {
    startCounterUpdateTask();
  }

  private void startCounterUpdateTask() {
    timer = new Timer();
    timer.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        System.out.println("Counter: " + counter);
        setMessage("Counter: " + counter);
        counter++;
      }
    }, 0, 500);
  }

  public void sayHello() {
    System.out.println("Hello, world (HelloWorldMBean)!");
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
