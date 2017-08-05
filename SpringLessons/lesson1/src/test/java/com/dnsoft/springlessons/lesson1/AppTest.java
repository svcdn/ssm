package com.dnsoft.springlessons.lesson1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ){
    	
        super( testName );
        
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
    	
        return new TestSuite( AppTest.class );
        
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp(){
    	
        Assert.assertEquals("hello", App.getHello());
        
        //常规方式创建对象
        HelloWorld hw = new HelloWorld();
        hw.setName("Jackie");
        Assert.assertEquals("Hello: Jackie", hw.getHello());
        
        //IOC创建对象,beans.xml放入资源文件夹
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld iocHw = (HelloWorld) ctx.getBean("helloWorld");
        Assert.assertEquals("Hello: Jackie", iocHw.getHello());
        
        Car c = (Car)ctx.getBean("car");
        System.out.println(c);
        
        User user = (User) ctx.getBean("user");
        System.out.println(user);
        
        ctx.close();
        
    }
}
