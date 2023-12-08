package com.mbean.app;
import javax.management.*;
import java.lang.management.ManagementFactory;

/**
 * Hello world!
 *
 */
public class JMXServer
{
    public static void main( String[] args )
    {
        System.out.println("Starting MBean server...");

        try {
          MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
          ObjectName name = new ObjectName("com.mbean.app:type=SampleProvider");
          SampleProvider mbean = new SampleProvider();
          mbs.registerMBean(mbean, name);
        } catch (Exception e) {
          System.out.println(e);
        }

        System.out.println("Waiting forever...");

        try {
          Thread.sleep(Long.MAX_VALUE);
        } catch (Exception e) {
          System.out.println(e);
        }
    }
}
