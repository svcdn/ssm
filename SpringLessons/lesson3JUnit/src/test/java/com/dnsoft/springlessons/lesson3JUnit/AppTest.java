package com.dnsoft.springlessons.lesson3JUnit;

import org.junit.Assert;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//需要spring-test包
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置类
@ContextConfiguration(classes=CDPlayerConfig.class)
public class AppTest {
	
	 
	@Autowired
	private MediaPlayer player;
	   
	@Autowired
	private CompactDisc cd;
	  
	@Test
    public void testApp()
    {
		System.out.println("junit 4.12 test");
        Assert.assertEquals("hello", App.getStr());
    }
	
	@Test
	public void cdShouldNotBeNull() {
		Assert.assertNotNull(cd);
		//cd.play();
	}
	
	@Test
	public void play() {
		Assert.assertNotNull(player);
	    player.play();
	    
	}
}

