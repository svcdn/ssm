package com.dnsoft.springlessons.lesson2;

import java.sql.SQLException;

import javax.sql.DataSource;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws Exception 
     */
    public void testApp() throws Exception
    {
    	//testJDBCConfiguration();
    }
    
    
    public void testJDBCConfiguration() throws SQLException {
    	ClassPathXmlApplicationContext act=new ClassPathXmlApplicationContext("beans.xml");
        DataSource dataSource = (DataSource) act.getBean("dataSource");
        System.out.println(dataSource.getConnection());
        act.close();
        
        /*ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans1.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        User u = new User();
        u.setUserName("new user");
        userService.addNew(u);
        ctx.close();*/
    	System.out.println("test run");
    }
}
