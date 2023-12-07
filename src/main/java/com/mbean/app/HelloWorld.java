package com.mbean.app;

public class HelloWorld implements HelloWorldMBean {
  public void sayHello() {
    System.out.println("Hello, world (HelloWorldMBean)!");
  }
}
