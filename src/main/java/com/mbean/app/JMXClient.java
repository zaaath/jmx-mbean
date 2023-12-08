package com.mbean.app;

import javax.management.*;
import javax.management.remote.*;

public class JMXClient {
  public static void main(String[] args) {
    String port = args[0];
    System.out.println("Port: " + port);

    try {
      // Define the JMX service URL for the MBean server
      JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://127.0.0.1:" + port + "/jmxrmi");

      // Connect to the MBean server
      JMXConnector jmxc = JMXConnectorFactory.connect(url, null);

      // Get MBean server connection
      MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();

      // ObjectName should be same as your MBean name
      ObjectName mbeanName = new ObjectName("com.mbean.app:type=SampleProvider");

      // Get MBean proxy instance that will be used to make calls to registered MBean
      SampleProviderMBean mbeanProxy = JMX.newMBeanProxy(mbsc, mbeanName, SampleProviderMBean.class, true);

      // Now, you can use the proxy to access the MBean
      String message = mbeanProxy.getMessage();
      System.out.println("Message: " + message);

      // Close the connection
      jmxc.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
